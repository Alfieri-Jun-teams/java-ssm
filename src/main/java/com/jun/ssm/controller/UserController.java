/**
 * Copyright (C), 2015-2018,
 * FileName: UserController
 * Author:   Administrator
 * Date:     2018-10-03 10:19
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * Wangjun           修改时间           版本号              描述
 */

package com.jun.ssm.controller;

import com.jun.ssm.model.User;
import com.jun.ssm.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller()
@RequestMapping("api/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public @ResponseBody User showUser(){
        logger.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        return userList.get(0);
    }
}
