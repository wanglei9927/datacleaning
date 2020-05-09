package com.zy.sc.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanglei
 * @since 2020-05-09
 */
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

        /**
     * 角色id
     */
         private String roleId;

        /**
     * 角色名称
     */
         private String roleName;

    private String roleCode;

        /**
     * 机构id
     */
         private String orgId;

        /**
     * 角色类型
     */
         private String roleType;

        /**
     * 辖区
     */
         private String manageAreaId;

    private String remark;

    private Integer sortNo;

        /**
     * 系统id
     */
         private String systemId;

    private String delFlag;

    private String createBy;

    private LocalDateTime createDatetime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateDatetime;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getManageAreaId() {
        return manageAreaId;
    }

    public void setManageAreaId(String manageAreaId) {
        this.manageAreaId = manageAreaId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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
        return this.roleId;
    }

    @Override
    public String toString() {
        return "SysRole{" +
        "roleId=" + roleId +
        ", roleName=" + roleName +
        ", roleCode=" + roleCode +
        ", orgId=" + orgId +
        ", roleType=" + roleType +
        ", manageAreaId=" + manageAreaId +
        ", remark=" + remark +
        ", sortNo=" + sortNo +
        ", systemId=" + systemId +
        ", delFlag=" + delFlag +
        ", createBy=" + createBy +
        ", createDatetime=" + createDatetime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateDatetime=" + lastUpdateDatetime +
        "}";
    }
}
