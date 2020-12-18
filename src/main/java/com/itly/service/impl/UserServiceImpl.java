package com.itly.service.impl;


import com.itly.entity.UserVO;
import com.itly.mapper.UserMapper;
import com.itly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(UserVO uservo) {
        return userMapper.insert(uservo);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(UserVO uservo) {
        return userMapper.update(uservo);
    }

    @Override
    public UserVO queryById(int id) {
        return userMapper.queryById(id);
    }

    @Override
    public List<UserVO> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public UserVO queryByName(UserVO uservo) {
        return userMapper.queryByName(uservo);
    }
}
