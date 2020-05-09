package com.zy.sc.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 组织机构表
 * </p>
 *
 * @author wanglei
 * @since 2020-05-09
 */
public class SysOrg extends Model<SysOrg> {

    private static final long serialVersionUID = 1L;

        /**
     * 机构id(格式为：ORG-000001)
     */
         private String orgId;

        /**
     * 机构名称
     */
         private String orgName;

        /**
     * 机构类型
     */
         private String orgType;

        /**
     * 机构级别
     */
         private String orgLevel;

        /**
     * 分类
     */
         private String orgClassify;

        /**
     * (医院)性质
     */
         private String orgProperty;

        /**
     * 拼音码
     */
         private String pym;

    private String orgCode;

        /**
     * 登录后缀名
     */
         private String suffix;

        /**
     * 父机构id
     */
         private String parentId;

        /**
     * 介绍
     */
         private String intro;

        /**
     * 地址
     */
         private String address;

        /**
     * 交通路线
     */
         private String trafficRoute;

        /**
     * 电话
     */
         private String tel;

        /**
     * 地区
     */
         private String region;

        /**
     * 网址
     */
         private String website;

        /**
     * 经度
     */
         private String longitude;

        /**
     * 纬度
     */
         private String latitude;

        /**
     * 图片
     */
         private String orgPhoto;

        /**
     * 图片地址
     */
         private String orgPhotoUrl;

        /**
     * 排序
     */
         private Integer sortNo;

        /**
     * 交通指南
     */
         private String trafficGuide;

        /**
     * 门诊预约介绍
     */
         private String reservation;

        /**
     * 特色科室介绍
     */
         private String especiallydept;

        /**
     * 支付方式
     */
         private String payment;

        /**
     * 统计年度开始日期
     */
         private String calculateStartDate;

        /**
     * 上级地区
     */
         private String areaId;

        /**
     * 邮政编码
     */
         private String postcode;

        /**
     * 公有、私有
     */
         private String publicStatus;

        /**
     * 常住居民人口数
     */
         private Integer residentPopulation;

        /**
     * 管理重点人群总人数
     */
         private Integer focusAllCount;

        /**
     * 管理高血压总人数
     */
         private Integer gxyAllCount;

        /**
     * 管理糖尿病总人数
     */
         private Integer tnbAllCount;

        /**
     * 管理65岁以上老人总人数
     */
         private Integer oldAllCount;

        /**
     * 下属卫生室
     */
         private Integer subordinateClinicCount;

        /**
     * 开展的乡镇
     */
         private Integer villagesAndTownsCount;

        /**
     * 上线/下线flag(0:上线;1:下线)
     */
         private String onlineStatus;

        /**
     * 社区属性
     */
         private String centerAttributes;

        /**
     * 签约协议
     */
         private String signedAgreement;

    private String systemId;

    private String delFlag;

    private String createBy;

    private LocalDateTime createDatetime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateDatetime;


    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgClassify() {
        return orgClassify;
    }

    public void setOrgClassify(String orgClassify) {
        this.orgClassify = orgClassify;
    }

    public String getOrgProperty() {
        return orgProperty;
    }

