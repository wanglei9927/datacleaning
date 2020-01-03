package com.zy.sc.thread;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CharMatcher;
import com.zy.sc.comm.Constant;
import com.zy.sc.entity.CervicalVertebra;
import com.zy.sc.entity.CervicalVertebraActivity;
import com.zy.sc.entity.Subjects;
import com.zy.sc.mapper.CervicalVertebraActivityMapper;
import com.zy.sc.mapper.CervicalVertebraMapper;
import com.zy.sc.mapper.SubjectsMapper;
import com.zy.sc.utils.ByteConversion;

@Slf4j
@Component
public class SyncCvaThread implements Runnable{

	@Resource
	private CervicalVertebraMapper cervicalVertebraMapper;
	
	@Resource
	private CervicalVertebraActivityMapper cvaMapper;
	
	@Resource
	private SubjectsMapper subjectsMapper;

	@Override
	public void run() {
		final Stopwatch stopwatch = Stopwatch.createStarted();
		//脊柱活动度
		log.info("===================颈椎活动度数据同步开始==============");
		List<CervicalVertebra> cvas = cervicalVertebraMapper.selectList(null);
		log.info("===================获取颈椎活动度同步数据大小[{}]======",cvas.size());
		System.out.println(cvas.size());
		cvas.stream().forEach(cva->{
			
			CervicalVertebraActivity cvaActivity = conversion(cva);
			cvaMapper.insert(cvaActivity);
			
		});
		log.info("===================颈椎活动度数据同步结束,耗时[{}]秒==============",stopwatch.elapsed(TimeUnit.SECONDS));
		stopwatch.stop();
	}
	
	public CervicalVertebraActivity conversion(CervicalVertebra cva){
		CervicalVertebraActivity cvaActivity = new CervicalVertebraActivity();
		//原始数据处理
		String OrginalData = cva.getOrginalData();
		OrginalData = CharMatcher.breakingWhitespace().removeFrom(OrginalData);
		
		JSONObject obj = ByteConversion.getData(2, OrginalData);
		
		//处理后的数据与人员绑定
		Subjects sub = subjectsMapper.selectById(cva.getSubjectId());
		String code = sub.getCode();
		int id = sub.getId();

		String personId = code+id;
		//id
		//person_id
		cvaActivity.setPersonId(personId);
		//TODO:test_service_id
		//TODO:test_service_org
		cvaActivity.setTestingOrgId(Constant.ORG_ID);
		//create_time 创建时间
		cvaActivity.setCreateTime(cva.getCreatedDate());
		//TODO:create_by
		cvaActivity.setCreateBy(Constant.CREATE_BY);
		//构造入库对象
		cvaActivity.setX0x1(obj.getString("x0x1"));
		cvaActivity.setX2x3(obj.getString("x2x3"));
		cvaActivity.setX4x5(obj.getString("x4x5"));
		cvaActivity.setX6x7(obj.getString("x6x7"));
		cvaActivity.setX8x9(obj.getString("x8x9"));
		cvaActivity.setX10x11(obj.getString("x10x11"));
		cvaActivity.setX12x13(obj.getString("x12x13"));
		cvaActivity.setX14x15(obj.getString("x14x15"));
		cvaActivity.setX16x17(obj.getString("x16x17"));
		cvaActivity.setX18x19(obj.getString("x18x19"));
		cvaActivity.setX20x21(obj.getString("x20x21"));
		cvaActivity.setX22x23(obj.getString("x22x23"));
		
		//产品序列号
		cvaActivity.setX24x39(cva.getProductCode());
		//设备版本号
		cvaActivity.setX40x55(cva.getDeviceCode());
		//软件版本好
		cvaActivity.setX56x71(cva.getSoftwareCode());
		
		cvaActivity.setTestValue(obj.getString("testValue"));
		cvaActivity.setDelFlag("0");
		
		return cvaActivity;
	}

}
