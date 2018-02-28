package com.dhu.wlq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wanglongqing on 2018/1/10.
 */
@Slf4j
@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        log.info("进入页面控制器啦");
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("paramA", "register");
        return mav;
    }
}
