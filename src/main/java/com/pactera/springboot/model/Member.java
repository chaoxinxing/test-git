package com.pactera.springboot.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pactera.springboot.code.YesOrNo;

import java.util.Date;

@TableName("demo_member")
public class Member {
    @TableId
    private String code;
    private String name;
    private String password;
    private Integer age;
    private String tel;
    private String gender;
    private String status;
    private Date registerTime;
    private Date frozenTime;
    private String staffCode;
    private String staffName;

    public Member(String code, String name, String password, Integer age) {
        this.code = code;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getFrozenTime() {
        return frozenTime;
    }

    public void setFrozenTime(Date frozenTime) {
        this.frozenTime = frozenTime;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}
