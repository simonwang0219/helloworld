package com.dhu.wlq.controller;

import com.dhu.wlq.dto.UserDTO;
import com.dhu.wlq.model.UserModel;
import com.dhu.wlq.service.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by wanglongqing on 2018/1/31.
 */
@Controller
@Slf4j
public class ParamController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("step1")
    public String step1() {
        return "paraForm";
    }

    @RequestMapping("addUser1")
    public String addUser1(String username, String password) {
        log.info("username = {}, password = {}", username, password);
        return "addUser";
    }

    @RequestMapping("/addUser2")
    public String addUser2(HttpServletRequest request) {
        log.info("username = {}, password = {}", request.getParameter("username"), request.getParameter("password"));
        return "addUser";
    }

    @RequestMapping("addUser3")
    public String addUser3(UserModel user) {
        log.info("username = {}, password = {}", user.getUsername(), user.getPassword());
        UserDTO userDTO = new UserDTO();
        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(userDTO, user);
        } catch (IllegalAccessException e) {
            log.error("复制bean过程中出错");
        } catch (InvocationTargetException e) {
            log.error("复制目标bean出错");
        }
        userService.insertUserInfo(userDTO);
        return "addUser";
    }

    @RequestMapping(value = "/addUser4/{username}/{password}", method = RequestMethod.GET)
    public String addUser4(@PathVariable String username, @PathVariable String password) {
        log.info("username = {}, password = {}", username, password);
        return "addUser";
    }

    @RequestMapping(value = "/addUser5", method = RequestMethod.POST)
    public String addUser5(@ModelAttribute("user") UserModel user) {
        log.info("username = {}, password = {}", user.getUsername(), user.getPassword());
        return "addUser";
    }

    @RequestMapping(value = "/addUser6", method = RequestMethod.GET)
    public String addUser6(@RequestParam("username")String username, @RequestParam("password")String password) {
        log.info("username = {}, password = {}", username, password);
        return "addUser";
    }
}
