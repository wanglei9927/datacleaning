package com.zy.sc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 脊柱测弯数据表
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
public class SpinalBend extends Model<SpinalBend> {

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
	@TableField(value="testing_org_Id")
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
	 * 左侧最大角度值(0-300,高字节在前，表示0.0°~30.0°)
	 */
	private String x0x1;

	/**
	 * 左侧最大角度序号（0-169，表示170个数据
	 */
	private String x2;

	/**
	 * 左侧最大角度段位(1-12 表示胸椎段位 T1-T12,13-17 表示腰椎段位L1-L5)
	 */
	private String x3;

	/**
	 * 左侧最大角度百分比(0-100, 表示该点在脊柱从上至下的百分比值)
	 */
	private String x4;

	/**
	 * 左侧最大角度部位(0-胸,1-腰)
	 */
	private String x5;

	/**
	 * 备用(填0)
	 */
	private String x6x7;

	/**
	 * 右侧最大角度值(0-300,高字节在前,表示 0.0°~30.0°)
	 */
	private String x8x9;

	/**
	 * 右侧最大角度序号(0-169,表示 170 个数据)
	 */
	private String x10;

	/**
	 * 右侧最大角度段位(1-12 表示胸椎段位 T1-T12,13-17 表示腰椎段位 L1-L5)
	 */
	private String x11;

	/**
	 * 右侧最大角度百分比(0-100, 表示该点在脊柱从上至下的百分比值)
	 */
	private String x12;

	/**
	 * 右侧最大角度部位(0-胸,1-腰)
	 */
	private String x13;

	/**
	 * 备用(填0)
	 */
	private String x14x15;

	/**
	 * 产品序列号
	 */
	private String x16x31;

	/**
	 * 硬件版本号
	 */
	private String x32x47;

	/**
	 * 软件版本号
	 */
	private String x48x63;

	/**
	 * 蓝牙mac地址
	 */
	private String x64x69;

	/**
	 * 备用(填0)
	 */
	private String x70x71;

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

	public String getX6x7() {
		return x6x7;
	}

	public void setX6x7(String x6x7) {
		this.x6x7 = x6x7;
	}

	public String getX8x9() {
		return x8x9;
	}

	public void setX8x9(String x8x9) {
		this.x8x9 = x8x9;
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

	public String getX12() {
		return x12;
	}

	public void setX12(String x12) {
		this.x12 = x12;
	}

	public String getX13() {
		return x13;
	}

	public void setX13(String x13) {
		this.x13 = x13;
	}

	public String getX14x15() {
		return x14x15;
	}

	public void setX14x15(String x14x15) {
		this.x14x15 = x14x15;
	}

	public String getX16x31() {
		return x16x31;
	}

	public void setX16x31(String x16x31) {
		this.x16x31 = x16x31;
	}

	public String getX32x47() {
		return x32x47;
	}

	public void setX32x47(String x32x47) {
		this.x32x47 = x32x47;
	}

	public String getX48x63() {
		return x48x63;
	}

	public void setX48x63(String x48x63) {
		this.x48x63 = x48x63;
	}

	public String getX64x69() {
		return x64x69;
	}

	public void setX64x69(String x64x69) {
		this.x64x69 = x64x69;
	}

	public String getX70x71() {
		return x70x71;
	}

	public void setX70x71(String x70x71) {
		this.x70x71 = x70x71;
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
		return "SpinalBend{" + "id=" + id + ", personId=" + personId + ", testingServiceId=" + testingServiceId
				+ ", testingOrgId=" + testingOrgId + ", testValue=" + testValue + ", createTime=" + createTime
				+ ", createBy=" + createBy + ", x0x1=" + x0x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", x5="
				+ x5 + ", x6x7=" + x6x7 + ", x8x9=" + x8x9 + ", x10=" + x10 + ", x11=" + x11 + ", x12=" + x12 + ", x13="
				+ x13 + ", x14x15=" + x14x15 + ", x16x31=" + x16x31 + ", x32x47=" + x32x47 + ", x48x63=" + x48x63
				+ ", x64x69=" + x64x69 + ", x70x71=" + x70x71 + ", delFlag=" + delFlag + "}";
	}
}
