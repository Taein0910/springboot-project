package com.icecream.springboot.controller;

import com.icecream.springboot.entity.User;
import com.icecream.springboot.entity.Teacher;
import com.icecream.springboot.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
public class TestController {

    private TestService testService;

    @GetMapping(value = "api/test")
    public String test() {
        String json = "{name : 'icecream'}";
        return json;
    }


    @GetMapping(value = "/api/user")
    public List<User> getUserList() {
        return testService.getUserList();
    }

    @GetMapping(value = "/api/teacher")
    public List<Teacher> getTeacherList() {
        return testService.getTeacherList();
    }

    @GetMapping(value = "/api/user/{userId}")
    public String getUser(@PathVariable Long userId) {
        return testService.getUser(userId);
    }



}
