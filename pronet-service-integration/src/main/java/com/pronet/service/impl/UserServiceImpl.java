package com.pronet.service.impl;

import com.pronet.service.UserService;
import org.pronet.common.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by pr250155 on 5/19/17.
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserVo getUser(int userId) {
        UserVo user = new UserVo();
        user.setFirstName("SuperGay");
        user.setLastName("theManofTomorow");
        user.setGuid(UUID.randomUUID().toString());
        return user;
    }
}
