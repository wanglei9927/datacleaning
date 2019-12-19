package com.zy.sc.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
public class PhPerson extends Model<PhPerson> {

	private static final long serialVersionUID = 1L;

	/**
	 * 人员id
	 */
	@TableId(value="person_id")
	private String personId;

	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 生日
	 */
	private LocalDate birthday;

	/**
	 * 身份证号
	 */
	@TableField(value="id_card")
	private String idCard;

	/**
	 * 社保卡号
	 */
	private String socialSecurityCard;

	/**
	 * 身高
	 */
	private String height;

	/**
	 * 体重
	 */
	private String weight;

	/**
	 * 图片
	 */
	private String photo;

	/**
	 * 照片地址
	 */
	private String photoPath;

	/**
	 * 手机号码
	 */
	@TableField(value="mobile_phone")
	private String mobilePhone;

	/**
	 * 职务
	 */
	private String position;

	/**
	 * 职称
	 */
	private String professionalTitle;

	/**
	 * 签约状态(1:签约，2:未签约)
	 */
	private String signStatus;

	/**
	 * 简介
	 */
	private String intro;

	/**
	 * 机构id
	 */
	@TableField(value="org_id")
	private String orgId;

	/**
	 * 系统id
	 */
	@TableField(value="system_id")
	private String systemId;

	/**
	 * 地区编码
	 */
	private String areaCode;

	/**
	 * 居住地区id
	 */
	private String areaId;

	private String address;

	/**
	 * 删除标志
	 */
	@TableField(value="del_flag")
	private String delFlag;

	/**
	 * 创建者
	 */
	private String createBy;

	/**
	 * 创建时间
	 */
	@TableField(value="create_datetime")
	private LocalDateTime createDatetime;

	/**
	 * 最后修改者
	 */
	private String lastUpdateBy;

	/**
	 * 最后修改时间
	 */
	private LocalDateTime lastUpdateDatetime;

	/**
	 * 联系人person_id
	 */
	private String contactPersonId;

	/**
	 * 联系人姓名
	 */
	private String contactName;

	/**
	 * 联系人联系方式
	 */
	private String contactTel;

	private String company;

	/**
	 * 户籍编码
	 */
	private String censusRegister;

	private String censusRegisterAddress;

	/**
	 * 血型
	 */
	private String bloodType;

	/**
	 * 职业
	 */
	private String profession;

	/**
	 * 常住类型
	 */
	private String permanentType;

	/**
	 * 民族
	 */
	private String nation;

	/**
	 * 文化程度
	 */
	private String education;

	/**
	 * 残疾情况
	 */
	private String disabilityStatus;

	/**
	 * 残疾证号
	 */
	private String disabilityId;

	/**
	 * 婚姻状况
	 */
	private String maritalStatus;

	/**
	 * 固定电话
	 */
	private String telephone;

	/**
	 * 医保卡
	 */
	private String medicareCard;

	/**
	 * 医保类型 01:职工医保 02：城镇医保 03：新农合 04 ：其他
	 */
	private String medicalInsuranceType;

	/**
	 * 厨房排风
	 */
	private String kitchen;

	/**
	 * 燃料
	 */
	private String fuel;

	/**
	 * 饮水
	 */
	private String drinkingWater;

	/**
	 * 禽畜
	 */
	private String livestock;

	/**
	 * 厕所
	 */
	private String lavatory;

	/**
	 * 计划时间
	 */
	private LocalDate planDate;

	/**
	 * 档案完成度
	 */
	private Integer completeRate;

	/**
	 * 当前状况
	 */
	private String symptom;

	private String rhType;

	private String personIdOther;

	private String familyCode;

	private Integer relationShip;

	private String addressType;

	private String age;

	/**
	 * 经度
	 */
	private Double lng;

	/**
	 * 纬度
	 */
	private Double lat;

	/**
	 * 户籍所在地址
	 */
	private String householdRegistrationLocation;

	/**
	 * 现居地址
	 */
	@TableField(value="current_address")
	private String currentAddress;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * "0"代表是学生，"1"代表不是；默认为:"0"
	 */
	@TableField(value="isStudent")
	private String isStudent;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSocialSecurityCard() {
		return socialSecurityCard;
	}

