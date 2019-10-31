package com.hgd.sbdb.entities;

/**
 * @program: demo
 * @description: 部门类实体
 * @author: wzh
 * @create: 2019-10-31 20:44
 **/
public class Department {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"departmentName\":\"")
                .append(departmentName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
