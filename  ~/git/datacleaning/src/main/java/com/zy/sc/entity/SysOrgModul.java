package com.zy.sc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class SysOrgModul extends Model<SysOrgModul> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String orgId;

    private String modulId;

    private String delFlag;

    private String createBy;

    private LocalDateTime createDatetime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateDatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getModulId() {
        return modulId;
    }

    public void setModulId(String modulId) {
        this.modulId = modulId;
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
        return this.id;
    }

    @Override
    public String toString() {
        return "SysOrgModul{" +
        "id=" + id +
        ", orgId=" + orgId +
        ", modulId=" + modulId +
        ", delFlag=" + delFlag +
        ", createBy=" + createBy +
        ", createDatetime=" + createDatetime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateDatetime=" + lastUpdateDatetime +
        "}";
    }
}
