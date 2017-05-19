package com.pronet.rest.controller;

import com.pronet.service.UserService;
import org.pronet.common.vo.UserVo;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by pr250155 on 5/18/17.
 */
@RestController
@RequestMapping("/user")
public class UserWebService {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/{userId}",method = RequestMethod.GET,produces =
            {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public @ResponseBody UserVo getUserDetails(@PathVariable(value = "userId") int userId){
        return userService.getUser(userId);
    }

    @CrossOrigin
    @RequestMapping(value = "/mirror/{userId}",method = RequestMethod.POST,produces = {MediaType.APPLICATION_XML_VALUE}
            ,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public @ResponseBody UserVo mirror(@PathVariable int userId,@RequestPart MultipartFile multipartFile){
        System.out.print("");
        return null;
    }

    @CrossOrigin
    @RequestMapping(value = "/mirror2/{userId}",method = RequestMethod.POST,produces = {MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_XML_VALUE})
    public @ResponseBody UserVo mirror2(@PathVariable int userId,@RequestBody @Validated UserVo chot){
        System.out.print("");
        return null;
    }
}
