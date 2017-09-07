package com.binggou.entity;

import java.util.Date;

/**
 * Created by BingGou on 2017-09-07.
 */
public class User {
    private Integer id;
    private Integer sex;
    private Integer mark;
    private String name;
    private Date birth;

    public User(){
        this.birth = new Date();
        this.sex = 0;
        this.mark = 99;
        this.name = "武海升";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
