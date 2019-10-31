package com.hgd.sbdb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program: demo
 * @description:
 * @author: wzh
 * @create: 2019-10-31 20:50
 **/
public interface UserMapper {
    @Select("select password from user where id=#{id}")
    public String getPassWordById(String id);
}
