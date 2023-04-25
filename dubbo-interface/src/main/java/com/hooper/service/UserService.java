package com.hooper.service;

import com.hooper.model.User;

/**
 * @author Tim Hooper
 * @version 1.0
 * @time 2023/04/10/21:57
 */
public interface UserService {
    String sayHello();

    User findUserById(Integer id);

}
