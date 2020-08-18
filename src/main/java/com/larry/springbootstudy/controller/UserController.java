package com.larry.springbootstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author larry
 * @date 20/8/18 14:53
 * @description
 */

@RestController
public class UserController {

    @GetMapping("helloUser")
    public String helloUser(){
        return "SpringBoot 好";
    }

}
