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
import com.zy.sc.entity.CervicalVertebraActivity;
import com.zy.sc.entity.CurvesInsepctResult;
import com.zy.sc.entity.SpinalCurvature;
import com.zy.sc.entity.Subjects;
import com.zy.sc.mapper.CurvesInsepctResultMapper;
import com.zy.sc.mapper.SpinalCurvatureMapper;
import com.zy.sc.mapper.SubjectsMapper;
import com.zy.sc.utils.ByteConversion;


@Slf4j
@Component
public class SyncScThread implements Runnable{

	@Resource
	private CurvesInsepctResultMapper curvesInsepctResultMapper ;
	
	@Resource
	private SpinalCurvatureMapper scMapper;
	
	@Resource
	private SubjectsMapper subjectsMapper;
	
	@Override
	public void run() {
		final Stopwatch stopwatch = Stopwatch.createStarted();
	    log.info("===================曲度数据同步开始==============");
		List<CurvesInsepctResult> curs = curvesInsepctResultMapper.selectList(null);
		log.info("===================曲度同步数据大小[{}]======",curs.size());

		curs.stream().forEach((cur)->{
			SpinalCurvature sCurvature = conversion(cur);
			scMapper.insert(sCurvature);
		});

		log.info("===================曲度数据结束同步,耗时[{}]秒======",stopwatch.elapsed(TimeUnit.SECONDS));
		stopwatch.stop();

	}
	
	
	public SpinalCurvature conversion(CurvesInsepctResult cur) {
		
		SpinalCurvature sc = new SpinalCurvature();
		//原始数据处理
		String OrginalData = cur.getOrginalData();
		OrginalData = CharMatcher.breakingWhitespace().removeFrom(OrginalData);
		
		JSONObject obj = ByteConversion.getData(1, OrginalData);
		
		//处理后的数据与人员绑定
		Subjects sub = subjectsMapper.selectById(cur.getSubjectId());
		//id
		//person_id
		sc.setPersonId(sub.getCode());
		//TODO:test_service_id
		//TODO:test_service_org
		sc.setTestingOrgId(Constant.ORG_ID);
		//create_time 创建时间
		sc.setCreateTime(cur.getCreatedDate());
		//TODO:create_by
		sc.setCreateBy(Constant.CREATE_BY);
		//构造入库对象
		sc.setX0x1(obj.getString("x0x1"));
		sc.setX2(obj.getString("x2"));
		sc.setX3(obj.getString("x3"));
		sc.setX4(obj.getString("x4"));
		sc.setX5(obj.getString("x5"));
		sc.setX6(obj.getString("x6"));
		sc.setX7(obj.getString("x7"));
		sc.setX8(obj.getString("x8"));
		sc.setX9(obj.getString("x9"));
		sc.setX10(obj.getString("x10"));
		sc.setX11(obj.getString("x11"));
		sc.setX12x13(obj.getString("x12x13"));
		sc.setX14(obj.getString("x14"));
		sc.setX15(obj.getString("x15"));
		sc.setX16(obj.getString("x16"));
		sc.setX17(obj.getString("x17"));
		sc.setX18(obj.getString("x18"));
		sc.setX19(obj.getString("x19"));
		sc.setX20(obj.getString("x20"));
		sc.setX21(obj.getString("x21"));
		sc.setX22(obj.getString("x22"));
		sc.setX23(obj.getString("x23"));
		
		//产品序列号
		sc.setX24x39(cur.getProductCode());
		
		sc.setTestValue(obj.getString("testValue"));
		sc.setDelFlag("0");
		
		return sc;
		
	}
	
	

}
