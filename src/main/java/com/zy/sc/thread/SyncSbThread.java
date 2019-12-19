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
import com.zy.sc.entity.InspectResult;
import com.zy.sc.entity.SpinalBend;
import com.zy.sc.entity.Subjects;
import com.zy.sc.mapper.InspectResultMapper;
import com.zy.sc.mapper.SpinalBendMapper;
import com.zy.sc.mapper.SubjectsMapper;
import com.zy.sc.utils.ByteConversion;

@Slf4j
@Component
public class SyncSbThread implements Runnable {

	@Resource
	private InspectResultMapper inspectResultMapper;
	
	@Resource
	private SpinalBendMapper sbMapper;
	
	@Resource
	private SubjectsMapper subMapper;
	

	@Override
	public void run() {
		final Stopwatch stopwatch = Stopwatch.createStarted();
		log.info("===================侧弯数据同步开始==============");
		List<InspectResult> sbs = inspectResultMapper.selectList(null);
		log.info("===================侧弯同步数据大小[{}]======",sbs.size());

		sbs.stream().forEach((sb)->{
			
			SpinalBend spinalBend = conversion(sb);
			
			sbMapper.insert(spinalBend);
			
		});
		log.info("===================侧弯数据同步结束,耗时[{}]秒==============",stopwatch.elapsed(TimeUnit.SECONDS));
		stopwatch.stop();
	}
	
	
	public SpinalBend conversion(InspectResult sb) {
		
		SpinalBend spinalBend = new SpinalBend();
		String OrginalData = sb.getOrginalData();
		
		OrginalData = CharMatcher.breakingWhitespace().removeFrom(OrginalData);

		JSONObject obj = ByteConversion.getData(0, OrginalData);
	
		//处理后的数据与人员绑定
		Subjects sub = subMapper.selectById(sb.getSubjectId());
		//person_id
		spinalBend.setPersonId(sub.getCode());
		
		//TODO:test_service_id
		//TODO:test_service_org
		spinalBend.setTestingOrgId(Constant.ORG_ID);
		//create_time 创建时间
		spinalBend.setCreateTime(sb.getCreatedDate());
		//TODO:create_by
		spinalBend.setCreateBy(Constant.CREATE_BY);
		//构造入库对象
		spinalBend.setX0x1(obj.getString("x0x1"));
		spinalBend.setX2(obj.getString("x2"));
		spinalBend.setX3(obj.getString("x3"));
		spinalBend.setX4(obj.getString("x4"));
		spinalBend.setX5(obj.getString("x5"));
		spinalBend.setX6x7(obj.getString("x6x7"));
		spinalBend.setX8x9(obj.getString("x8x9"));
		spinalBend.setX10(obj.getString("x10"));
		spinalBend.setX11(obj.getString("x11"));
		spinalBend.setX12(obj.getString("x12"));
		spinalBend.setX13(obj.getString("x13"));
		
		//设备版本号
		spinalBend.setX32x47(sb.getDeviceCode());
		
		spinalBend.setTestValue(obj.getString("testValue"));
		spinalBend.setDelFlag("0");
		
		return spinalBend;
		
	}

}
