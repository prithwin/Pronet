package com.pronet.mapper;

import com.pronet.entity.UserEntity;
import org.pronet.common.vo.UserVo;

/**
 * Created by pr250155 on 5/19/17.
 */
public class UserMapper {
    public static UserVo mapUserEntityToVo(UserEntity userEntity){
         UserVo user = new UserVo();
        user.setFirstName(userEntity.getFirstName());
        user.setLastName(userEntity.getLastName());
        user.setGuid(userEntity.getGuid());
        return user;
    }
}