    public void setOrgProperty(String orgProperty) {
        this.orgProperty = orgProperty;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrafficRoute() {
        return trafficRoute;
    }

    public void setTrafficRoute(String trafficRoute) {
        this.trafficRoute = trafficRoute;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getOrgPhoto() {
        return orgPhoto;
    }

    public void setOrgPhoto(String orgPhoto) {
        this.orgPhoto = orgPhoto;
    }

    public String getOrgPhotoUrl() {
        return orgPhotoUrl;
    }

    public void setOrgPhotoUrl(String orgPhotoUrl) {
        this.orgPhotoUrl = orgPhotoUrl;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getTrafficGuide() {
        return trafficGuide;
    }

    public void setTrafficGuide(String trafficGuide) {
        this.trafficGuide = trafficGuide;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getEspeciallydept() {
        return especiallydept;
    }

    public void setEspeciallydept(String especiallydept) {
        this.especiallydept = especiallydept;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getCalculateStartDate() {
        return calculateStartDate;
    }

    public void setCalculateStartDate(String calculateStartDate) {
        this.calculateStartDate = calculateStartDate;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPublicStatus() {
        return publicStatus;
    }

    public void setPublicStatus(String publicStatus) {
        this.publicStatus = publicStatus;
    }

    public Integer getResidentPopulation() {
        return residentPopulation;
    }

    public void setResidentPopulation(Integer residentPopulation) {
        this.residentPopulation = residentPopulation;
    }

    public Integer getFocusAllCount() {
        return focusAllCount;
    }

    public void setFocusAllCount(Integer focusAllCount) {
        this.focusAllCount = focusAllCount;
    }

    public Integer getGxyAllCount() {
        return gxyAllCount;
    }

    public void setGxyAllCount(Integer gxyAllCount) {
        this.gxyAllCount = gxyAllCount;
    }

    public Integer getTnbAllCount() {
        return tnbAllCount;
    }

    public void setTnbAllCount(Integer tnbAllCount) {
        this.tnbAllCount = tnbAllCount;
    }

    public Integer getOldAllCount() {
        return oldAllCount;
    }

    public void setOldAllCount(Integer oldAllCount) {
        this.oldAllCount = oldAllCount;
    }

    public Integer getSubordinateClinicCount() {
        return subordinateClinicCount;
    }

    public void setSubordinateClinicCount(Integer subordinateClinicCount) {
        this.subordinateClinicCount = subordinateClinicCount;
    }

    public Integer getVillagesAndTownsCount() {
        return villagesAndTownsCount;
    }

    public void setVillagesAndTownsCount(Integer villagesAndTownsCount) {
        this.villagesAndTownsCount = villagesAndTownsCount;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getCenterAttributes() {
        return centerAttributes;
    }

    public void setCenterAttributes(String centerAttributes) {
        this.centerAttributes = centerAttributes;
    }

    public String getSignedAgreement() {
        return signedAgreement;
    }

    public void setSignedAgreement(String signedAgreement) {
        this.signedAgreement = signedAgreement;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
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

    @Override
    protected Serializable pkVal() {
        return this.orgId;
    }

    @Override
    public String toString() {
        return "SysOrg{" +
        "orgId=" + orgId +
        ", orgName=" + orgName +
        ", orgType=" + orgType +
        ", orgLevel=" + orgLevel +
        ", orgClassify=" + orgClassify +
        ", orgProperty=" + orgProperty +
        ", pym=" + pym +
        ", orgCode=" + orgCode +
        ", suffix=" + suffix +
        ", parentId=" + parentId +
        ", intro=" + intro +
        ", address=" + address +
        ", trafficRoute=" + trafficRoute +
        ", tel=" + tel +
        ", region=" + region +
        ", website=" + website +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", orgPhoto=" + orgPhoto +
        ", orgPhotoUrl=" + orgPhotoUrl +
        ", sortNo=" + sortNo +
        ", trafficGuide=" + trafficGuide +
        ", reservation=" + reservation +
        ", especiallydept=" + especiallydept +
        ", payment=" + payment +
        ", calculateStartDate=" + calculateStartDate +
        ", areaId=" + areaId +
        ", postcode=" + postcode +
        ", publicStatus=" + publicStatus +
        ", residentPopulation=" + residentPopulation +
        ", focusAllCount=" + focusAllCount +
        ", gxyAllCount=" + gxyAllCount +
        ", tnbAllCount=" + tnbAllCount +
        ", oldAllCount=" + oldAllCount +
        ", subordinateClinicCount=" + subordinateClinicCount +
        ", villagesAndTownsCount=" + villagesAndTownsCount +
        ", onlineStatus=" + onlineStatus +
        ", centerAttributes=" + centerAttributes +
        ", signedAgreement=" + signedAgreement +
        ", systemId=" + systemId +
        ", delFlag=" + delFlag +
        ", createBy=" + createBy +
        ", createDatetime=" + createDatetime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateDatetime=" + lastUpdateDatetime +
        "}";
    }
}
