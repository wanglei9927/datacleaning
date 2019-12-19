package com.zy.sc.thread;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
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

		List<Subjects> subs = subjectsMapper.selectList(null);

		log.info("===================人员同步数据大小[{}]==========",subs.size());
		subs.stream().forEach(sub->{
			
			PhPerson person = userConversionPerson(sub);
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
		LocalDateTime createdDate = sub.getCreatedDate();
		String iDCardNum = sub.getIDCardNum();
		String address = sub.getAddress();
		String company = sub.getCompany();
		String phone = sub.getPhone();
		//存储
		person.setName(name);	
		person.setSex(gender==1?"01":"02");
		person.setBirthday(birthday.toLocalDate());
		
		person.setPersonId(code);
		person.setCreateDatetime(createdDate);
		person.setIdCard(iDCardNum);
		person.setCurrentAddress(address);
		person.setCompany(company);
		person.setMobilePhone(phone);
		person.setIsStudent("0");
		person.setDelFlag("0");
		person.setSystemId(Constant.SYSTEM_ID);
		person.setOrgId(Constant.ORG_ID);
		
		return  person;
		
	}

}
