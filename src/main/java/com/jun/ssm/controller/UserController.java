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

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller()
@RequestMapping("/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest req, Model model){
        logger.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        logger.info("查询所有用户信息"+userList.size());
        model.addAttribute("userList",userList);
        return "showUser";
    }
}
