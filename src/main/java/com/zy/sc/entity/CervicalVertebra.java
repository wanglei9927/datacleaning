package com.zy.sc.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
@TableName("CervicalVertebra")
public class CervicalVertebra extends Model<CervicalVertebra> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "Id", type = IdType.AUTO)
	private Integer Id;

	/**
	 * 受试者id
	 */
	@TableField("SubjectId")
	private Integer SubjectId;

	/**
	 * 前屈伸最大度数
	 */
	@TableField("FlexibleFrontDegreeMax")
	private BigDecimal FlexibleFrontDegreeMax;

	/**
	 * 后屈伸最大度数
	 */
	@TableField("FlexibleEndDegreeMax")
	private BigDecimal FlexibleEndDegreeMax;

	/**
	 * 左屈伸最大度数
	 */
	@TableField("LeftSideFlexibleDegreeMax")
	private BigDecimal LeftSideFlexibleDegreeMax;

	/**
	 * 右屈伸最大度数
	 */
	@TableField("RightSideFlexibleDegreeMax")
	private BigDecimal RightSideFlexibleDegreeMax;

	/**
	 * 左旋转最大度数
	 */
	@TableField("LeftTurnDegreeMax")
	private BigDecimal LeftTurnDegreeMax;

	/**
	 * 右旋转最大度数
	 */
	@TableField("RightTurnDegreeMax")
	private BigDecimal RightTurnDegreeMax;

	@TableField("Evaluate")
	private String Evaluate;

	/**
	 * 硬件版本号
	 */
	@TableField("DeviceCode")
	private String DeviceCode;

	/**
	 * 产品序列号
	 */
	@TableField("ProductCode")
	private String ProductCode;

	/**
	 * 软件版本号
	 */
	@TableField("SoftwareCode")
	private String SoftwareCode;

	/**
	 * 机构编码
	 */
	@TableField("OrgCode")
	private String OrgCode;

	/**
	 * 元数据
	 */
	@TableField("OrginalData")
	private String OrginalData;

	@TableField("CreatedUserId")
	private Integer CreatedUserId;

	@TableField("CreatedDate")
	private LocalDateTime CreatedDate;

	@TableField("DeletedDate")
	private LocalDateTime DeletedDate;

	@TableField("DeletedUserId")
	private Integer DeletedUserId;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public Integer getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(Integer SubjectId) {
		this.SubjectId = SubjectId;
	}

	public BigDecimal getFlexibleFrontDegreeMax() {
		return FlexibleFrontDegreeMax;
	}

	public void setFlexibleFrontDegreeMax(BigDecimal FlexibleFrontDegreeMax) {
		this.FlexibleFrontDegreeMax = FlexibleFrontDegreeMax;
	}

	public BigDecimal getFlexibleEndDegreeMax() {
		return FlexibleEndDegreeMax;
	}

	public void setFlexibleEndDegreeMax(BigDecimal FlexibleEndDegreeMax) {
		this.FlexibleEndDegreeMax = FlexibleEndDegreeMax;
	}

	public BigDecimal getLeftSideFlexibleDegreeMax() {
		return LeftSideFlexibleDegreeMax;
	}

	public void setLeftSideFlexibleDegreeMax(BigDecimal LeftSideFlexibleDegreeMax) {
		this.LeftSideFlexibleDegreeMax = LeftSideFlexibleDegreeMax;
	}

	public BigDecimal getRightSideFlexibleDegreeMax() {
		return RightSideFlexibleDegreeMax;
	}

	public void setRightSideFlexibleDegreeMax(BigDecimal RightSideFlexibleDegreeMax) {
		this.RightSideFlexibleDegreeMax = RightSideFlexibleDegreeMax;
	}

	public BigDecimal getLeftTurnDegreeMax() {
		return LeftTurnDegreeMax;
	}

	public void setLeftTurnDegreeMax(BigDecimal LeftTurnDegreeMax) {
		this.LeftTurnDegreeMax = LeftTurnDegreeMax;
	}

	public BigDecimal getRightTurnDegreeMax() {
		return RightTurnDegreeMax;
	}

	public void setRightTurnDegreeMax(BigDecimal RightTurnDegreeMax) {
		this.RightTurnDegreeMax = RightTurnDegreeMax;
	}

	public String getEvaluate() {
		return Evaluate;
	}

	public void setEvaluate(String Evaluate) {
		this.Evaluate = Evaluate;
	}

	public String getDeviceCode() {
		return DeviceCode;
	}

	public void setDeviceCode(String DeviceCode) {
		this.DeviceCode = DeviceCode;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String ProductCode) {
		this.ProductCode = ProductCode;
	}

	public String getSoftwareCode() {
		return SoftwareCode;
	}

	public void setSoftwareCode(String SoftwareCode) {
		this.SoftwareCode = SoftwareCode;
	}

	public String getOrgCode() {
		return OrgCode;
	}

	public void setOrgCode(String OrgCode) {
		this.OrgCode = OrgCode;
	}

	public String getOrginalData() {
		return OrginalData;
	}

	public void setOrginalData(String OrginalData) {
		this.OrginalData = OrginalData;
	}

	public Integer getCreatedUserId() {
		return CreatedUserId;
	}

	public void setCreatedUserId(Integer CreatedUserId) {
		this.CreatedUserId = CreatedUserId;
	}

	public LocalDateTime getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDateTime CreatedDate) {
		this.CreatedDate = CreatedDate;
	}

	public LocalDateTime getDeletedDate() {
		return DeletedDate;
	}

	public void setDeletedDate(LocalDateTime DeletedDate) {
		this.DeletedDate = DeletedDate;
	}

	public Integer getDeletedUserId() {
		return DeletedUserId;
	}

	public void setDeletedUserId(Integer DeletedUserId) {
		this.DeletedUserId = DeletedUserId;
	}

	@Override
	protected Serializable pkVal() {
		return this.Id;
	}

	@Override
	public String toString() {
		return "CervicalVertebra{" + "Id=" + Id + ", SubjectId=" + SubjectId + ", FlexibleFrontDegreeMax="
				+ FlexibleFrontDegreeMax + ", FlexibleEndDegreeMax=" + FlexibleEndDegreeMax
				+ ", LeftSideFlexibleDegreeMax=" + LeftSideFlexibleDegreeMax + ", RightSideFlexibleDegreeMax="
				+ RightSideFlexibleDegreeMax + ", LeftTurnDegreeMax=" + LeftTurnDegreeMax + ", RightTurnDegreeMax="
				+ RightTurnDegreeMax + ", Evaluate=" + Evaluate + ", DeviceCode=" + DeviceCode + ", ProductCode="
				+ ProductCode + ", SoftwareCode=" + SoftwareCode + ", OrgCode=" + OrgCode + ", OrginalData="
				+ OrginalData + ", CreatedUserId=" + CreatedUserId + ", CreatedDate=" + CreatedDate + ", DeletedDate="
				+ DeletedDate + ", DeletedUserId=" + DeletedUserId + "}";
	}
}
