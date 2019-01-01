package com.jun.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping(value = "api/post")
public class PostController{
    private Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "showPost",produces = "application/json;charset=UTF-8")
    public @ResponseBody List<String> showUser(HttpServletRequest request,
                                             HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("UTF-8");
        logger.info("查询所有用户信息");
        List<String> postList = new ArrayList<>();
        return postList;
    }


}