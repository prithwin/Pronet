package com.pronet.service.impl;

import com.pronet.eao.UserEAO;
import com.pronet.mapper.UserMapper;
import com.pronet.service.UserService;
import org.pronet.common.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pr250155 on 5/19/17.
 */

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource(name="userEAOImpl")
    private UserEAO userEAO;

    @Override
    public UserVo getUser(int userId) {
        return UserMapper.mapUserEntityToVo(userEAO.getUserEntity(userId));
    }
}
