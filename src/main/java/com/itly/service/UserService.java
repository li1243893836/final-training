package com.itly.service;


import com.itly.entity.UserVO;

import java.util.List;

public interface UserService {
    int insert(UserVO uservo);

    int delete(int id);

    int update(UserVO uservo);

    UserVO queryById(int id);

    List<UserVO> queryAll();

    UserVO queryByName(UserVO uservo);

}
