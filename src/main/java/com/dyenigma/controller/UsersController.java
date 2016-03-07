package com.dyenigma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsersController {

    private final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        LOGGER.debug("index() is executed!");

        return "main/main";
    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        LOGGER.debug("hello() is executed - $name {}", name);

        ModelAndView model = new ModelAndView();
        model.setViewName("manage/login");

        return model;
    }

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo(HttpServletRequest request) {
        String currentUser = (String) request.getSession().getAttribute("currentUser");
        LOGGER.debug("当前登录的用户为[" + currentUser + "]");
        request.setAttribute("currUser", currentUser);
        return "/manage/demo";
    }
}