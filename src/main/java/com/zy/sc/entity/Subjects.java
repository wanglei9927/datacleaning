package com.zy.sc.entity;

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
@TableName("Subjects")
public class Subjects extends Model<Subjects> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Code")
    private String Code;

    @TableField("RealName")
    private String RealName;

    @TableField("Gender")
    private Integer Gender;

    @TableField("Birthday")
    private LocalDateTime Birthday;

    @TableField("IDCardNum")
    private String IDCardNum;

    @TableField("Company")
    private String Company;

    @TableField("Phone")
    private String Phone;

    @TableField("Address")
    private String Address;

    @TableField("CreatedDate")
    private LocalDateTime CreatedDate;

    @TableField("UpdatedDate")
    private LocalDateTime UpdatedDate;

    @TableField("Pwd")
    private String Pwd;

    @TableField("Salt")
    private String Salt;

    @TableField("Memo")
    private String Memo;

    @TableField("CreatedUserId")
    private Integer CreatedUserId;

    @TableField("UpdatedUserId")
    private Integer UpdatedUserId;

    @TableField("DeletedUserId")
    private Integer DeletedUserId;

    @TableField("DeletedDate")
    private LocalDateTime DeletedDate;

    @TableField("OrgCode")
    private String OrgCode;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    public LocalDateTime getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDateTime Birthday) {
        this.Birthday = Birthday;
    }

    public String getIDCardNum() {
        return IDCardNum;
    }

    public void setIDCardNum(String IDCardNum) {
        this.IDCardNum = IDCardNum;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public LocalDateTime getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(LocalDateTime CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public LocalDateTime getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(LocalDateTime UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String Salt) {
        this.Salt = Salt;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    public Integer getCreatedUserId() {
        return CreatedUserId;
    }

    public void setCreatedUserId(Integer CreatedUserId) {
        this.CreatedUserId = CreatedUserId;
    }

    public Integer getUpdatedUserId() {
        return UpdatedUserId;
    }

    public void setUpdatedUserId(Integer UpdatedUserId) {
        this.UpdatedUserId = UpdatedUserId;
    }

    public Integer getDeletedUserId() {
        return DeletedUserId;
    }

    public void setDeletedUserId(Integer DeletedUserId) {
        this.DeletedUserId = DeletedUserId;
    }

    public LocalDateTime getDeletedDate() {
        return DeletedDate;
    }

    public void setDeletedDate(LocalDateTime DeletedDate) {
        this.DeletedDate = DeletedDate;
    }

    public String getOrgCode() {
        return OrgCode;
    }

    public void setOrgCode(String OrgCode) {
        this.OrgCode = OrgCode;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "Subjects{" +
        "Id=" + Id +
        ", Code=" + Code +
        ", RealName=" + RealName +
        ", Gender=" + Gender +
        ", Birthday=" + Birthday +
        ", IDCardNum=" + IDCardNum +
        ", Company=" + Company +
        ", Phone=" + Phone +
        ", Address=" + Address +
        ", CreatedDate=" + CreatedDate +
        ", UpdatedDate=" + UpdatedDate +
        ", Pwd=" + Pwd +
        ", Salt=" + Salt +
        ", Memo=" + Memo +
        ", CreatedUserId=" + CreatedUserId +
        ", UpdatedUserId=" + UpdatedUserId +
        ", DeletedUserId=" + DeletedUserId +
        ", DeletedDate=" + DeletedDate +
        ", OrgCode=" + OrgCode +
        "}";
    }
}
