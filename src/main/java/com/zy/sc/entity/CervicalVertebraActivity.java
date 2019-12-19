package com.zy.sc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 颈椎活动度数据表
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
public class CervicalVertebraActivity extends Model<CervicalVertebraActivity> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	@TableField(value="person_id")
	private String personId;

	/**
	 * 检测服务ID
	 */
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
	 * 屈伸的前屈角度值(范围 0~-900,高字节在前,表示 0.0°~-90.0°)
	 */
	private String x0x1;

	/**
	 * 屈伸的前屈角度序号(范围 0~99)
	 */
	private String x2x3;

	/**
	 * 屈伸的后伸角度值(范围 0-900,高字节在前,表示 0.0°~90.0°)
	 */
	private String x4x5;

	/**
	 * 屈伸的后伸角度序号(范围 0~99)
	 */
	private String x6x7;

	/**
	 * 侧屈的左屈角度值(范围 0~-900,高字节在前,表示 0.0°~-90.0°)
	 */
	private String x8x9;

	/**
	 * 屈伸的左屈角度序号(范围 0~99)
	 */
	private String x10x11;

	/**
	 * 侧屈的右屈角度值(范围 0-900,高字节在前,表示 0.0°~90.0°)
	 */
	private String x12x13;

	/**
	 * 屈伸的右屈角度序号(范围 0~99)
	 */
	private String x14x15;

	/**
	 * 旋转的左转角度值(范围 0~-900,高字节在前,表示 0.0°~-90.0°)
	 */
	private String x16x17;

	/**
	 * 屈伸的左转角度序号(范围 0~99)
	 */
	private String x18x19;

	/**
	 * 旋转的右转角度值(范围 0-900,高字节在前,表示 0.0°~90.0°)
	 */
	private String x20x21;

	/**
	 * 屈伸的右转角度序号(范围 0~99)
	 */
	private String x22x23;

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

	public String getX2x3() {
		return x2x3;
	}

	public void setX2x3(String x2x3) {
		this.x2x3 = x2x3;
	}

	public String getX4x5() {
		return x4x5;
	}

	public void setX4x5(String x4x5) {
		this.x4x5 = x4x5;
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

	public String getX10x11() {
		return x10x11;
	}

	public void setX10x11(String x10x11) {
		this.x10x11 = x10x11;
	}

	public String getX12x13() {
		return x12x13;
	}

	public void setX12x13(String x12x13) {
		this.x12x13 = x12x13;
	}

	public String getX14x15() {
		return x14x15;
	}

	public void setX14x15(String x14x15) {
		this.x14x15 = x14x15;
	}

	public String getX16x17() {
		return x16x17;
	}

	public void setX16x17(String x16x17) {
		this.x16x17 = x16x17;
	}

	public String getX18x19() {
		return x18x19;
	}

	public void setX18x19(String x18x19) {
		this.x18x19 = x18x19;
	}

	public String getX20x21() {
		return x20x21;
	}

	public void setX20x21(String x20x21) {
		this.x20x21 = x20x21;
	}

	public String getX22x23() {
		return x22x23;
	}

	public void setX22x23(String x22x23) {
		this.x22x23 = x22x23;
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
		return "CervicalVertebraActivity{" + "id=" + id + ", personId=" + personId + ", testingServiceId="
				+ testingServiceId + ", testingOrgId=" + testingOrgId + ", testValue=" + testValue + ", createTime="
				+ createTime + ", createBy=" + createBy + ", x0x1=" + x0x1 + ", x2x3=" + x2x3 + ", x4x5=" + x4x5
				+ ", x6x7=" + x6x7 + ", x8x9=" + x8x9 + ", x10x11=" + x10x11 + ", x12x13=" + x12x13 + ", x14x15="
				+ x14x15 + ", x16x17=" + x16x17 + ", x18x19=" + x18x19 + ", x20x21=" + x20x21 + ", x22x23=" + x22x23
				+ ", x24x39=" + x24x39 + ", x40x55=" + x40x55 + ", x56x71=" + x56x71 + ", x72x77=" + x72x77
				+ ", x78x79=" + x78x79 + ", delFlag=" + delFlag + "}";
	}
}
