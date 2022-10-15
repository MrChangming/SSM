package Mrchangming.spring.controller;

import Mrchangming.spring.pojo.User;
import Mrchangming.spring.service.UserService;
import Mrchangming.spring.service.imp.UserServiceImp1;
import org.springframework.stereotype.Controller;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */

public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
