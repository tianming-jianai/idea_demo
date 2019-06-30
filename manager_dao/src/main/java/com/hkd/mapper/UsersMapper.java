package com.hkd.mapper;

import com.hkd.pojo.Users;

import java.util.List;

/**
 * @Author: 张世罡
 * @Date： 2019/6/30
 * @Description: com.hkd.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUsers(Users users);
    List<Users> selectUsers();
}
