package com.hooper.dubbo.service.impl;

import com.hooper.model.User;
import com.hooper.service.UserService;
import com.hooper.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Tim Hooper
 * @version 1.0
 * @time 2023/04/10/20:41
 */
@DubboService(timeout = 2000)//2秒超时
@Slf4j
public class UserServiceImpl implements UserService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello() {
        return "Hello, Dubbo!";
    }

    @Override
    public User findUserById(Integer id) {
        log.info("服务->{} 处理该消费请求。", serviceName);
        return new User(id, RandomUtil.randomCnName(), RandomUtil.randomNumString(6));
    }
}
