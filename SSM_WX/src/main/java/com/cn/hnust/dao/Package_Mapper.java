package com.cn.hnust.dao;

import com.cn.hnust.pojo.Package_;
import com.cn.hnust.pojo.Package_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Package_Mapper {
    int countByExample(Package_Example example);

    int deleteByExample(Package_Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Package_ record);

    int insertSelective(Package_ record);

    List<Package_> selectByExample(Package_Example example);

    Package_ selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Package_ record, @Param("example") Package_Example example);

    int updateByExample(@Param("record") Package_ record, @Param("example") Package_Example example);

    int updateByPrimaryKeySelective(Package_ record);

    int updateByPrimaryKey(Package_ record);
}