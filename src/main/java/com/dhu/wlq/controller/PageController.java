package com.dhu.wlq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class PageController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        log.info("进入页面控制器啦");
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("paramA", "hello");
        return mav;
    }

}
