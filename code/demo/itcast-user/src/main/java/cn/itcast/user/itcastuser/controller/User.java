package cn.itcast.user.itcastuser.controller;

import cn.itcast.user.itcastuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")

public class User {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public cn.itcast.user.itcastuser.pojo.User queryById(@PathVariable("id") Integer id) {
        return userService.queryUserById(id);
    }

    @GetMapping("test")
    @ResponseBody
    public String test() {

        return "hello user!";
    }
}
