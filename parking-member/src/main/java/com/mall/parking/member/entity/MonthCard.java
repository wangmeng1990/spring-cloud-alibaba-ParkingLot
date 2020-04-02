package com.mall.parking.member.entity;

import java.util.Date;

public class MonthCard {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.id
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.card_no
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String cardNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.start
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String start;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.ends
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String ends;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.member_id
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.create_by
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.create_date
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.update_by
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.update_date
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.remark
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.version
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column month_card.state
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.id
     *
     * @return the value of month_card.id
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.id
     *
     * @param id the value for month_card.id
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.card_no
     *
     * @return the value of month_card.card_no
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.card_no
     *
     * @param cardNo the value for month_card.card_no
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.start
     *
     * @return the value of month_card.start
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.start
     *
     * @param start the value for month_card.start
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.ends
     *
     * @return the value of month_card.ends
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getEnds() {
        return ends;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.ends
     *
     * @param ends the value for month_card.ends
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setEnds(String ends) {
        this.ends = ends == null ? null : ends.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.member_id
     *
     * @return the value of month_card.member_id
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.member_id
     *
     * @param memberId the value for month_card.member_id
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.create_by
     *
     * @return the value of month_card.create_by
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.create_by
     *
     * @param createBy the value for month_card.create_by
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.create_date
     *
     * @return the value of month_card.create_date
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.create_date
     *
     * @param createDate the value for month_card.create_date
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.update_by
     *
     * @return the value of month_card.update_by
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.update_by
     *
     * @param updateBy the value for month_card.update_by
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.update_date
     *
     * @return the value of month_card.update_date
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.update_date
     *
     * @param updateDate the value for month_card.update_date
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.remark
     *
     * @return the value of month_card.remark
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.remark
     *
     * @param remark the value for month_card.remark
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.version
     *
     * @return the value of month_card.version
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.version
     *
     * @param version the value for month_card.version
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column month_card.state
     *
     * @return the value of month_card.state
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column month_card.state
     *
     * @param state the value for month_card.state
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }
}