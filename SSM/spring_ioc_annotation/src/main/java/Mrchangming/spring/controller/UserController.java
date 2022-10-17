package Mrchangming.spring.controller;

import Mrchangming.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */
//@Controller("controller")
@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    public void saveUser(){
        userService.savaUser();
    }
}
