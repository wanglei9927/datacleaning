package com.zy.sc.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
@TableName("CurvesInsepctResult")
@ToString
public class CurvesInsepctResult extends Model<CurvesInsepctResult> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SubjectId")
    private Integer SubjectId;

        /**
     * 前凸
     */
         @TableField("FrontBulgeDegree")
    private BigDecimal FrontBulgeDegree;

        /**
     * 后凸
     */
         @TableField("BehindBulgeDegree")
    private BigDecimal BehindBulgeDegree;

        /**
     * 前凸起点
     */
         @TableField("StartFrontBulgePoint")
    private Integer StartFrontBulgePoint;

        /**
     * 后凸起点
     */
         @TableField("StartBehindBulgePoint")
    private Integer StartBehindBulgePoint;

        /**
     * 起点前凸百分位
     */
         @TableField("StartFrontBulgePercent")
    private BigDecimal StartFrontBulgePercent;

        /**
     * 后凸起点百分位
     */
         @TableField("StartBehindBulgePercent")
    private BigDecimal StartBehindBulgePercent;

        /**
     * 前凸点
     */
         @TableField("FrontBulgePoint")
    private Integer FrontBulgePoint;

        /**
     * 后凸点
     */
         @TableField("BehindBulgePoint")
    private Integer BehindBulgePoint;

        /**
     * 后凸点百分位
     */
         @TableField("FrontBulgePercent")
    private BigDecimal FrontBulgePercent;

    @TableField("BehindbulgePercent")
    private BigDecimal BehindbulgePercent;

        /**
     * 前凸止点
     */
         @TableField("EndFrontBulgePoint")
    private Integer EndFrontBulgePoint;

        /**
     * 后凸止点
     */
         @TableField("EndBehindBulgePoint")
    private Integer EndBehindBulgePoint;

        /**
     * 前凸止点百分位
     */
         @TableField("EndFrontBulgePercent")
    private BigDecimal EndFrontBulgePercent;

        /**
     * 后凸止点百分位
     */
         @TableField("EndBehindBulgePercent")
    private BigDecimal EndBehindBulgePercent;

    @TableField("FrontBulgePart")
    private Integer FrontBulgePart;

    @TableField("BehindBulgePart")
    private Integer BehindBulgePart;

    @TableField("Evaluate")
    private String Evaluate;

    @TableField("CreatedUserId")
    private Integer CreatedUserId;

    @TableField("CreatedDate")
    private LocalDateTime CreatedDate;

    @TableField("OrgCode")
    private String OrgCode;

    @TableField("OrginalData")
    private String OrginalData;

    @TableField("ProductCode")
    private String ProductCode;

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

    public BigDecimal getFrontBulgeDegree() {
        return FrontBulgeDegree;
    }

    public void setFrontBulgeDegree(BigDecimal FrontBulgeDegree) {
        this.FrontBulgeDegree = FrontBulgeDegree;
    }

    public BigDecimal getBehindBulgeDegree() {
        return BehindBulgeDegree;
    }

    public void setBehindBulgeDegree(BigDecimal BehindBulgeDegree) {
        this.BehindBulgeDegree = BehindBulgeDegree;
    }

    public Integer getStartFrontBulgePoint() {
        return StartFrontBulgePoint;
    }

    public void setStartFrontBulgePoint(Integer StartFrontBulgePoint) {
        this.StartFrontBulgePoint = StartFrontBulgePoint;
    }

    public Integer getStartBehindBulgePoint() {
        return StartBehindBulgePoint;
    }

    public void setStartBehindBulgePoint(Integer StartBehindBulgePoint) {
        this.StartBehindBulgePoint = StartBehindBulgePoint;
    }

    public BigDecimal getStartFrontBulgePercent() {
        return StartFrontBulgePercent;
    }

    public void setStartFrontBulgePercent(BigDecimal StartFrontBulgePercent) {
        this.StartFrontBulgePercent = StartFrontBulgePercent;
    }

    public BigDecimal getStartBehindBulgePercent() {
        return StartBehindBulgePercent;
    }

    public void setStartBehindBulgePercent(BigDecimal StartBehindBulgePercent) {
        this.StartBehindBulgePercent = StartBehindBulgePercent;
    }

    public Integer getFrontBulgePoint() {
        return FrontBulgePoint;
    }

    public void setFrontBulgePoint(Integer FrontBulgePoint) {
        this.FrontBulgePoint = FrontBulgePoint;
    }

    public Integer getBehindBulgePoint() {
        return BehindBulgePoint;
    }

    public void setBehindBulgePoint(Integer BehindBulgePoint) {
        this.BehindBulgePoint = BehindBulgePoint;
    }

    public BigDecimal getFrontBulgePercent() {
        return FrontBulgePercent;
    }

    public void setFrontBulgePercent(BigDecimal FrontBulgePercent) {
        this.FrontBulgePercent = FrontBulgePercent;
    }

    public BigDecimal getBehindbulgePercent() {
        return BehindbulgePercent;
    }

    public void setBehindbulgePercent(BigDecimal BehindbulgePercent) {
        this.BehindbulgePercent = BehindbulgePercent;
    }

    public Integer getEndFrontBulgePoint() {
        return EndFrontBulgePoint;
    }

    public void setEndFrontBulgePoint(Integer EndFrontBulgePoint) {
        this.EndFrontBulgePoint = EndFrontBulgePoint;
    }

    public Integer getEndBehindBulgePoint() {
        return EndBehindBulgePoint;
    }

    public void setEndBehindBulgePoint(Integer EndBehindBulgePoint) {
        this.EndBehindBulgePoint = EndBehindBulgePoint;
    }

    public BigDecimal getEndFrontBulgePercent() {
        return EndFrontBulgePercent;
    }

    public void setEndFrontBulgePercent(BigDecimal EndFrontBulgePercent) {
        this.EndFrontBulgePercent = EndFrontBulgePercent;
    }

    public BigDecimal getEndBehindBulgePercent() {
        return EndBehindBulgePercent;
    }

    public void setEndBehindBulgePercent(BigDecimal EndBehindBulgePercent) {
        this.EndBehindBulgePercent = EndBehindBulgePercent;
    }

    public Integer getFrontBulgePart() {
        return FrontBulgePart;
    }

    public void setFrontBulgePart(Integer FrontBulgePart) {
        this.FrontBulgePart = FrontBulgePart;
    }

    public Integer getBehindBulgePart() {
        return BehindBulgePart;
    }

    public void setBehindBulgePart(Integer BehindBulgePart) {
        this.BehindBulgePart = BehindBulgePart;
    }

    public String getEvaluate() {
        return Evaluate;
    }

    public void setEvaluate(String Evaluate) {
        this.Evaluate = Evaluate;
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

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
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
        return "CurvesInsepctResult{" +
        "Id=" + Id +
        ", SubjectId=" + SubjectId +
        ", FrontBulgeDegree=" + FrontBulgeDegree +
        ", BehindBulgeDegree=" + BehindBulgeDegree +
        ", StartFrontBulgePoint=" + StartFrontBulgePoint +
        ", StartBehindBulgePoint=" + StartBehindBulgePoint +
        ", StartFrontBulgePercent=" + StartFrontBulgePercent +
        ", StartBehindBulgePercent=" + StartBehindBulgePercent +
        ", FrontBulgePoint=" + FrontBulgePoint +
        ", BehindBulgePoint=" + BehindBulgePoint +
        ", FrontBulgePercent=" + FrontBulgePercent +
        ", BehindbulgePercent=" + BehindbulgePercent +
        ", EndFrontBulgePoint=" + EndFrontBulgePoint +
        ", EndBehindBulgePoint=" + EndBehindBulgePoint +
        ", EndFrontBulgePercent=" + EndFrontBulgePercent +
        ", EndBehindBulgePercent=" + EndBehindBulgePercent +
        ", FrontBulgePart=" + FrontBulgePart +
        ", BehindBulgePart=" + BehindBulgePart +
        ", Evaluate=" + Evaluate +
        ", CreatedUserId=" + CreatedUserId +
        ", CreatedDate=" + CreatedDate +
        ", OrgCode=" + OrgCode +
        ", OrginalData=" + OrginalData +
        ", ProductCode=" + ProductCode +
        ", DeletedDate=" + DeletedDate +
        ", DeletedUserId=" + DeletedUserId +
        "}";
    }
}
