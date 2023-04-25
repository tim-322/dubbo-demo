package com.hooper.dubbo.controller;


import com.hooper.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * @author Tim Hooper
 * @version 1.0
 * @time 2023/04/10/20:42
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference(interfaceClass = UserService.class)
    private UserService userService;

    @GetMapping("sayHello")
    public String sayHello() {
        return userService.sayHello();
    }

    @GetMapping("{id}")
    public Object getUser(@PathVariable Integer id) {
        return userService.findUserById(id);
    }
}