	public void setSocialSecurityCard(String socialSecurityCard) {
		this.socialSecurityCard = socialSecurityCard;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getProfessionalTitle() {
		return professionalTitle;
	}

	public void setProfessionalTitle(String professionalTitle) {
		this.professionalTitle = professionalTitle;
	}

	public String getSignStatus() {
		return signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public LocalDateTime getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(LocalDateTime createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public LocalDateTime getLastUpdateDatetime() {
		return lastUpdateDatetime;
	}

	public void setLastUpdateDatetime(LocalDateTime lastUpdateDatetime) {
		this.lastUpdateDatetime = lastUpdateDatetime;
	}

	public String getContactPersonId() {
		return contactPersonId;
	}

	public void setContactPersonId(String contactPersonId) {
		this.contactPersonId = contactPersonId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCensusRegister() {
		return censusRegister;
	}

	public void setCensusRegister(String censusRegister) {
		this.censusRegister = censusRegister;
	}

	public String getCensusRegisterAddress() {
		return censusRegisterAddress;
	}

	public void setCensusRegisterAddress(String censusRegisterAddress) {
		this.censusRegisterAddress = censusRegisterAddress;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getPermanentType() {
		return permanentType;
	}

	public void setPermanentType(String permanentType) {
		this.permanentType = permanentType;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDisabilityStatus() {
		return disabilityStatus;
	}

	public void setDisabilityStatus(String disabilityStatus) {
		this.disabilityStatus = disabilityStatus;
	}

	public String getDisabilityId() {
		return disabilityId;
	}

	public void setDisabilityId(String disabilityId) {
		this.disabilityId = disabilityId;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMedicareCard() {
		return medicareCard;
	}

	public void setMedicareCard(String medicareCard) {
		this.medicareCard = medicareCard;
	}

	public String getMedicalInsuranceType() {
		return medicalInsuranceType;
	}

	public void setMedicalInsuranceType(String medicalInsuranceType) {
		this.medicalInsuranceType = medicalInsuranceType;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getDrinkingWater() {
		return drinkingWater;
	}

	public void setDrinkingWater(String drinkingWater) {
		this.drinkingWater = drinkingWater;
	}

	public String getLivestock() {
		return livestock;
	}

	public void setLivestock(String livestock) {
		this.livestock = livestock;
	}

	public String getLavatory() {
		return lavatory;
	}

	public void setLavatory(String lavatory) {
		this.lavatory = lavatory;
	}

	public LocalDate getPlanDate() {
		return planDate;
	}

	public void setPlanDate(LocalDate planDate) {
		this.planDate = planDate;
	}

	public Integer getCompleteRate() {
		return completeRate;
	}

	public void setCompleteRate(Integer completeRate) {
		this.completeRate = completeRate;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getRhType() {
		return rhType;
	}

	public void setRhType(String rhType) {
		this.rhType = rhType;
	}

	public String getPersonIdOther() {
		return personIdOther;
	}

	public void setPersonIdOther(String personIdOther) {
		this.personIdOther = personIdOther;
	}

	public String getFamilyCode() {
		return familyCode;
	}

	public void setFamilyCode(String familyCode) {
		this.familyCode = familyCode;
	}

	public Integer getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(Integer relationShip) {
		this.relationShip = relationShip;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public String getHouseholdRegistrationLocation() {
		return householdRegistrationLocation;
	}

	public void setHouseholdRegistrationLocation(String householdRegistrationLocation) {
		this.householdRegistrationLocation = householdRegistrationLocation;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsStudent() {
		return isStudent;
	}

	public void setIsStudent(String isStudent) {
		this.isStudent = isStudent;
	}

	@Override
	protected Serializable pkVal() {
		return this.personId;
	}

	@Override
	public String toString() {
		return "PhPerson{" + "personId=" + personId + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday
				+ ", idCard=" + idCard + ", socialSecurityCard=" + socialSecurityCard + ", height=" + height
				+ ", weight=" + weight + ", photo=" + photo + ", photoPath=" + photoPath + ", mobilePhone="
				+ mobilePhone + ", position=" + position + ", professionalTitle=" + professionalTitle + ", signStatus="
				+ signStatus + ", intro=" + intro + ", orgId=" + orgId + ", systemId=" + systemId + ", areaCode="
				+ areaCode + ", areaId=" + areaId + ", address=" + address + ", delFlag=" + delFlag + ", createBy="
				+ createBy + ", createDatetime=" + createDatetime + ", lastUpdateBy=" + lastUpdateBy
				+ ", lastUpdateDatetime=" + lastUpdateDatetime + ", contactPersonId=" + contactPersonId
				+ ", contactName=" + contactName + ", contactTel=" + contactTel + ", company=" + company
				+ ", censusRegister=" + censusRegister + ", censusRegisterAddress=" + censusRegisterAddress
				+ ", bloodType=" + bloodType + ", profession=" + profession + ", permanentType=" + permanentType
				+ ", nation=" + nation + ", education=" + education + ", disabilityStatus=" + disabilityStatus
				+ ", disabilityId=" + disabilityId + ", maritalStatus=" + maritalStatus + ", telephone=" + telephone
				+ ", medicareCard=" + medicareCard + ", medicalInsuranceType=" + medicalInsuranceType + ", kitchen="
				+ kitchen + ", fuel=" + fuel + ", drinkingWater=" + drinkingWater + ", livestock=" + livestock
				+ ", lavatory=" + lavatory + ", planDate=" + planDate + ", completeRate=" + completeRate + ", symptom="
				+ symptom + ", rhType=" + rhType + ", personIdOther=" + personIdOther + ", familyCode=" + familyCode
				+ ", relationShip=" + relationShip + ", addressType=" + addressType + ", age=" + age + ", lng=" + lng
				+ ", lat=" + lat + ", householdRegistrationLocation=" + householdRegistrationLocation
				+ ", currentAddress=" + currentAddress + ", remark=" + remark + ", isStudent=" + isStudent + "}";
	}
}
