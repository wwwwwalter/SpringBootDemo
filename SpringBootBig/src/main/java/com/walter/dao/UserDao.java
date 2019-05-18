package com.walter.dao;

import com.walter.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    public void insert(User user);

    public List<User> selectAll();
}
