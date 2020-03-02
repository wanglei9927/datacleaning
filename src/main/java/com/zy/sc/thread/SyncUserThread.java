package com.zy.sc.thread;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.base.CharMatcher;
import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.zy.sc.comm.Constant;
import com.zy.sc.entity.PhPerson;
import com.zy.sc.entity.Subjects;
import com.zy.sc.mapper.PhPersonMapper;
import com.zy.sc.mapper.SubjectsMapper;

@Slf4j
@Component
public class SyncUserThread implements Runnable{

	@Resource
	private  SubjectsMapper subjectsMapper;
	
	@Resource
	private PhPersonMapper phPersonMapper;
	
	@Override
	public void run() {
		final Stopwatch stopwatch = Stopwatch.createStarted();

		log.info("===================人员数据同步开始==============");

		List<Subjects> subs = subjectsMapper.selectList(new QueryWrapper<Subjects>().isNull("DeletedUserId"));

		log.info("===================人员同步数据大小[{}]==========",subs.size());
		subs.parallelStream().forEach(sub->{

			//验证当前人是否存在数据库
			LambdaQueryWrapper<PhPerson> lamd = new LambdaQueryWrapper<PhPerson>().eq(PhPerson::getName,sub.getRealName())
					.eq(PhPerson::getBirthday,sub.getBirthday().toLocalDate())
					.eq(PhPerson::getSex,sub.getGender()==1?"01":"02")
					.eq(PhPerson::getOrgId,Constant.ORG_ID);

			List<PhPerson> list = phPersonMapper.selectList(lamd);


			if (list!=null&&list.size()>1){
			    //记录本次结果
				log.error("人员同步失败，导入的人员重复：{}",sub.toString());
				return;
			}

			PhPerson person = userConversionPerson(sub);
			//删除主键重复的数据
			phPersonMapper.deleteById(person.getPersonId());
			phPersonMapper.insert(person);
		});

		log.info("===================人员数据同步结束,耗时[{}]秒==============",stopwatch.elapsed(TimeUnit.SECONDS));
		stopwatch.stop();
	}
	
	public PhPerson userConversionPerson(Subjects sub) {
		
		PhPerson person = new PhPerson();
		String name = sub.getRealName();
		LocalDateTime birthday = sub.getBirthday();
		//1:男，2女
		Integer gender = sub.getGender();

		String code = sub.getCode();
		Integer id = sub.getId();

		LocalDateTime createdDate = sub.getCreatedDate();
		String iDCardNum = sub.getIDCardNum();
		String address = sub.getAddress();
		String company = sub.getCompany();
		String phone = sub.getPhone();
		//存储
		person.setName(name);	
		person.setSex(gender==1?"01":"02");
		person.setBirthday(birthday.toLocalDate());

		//personId = code + id 降低重复概率
		person.setPersonId(code+id);

		person.setCreateDatetime(createdDate);
		person.setIdCard(iDCardNum);
		person.setCurrentAddress(address);

		if (StringUtils.isBlank(company)){
			company="";
		}

		boolean flag = company.contains("2013")
				||company.contains("2014")
				||company.contains("2015")
				||company.contains("2016")
				||company.contains("2017")
				||company.contains("2018")
				||company.contains("2019");



		if (!flag){


		company = company.replace("一年级","1年级");
		company = company.replace("二年级","2年级");
		company = company.replace("三年级","3年级");
		company = company.replace("四年级","4年级");
		company = company.replace("五年级","5年级");
		company = company.replace("六年级","6年级");
		company = company.replace("七年级","7年级");
		company = company.replace("八年级","8年级");
		company = company.replace("九年级","9年级");

			//第一个数字的位置
		int first = CharMatcher.inRange('1', '9').indexIn(company);
		int second = CharMatcher.inRange('1', '9').indexIn(company,first+1);

		StringBuilder  sb = new StringBuilder (company);


		if (first>-1){
			sb.insert(first, '/');
		}
		if (second>-1){
			sb.insert(second+1, '/');
		}

		company = sb.toString();

		}
		person.setCompany(company);
		person.setMobilePhone(phone);
		person.setIsStudent("0");
		person.setDelFlag("0");
		person.setSystemId(Constant.SYSTEM_ID);
		person.setOrgId(Constant.ORG_ID);
		
		return  person;
		
	}

}
