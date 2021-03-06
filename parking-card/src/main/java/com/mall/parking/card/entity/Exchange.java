package com.mall.parking.card.entity;

import java.util.Date;

public class Exchange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.id
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.member_id
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.card_qty
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private Integer cardQty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.ctype
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private Integer ctype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.code
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.create_by
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.create_date
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.update_by
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.update_date
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.remark
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.version
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exchange.state
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.id
     *
     * @return the value of exchange.id
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.id
     *
     * @param id the value for exchange.id
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.member_id
     *
     * @return the value of exchange.member_id
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.member_id
     *
     * @param memberId the value for exchange.member_id
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.card_qty
     *
     * @return the value of exchange.card_qty
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public Integer getCardQty() {
        return cardQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.card_qty
     *
     * @param cardQty the value for exchange.card_qty
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setCardQty(Integer cardQty) {
        this.cardQty = cardQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.ctype
     *
     * @return the value of exchange.ctype
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public Integer getCtype() {
        return ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.ctype
     *
     * @param ctype the value for exchange.ctype
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.code
     *
     * @return the value of exchange.code
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.code
     *
     * @param code the value for exchange.code
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.create_by
     *
     * @return the value of exchange.create_by
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.create_by
     *
     * @param createBy the value for exchange.create_by
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.create_date
     *
     * @return the value of exchange.create_date
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.create_date
     *
     * @param createDate the value for exchange.create_date
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.update_by
     *
     * @return the value of exchange.update_by
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.update_by
     *
     * @param updateBy the value for exchange.update_by
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.update_date
     *
     * @return the value of exchange.update_date
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.update_date
     *
     * @param updateDate the value for exchange.update_date
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.remark
     *
     * @return the value of exchange.remark
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.remark
     *
     * @param remark the value for exchange.remark
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.version
     *
     * @return the value of exchange.version
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.version
     *
     * @param version the value for exchange.version
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exchange.state
     *
     * @return the value of exchange.state
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exchange.state
     *
     * @param state the value for exchange.state
     *
     * @mbg.generated Thu Jan 02 14:33:41 CST 2020
     */
    public void setState(Integer state) {
        this.state = state;
    }
}