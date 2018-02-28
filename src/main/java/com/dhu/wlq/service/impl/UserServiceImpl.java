package com.dhu.wlq.service.impl;

import com.dhu.wlq.dao.UserDao;
import com.dhu.wlq.dto.UserDTO;
import com.dhu.wlq.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanglongqing on 2018/2/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void insertUserInfo(UserDTO userDTO) {
        userDao.insertUser(userDTO);
    }
}
