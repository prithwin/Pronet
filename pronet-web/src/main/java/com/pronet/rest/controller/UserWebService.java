package com.pronet.rest.controller;

import com.pronet.service.UserService;
import org.pronet.common.vo.UserVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by pr250155 on 5/18/17.
 */
@RestController
@RequestMapping("/user")
public class UserWebService {

    @Resource
    private UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/{userId}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody UserVo getUserDetails(@PathVariable(value = "userId") int userId){
        return userService.getUser(userId);
    }
}
