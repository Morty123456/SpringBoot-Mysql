package com.hgd.sbdb.entities;

import java.util.Date;

/**
 * @program: demo
 * @description: 员工类
 * @author: wzh
 * @create: 2019-10-31 20:42
 **/
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private String department;
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date brth) {
        this.birth = brth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"lastName\":\"")
                .append(lastName).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"gender\":")
                .append(gender);
        sb.append(",\"department\":\"")
                .append(department).append('\"');
        sb.append(",\"brth\":\"")
                .append(birth).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
