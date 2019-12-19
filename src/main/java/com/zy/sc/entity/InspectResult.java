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
@TableName("InspectResult")
public class InspectResult extends Model<InspectResult> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SubjectId")
    private Integer SubjectId;

    @TableField("ATI")
    private BigDecimal ati;

    @TableField("[Percent]")
    private BigDecimal Percent;

    @TableField("Direction")
    private String Direction;

    @TableField("Part")
    private String Part;

    @TableField("LValue")
    private BigDecimal LValue;

    @TableField("LPercent")
    private BigDecimal LPercent;

    @TableField("LPart")
    private String LPart;

    @TableField("RValue")
    private BigDecimal RValue;

    @TableField("RPercent")
    private BigDecimal RPercent;

    @TableField("RPart")
    private String RPart;

    @TableField("DeviceCode")
    private String DeviceCode;

    @TableField("Evaluate")
    private String Evaluate;

    @TableField("LVertebra")
    private String LVertebra;

    @TableField("RVertebra")
    private String RVertebra;

    @TableField("Vertebra")
    private String Vertebra;

    @TableField("CreatedUserId")
    private Integer CreatedUserId;

    @TableField("CreatedDate")
    private LocalDateTime CreatedDate;

    @TableField("OrgCode")
    private String OrgCode;

    @TableField("OrginalData")
    private String OrginalData;

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

    public BigDecimal getAti() {
        return ati;
    }

    public void setAti(BigDecimal ati) {
        this.ati = ati;
    }

    public BigDecimal getPercent() {
        return Percent;
    }

    public void setPercent(BigDecimal Percent) {
        this.Percent = Percent;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public String getPart() {
        return Part;
    }

    public void setPart(String Part) {
        this.Part = Part;
    }

    public BigDecimal getLValue() {
        return LValue;
    }

    public void setLValue(BigDecimal LValue) {
        this.LValue = LValue;
    }

    public BigDecimal getLPercent() {
        return LPercent;
    }

    public void setLPercent(BigDecimal LPercent) {
        this.LPercent = LPercent;
    }

    public String getLPart() {
        return LPart;
    }

    public void setLPart(String LPart) {
        this.LPart = LPart;
    }

    public BigDecimal getRValue() {
        return RValue;
    }

    public void setRValue(BigDecimal RValue) {
        this.RValue = RValue;
    }

    public BigDecimal getRPercent() {
        return RPercent;
    }

    public void setRPercent(BigDecimal RPercent) {
        this.RPercent = RPercent;
    }

    public String getRPart() {
        return RPart;
    }

    public void setRPart(String RPart) {
        this.RPart = RPart;
    }

    public String getDeviceCode() {
        return DeviceCode;
    }

    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    public String getEvaluate() {
        return Evaluate;
    }

    public void setEvaluate(String Evaluate) {
        this.Evaluate = Evaluate;
    }

    public String getLVertebra() {
        return LVertebra;
    }

    public void setLVertebra(String LVertebra) {
        this.LVertebra = LVertebra;
    }

    public String getRVertebra() {
        return RVertebra;
    }

    public void setRVertebra(String RVertebra) {
        this.RVertebra = RVertebra;
    }

    public String getVertebra() {
        return Vertebra;
    }

    public void setVertebra(String Vertebra) {
        this.Vertebra = Vertebra;
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
        return "InspectResult{" +
        "Id=" + Id +
        ", SubjectId=" + SubjectId +
        ", ati=" + ati +
        ", Percent=" + Percent +
        ", Direction=" + Direction +
        ", Part=" + Part +
        ", LValue=" + LValue +
        ", LPercent=" + LPercent +
        ", LPart=" + LPart +
        ", RValue=" + RValue +
        ", RPercent=" + RPercent +
        ", RPart=" + RPart +
        ", DeviceCode=" + DeviceCode +
        ", Evaluate=" + Evaluate +
        ", LVertebra=" + LVertebra +
        ", RVertebra=" + RVertebra +
        ", Vertebra=" + Vertebra +
        ", CreatedUserId=" + CreatedUserId +
        ", CreatedDate=" + CreatedDate +
        ", OrgCode=" + OrgCode +
        ", OrginalData=" + OrginalData +
        ", DeletedDate=" + DeletedDate +
        ", DeletedUserId=" + DeletedUserId +
        "}";
    }
}
