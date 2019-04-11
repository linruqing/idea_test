package com.neusoft.mapper;

import com.neusoft.pojo.User;
import java.util.List;

public interface UserMapper {
    void insertUser(User user);

    List<User> selectUserAll();
}
