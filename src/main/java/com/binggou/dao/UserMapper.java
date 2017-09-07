package com.binggou.dao;

import com.binggou.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by BingGou on 2017-09-07.
 */

public interface UserMapper {



    @Select("SELECT * FROM student")
    @Results({
            @Result(column="name", property="name"),
            @Result(column="sex", property="sex"),
            @Result(column="birth", property="birth")
    })
    List<User> getAll();

    @Insert("INSERT INTO student(name,sex,birth,mark) VALUES(#{name}, #{sex}, #{birth}, #{mark})")
    void insert(User user);

}
