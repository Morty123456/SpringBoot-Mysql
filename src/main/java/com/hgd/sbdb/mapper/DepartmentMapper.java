package com.hgd.sbdb.mapper;

import com.hgd.sbdb.entities.Department;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface DepartmentMapper {
    @Select("select * from department")
    public Collection<Department> getDepartments();
}
