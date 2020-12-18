package com.itly.mapper;

import com.itly.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(UserVO uservo);

    UserVO queryById(int id);

    int update(UserVO uservo);

    int delete(int id);

    List<UserVO> queryAll();

    UserVO queryByName(UserVO uservo);
}
