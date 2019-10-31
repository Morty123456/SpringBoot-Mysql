package com.hgd.sbdb.mapper;

import com.hgd.sbdb.entities.Employee;
import org.apache.ibatis.annotations.*;

import java.util.Collection;
import java.util.Date;

/**
 * @program: demo
 * @description:
 * @author: wzh
 * @create: 2019-10-31 20:49
 **/
public interface EmployeeMapper {

    @Select("select * from employee")
    public Collection<Employee> getAllEmployee();

    @Select("select * from employee where id=#{id}")
    public Employee getEmployeeById(@Param("id") Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into employee (lastName,gender,email,department,birth) value (#{lastName}, #{gender}, #{email}, #{department}, #{birth})")
    public int saveEmplyee(@Param("lastName") String lastName,
                           @Param("gender") Integer gender,
                           @Param("email") String email,
                           @Param("department") String department,
                           @Param("birth") Date birth);

    @Update("update employee set lastName=#{lastName},gender=#{gender},email=#{email},department=#{department},birth=#{birth} where id=#{id}")
    public int updateEmployee(@Param("id") Integer id,
                              @Param("lastName") String lastName,
                              @Param("gender") Integer gender,
                              @Param("email") String email,
                              @Param("department") String department,
                              @Param("birth") Date birth);

    @Delete("delete from employee where id=#{id}")
    public int deleteEmployee(@Param("id") Integer id);
}
