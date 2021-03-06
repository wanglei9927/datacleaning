package com.zy.autog;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 
 * 自动生成映射工具类
 * 
 * @author hubin
 *
 */
public class AutoGeneratorHelper {
	
	//4321
	//1234

	/**
	 * <p>
	 * 测试 run 执行
	 * </p>
	 * <p>
	 * 更多使用查看 http://mp.baomidou.com
	 * </p>
	 */
	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();

		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("/Users/wanglei/eclipse-workspace/datacleaning/src/main/java");
		gc.setFileOverride(true);
		gc.setActiveRecord(true);// 开启 activeRecord 模式
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(false);// XML columList
		gc.setAuthor("wanglei");
		mpg.setGlobalConfig(gc);

		// 数据源配置123
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.SQL_SERVER);
		dsc.setTypeConvert(new MySqlTypeConvert());
		dsc.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dsc.setUsername("sa");
		dsc.setPassword("800813");
		dsc.setUrl("jdbc:sqlserver://172.25.252.101:50708;DatabaseName=SpineData");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		//strategy.setTablePrefix(new String[] { "bmd_", "mp_" });// 此处可以修改为您的表前缀
		//strategy.setNaming(NamingStrategy.remove_prefix_and_camel);// 表名生成策略
		
		// 需要生成的表 
        strategy.setInclude(new String[] { "InspectResult" }); // 需要生成的表

		// 字段名生成策略
		//strategy.setFieldNaming(NamingStrategy.underline_to_camel);
		strategy.isSkipView();
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		strategy.setSuperServiceImplClass("com.baomidou.springwind.service.support.BaseServiceImpl");
		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setModuleName("sc");
		pc.setParent("com.zy");// 自定义包路径
		pc.setController("controller");// 这里是控制器包名，默认 web
		mpg.setPackageInfo(pc);
		
		TemplateConfig tc = new TemplateConfig();
		tc.setController(null);
		tc.setService(null);
		tc.setServiceImpl(null);
		mpg.setTemplate(tc);
		// 执行生成
		mpg.execute();
	}

}
