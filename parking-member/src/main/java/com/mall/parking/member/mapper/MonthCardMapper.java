package com.mall.parking.member.mapper;

import com.mall.parking.member.entity.MonthCard;
import com.mall.parking.member.entity.MonthCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    long countByExample(MonthCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int deleteByExample(MonthCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int insert(MonthCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int insertSelective(MonthCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    List<MonthCard> selectByExample(MonthCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    MonthCard selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") MonthCard record, @Param("example") MonthCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int updateByExample(@Param("record") MonthCard record, @Param("example") MonthCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int updateByPrimaryKeySelective(MonthCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card
     *
     * @mbg.generated Mon Dec 30 14:08:29 CST 2019
     */
    int updateByPrimaryKey(MonthCard record);
}