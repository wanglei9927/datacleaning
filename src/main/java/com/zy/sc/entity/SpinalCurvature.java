package com.zy.sc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 脊柱曲度数据表
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
public class SpinalCurvature extends Model<SpinalCurvature> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	@TableField(value="person_id")
	private String personId;

	/**
	 * 检测服务ID
	 */
	@TableField(value="testing_service_id")
	private String testingServiceId;

	/**
	 * 检测机构ID
	 */
	@TableField(value="testing_org_id")
	private String testingOrgId;

	/**
	 * 检测值
	 */
	@TableField(value="test_value")
	private String testValue;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private LocalDateTime createTime;

	/**
	 * 创建人
	 */
	@TableField(value="create_by")
	private String createBy;

	/**
	 * 后凸角度值(范围 0-600,高字节在前,表示 0.0°~60.0°)
	 */
	private String x0x1;

	/**
	 * 后凸起点序号(0-169,表示 170 个数据)
	 */
	private String x2;

	/**
	 * 后凸凸点序号(含义同上)
	 */
	private String x3;

	/**
	 * 后凸止点序号(含义同上)
	 */
	private String x4;

	/**
	 * 后凸起点段位(1-12 表示胸椎段位 T1-T12,13-17 表示腰椎段位L1-L5)
	 */
	private String x5;

	/**
	 * 后凸凸点段位(含义同上)
	 */
	private String x6;

	/**
	 * 后凸止点段位(含义同上)
	 */
	private String x7;

	/**
	 * 后凸起点百分比(0-100,表示该点在脊柱从上至下的百分比值)
	 */
	private String x8;

	/**
	 * 后凸凸点百分比(含义同上)
	 */
	private String x9;

	/**
	 * 后凸止点百分比(含义同上)
	 */
	private String x10;

	/**
	 * 后凸部位(0-胸椎,1-腰椎)
	 */
	private String x11;

	/**
	 * 前凸角度值(范围 0-600,高字节在前,表示 0.0°~60.0°)
	 */
	private String x12x13;

	/**
	 * 前凸起点序号(0-169,表示 170 个数据)
	 */
	private String x14;

	/**
	 * 前凸凸点序号(含义同上)
	 */
	private String x15;

	/**
	 * 前凸止点序号(含义同上)
	 */
	private String x16;

	/**
	 * 前凸起点段位值(1-12 表示胸椎段位 T1-T12,13-17 表示腰椎段位L1-L5)
	 */
	private String x17;

	/**
	 * 前凸凸点段位值(含义同上)
	 */
	private String x18;

	/**
	 * 前凸止点段位值(含义同上)
	 */
	private String x19;

	/**
	 * 前凸起点百分比(0-100,表示该点在脊柱从上至下的百分比值)
	 */
	private String x20;

	/**
	 * 前凸凸点百分比(含义同上)
	 */
	private String x21;

	/**
	 * 前凸止点百分比(含义同上)
	 */
	private String x22;

	/**
	 * 前凸部位(0-胸椎,1-腰椎)
	 */
	private String x23;

	/**
	 * 产品序列号
	 */
	private String x24x39;

	/**
	 * 硬件版本号
	 */
	private String x40x55;

	/**
	 * 软件版本号
	 */
	private String x56x71;

	/**
	 * 蓝牙mac地址
	 */
	private String x72x77;

	/**
	 * 备用(填0)
	 */
	private String x78x79;

	/**
	 * 0:未删除，1已删除
	 */
	@TableField(value="del_flag")
	private String delFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getTestingServiceId() {
		return testingServiceId;
	}

	public void setTestingServiceId(String testingServiceId) {
		this.testingServiceId = testingServiceId;
	}

	public String getTestingOrgId() {
		return testingOrgId;
	}

	public void setTestingOrgId(String testingOrgId) {
		this.testingOrgId = testingOrgId;
	}

	public String getTestValue() {
		return testValue;
	}

	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getX0x1() {
		return x0x1;
	}

	public void setX0x1(String x0x1) {
		this.x0x1 = x0x1;
	}

	public String getX2() {
		return x2;
	}

	public void setX2(String x2) {
		this.x2 = x2;
	}

	public String getX3() {
		return x3;
	}

	public void setX3(String x3) {
		this.x3 = x3;
	}

	public String getX4() {
		return x4;
	}

	public void setX4(String x4) {
		this.x4 = x4;
	}

	public String getX5() {
		return x5;
	}

	public void setX5(String x5) {
		this.x5 = x5;
	}

	public String getX6() {
		return x6;
	}

	public void setX6(String x6) {
		this.x6 = x6;
	}

	public String getX7() {
		return x7;
	}

	public void setX7(String x7) {
		this.x7 = x7;
	}

	public String getX8() {
		return x8;
	}

	public void setX8(String x8) {
		this.x8 = x8;
	}

	public String getX9() {
		return x9;
	}

	public void setX9(String x9) {
		this.x9 = x9;
	}

	public String getX10() {
		return x10;
	}

	public void setX10(String x10) {
		this.x10 = x10;
	}

	public String getX11() {
		return x11;
	}

	public void setX11(String x11) {
		this.x11 = x11;
	}

	public String getX12x13() {
		return x12x13;
	}

	public void setX12x13(String x12x13) {
		this.x12x13 = x12x13;
	}

	public String getX14() {
		return x14;
	}

	public void setX14(String x14) {
		this.x14 = x14;
	}

	public String getX15() {
		return x15;
	}

	public void setX15(String x15) {
		this.x15 = x15;
	}

	public String getX16() {
		return x16;
	}

	public void setX16(String x16) {
		this.x16 = x16;
	}

	public String getX17() {
		return x17;
	}

	public void setX17(String x17) {
		this.x17 = x17;
	}

	public String getX18() {
		return x18;
	}

	public void setX18(String x18) {
		this.x18 = x18;
	}

	public String getX19() {
		return x19;
	}

	public void setX19(String x19) {
		this.x19 = x19;
	}

	public String getX20() {
		return x20;
	}

	public void setX20(String x20) {
		this.x20 = x20;
	}

	public String getX21() {
		return x21;
	}

	public void setX21(String x21) {
		this.x21 = x21;
	}

	public String getX22() {
		return x22;
	}

	public void setX22(String x22) {
		this.x22 = x22;
	}

	public String getX23() {
		return x23;
	}

	public void setX23(String x23) {
		this.x23 = x23;
	}

	public String getX24x39() {
		return x24x39;
	}

	public void setX24x39(String x24x39) {
		this.x24x39 = x24x39;
	}

	public String getX40x55() {
		return x40x55;
	}

	public void setX40x55(String x40x55) {
		this.x40x55 = x40x55;
	}

	public String getX56x71() {
		return x56x71;
	}

	public void setX56x71(String x56x71) {
		this.x56x71 = x56x71;
	}

	public String getX72x77() {
		return x72x77;
	}

	public void setX72x77(String x72x77) {
		this.x72x77 = x72x77;
	}

	public String getX78x79() {
		return x78x79;
	}

	public void setX78x79(String x78x79) {
		this.x78x79 = x78x79;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SpinalCurvature{" + "id=" + id + ", personId=" + personId + ", testingServiceId=" + testingServiceId
				+ ", testingOrgId=" + testingOrgId + ", testValue=" + testValue + ", createTime=" + createTime
				+ ", createBy=" + createBy + ", x0x1=" + x0x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", x5="
				+ x5 + ", x6=" + x6 + ", x7=" + x7 + ", x8=" + x8 + ", x9=" + x9 + ", x10=" + x10 + ", x11=" + x11
				+ ", x12x13=" + x12x13 + ", x14=" + x14 + ", x15=" + x15 + ", x16=" + x16 + ", x17=" + x17 + ", x18="
				+ x18 + ", x19=" + x19 + ", x20=" + x20 + ", x21=" + x21 + ", x22=" + x22 + ", x23=" + x23 + ", x24x39="
				+ x24x39 + ", x40x55=" + x40x55 + ", x56x71=" + x56x71 + ", x72x77=" + x72x77 + ", x78x79=" + x78x79
				+ ", delFlag=" + delFlag + "}";
	}
}
