package com.walter.service;

import com.walter.bean.User;

import java.util.List;

public interface UserService {
    public void insert(User user);

    public List<User> selectAll();
}
