package com.mallcai.biz.product.dao.mapper;

import com.mallcai.domain.dataobject.product.IcHqProductExtraAttr;
import com.mallcai.domain.dto.IcHqProductExtraAttrExample;
import com.mallcai.domain.enums.HqProductExtraAttrTypeEnum;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IcHqProductExtraAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    long countByExample(IcHqProductExtraAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int deleteByExample(IcHqProductExtraAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int insert(IcHqProductExtraAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int insertSelective(IcHqProductExtraAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    List<IcHqProductExtraAttr> selectByExample(IcHqProductExtraAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    IcHqProductExtraAttr selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") IcHqProductExtraAttr record, @Param("example") IcHqProductExtraAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int updateByExample(@Param("record") IcHqProductExtraAttr record, @Param("example") IcHqProductExtraAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int updateByPrimaryKeySelective(IcHqProductExtraAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ic_hq_product_extra_attr
     *
     * @mbg.generated Mon Oct 14 11:33:55 CST 2019
     */
    int updateByPrimaryKey(IcHqProductExtraAttr record);

    void deleteByHqProductId(@Param("hqProductId") Integer hqProductId, @Param("attrType") HqProductExtraAttrTypeEnum attrType);

    void updateByHqProductId(@Param("record") IcHqProductExtraAttr record);

}