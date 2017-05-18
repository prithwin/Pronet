package com.pronet.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pr250155 on 5/18/17.
 */
@RestController
@RequestMapping("/user")
public class UserWebService {

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody String getUserDetails(@PathVariable(value = "userId") int userId){
        return "USER";
    }
}
