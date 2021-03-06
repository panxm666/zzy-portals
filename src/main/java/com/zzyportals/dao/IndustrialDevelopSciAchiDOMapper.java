package com.zzyportals.dao;

import com.zzyportals.dataobject.IndustrialDevelopSciAchiDO;
import com.zzyportals.dataobject.IndustrialDevelopSciAchiDOKey;

public interface IndustrialDevelopSciAchiDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_sci_achi
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(IndustrialDevelopSciAchiDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_sci_achi
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(IndustrialDevelopSciAchiDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_sci_achi
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(IndustrialDevelopSciAchiDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_sci_achi
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    IndustrialDevelopSciAchiDO selectByPrimaryKey(IndustrialDevelopSciAchiDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_sci_achi
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(IndustrialDevelopSciAchiDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_sci_achi
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(IndustrialDevelopSciAchiDO record);
}