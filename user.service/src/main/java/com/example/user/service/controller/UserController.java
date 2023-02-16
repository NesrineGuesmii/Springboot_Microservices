package com.example.user.service.controller;

import com.example.user.service.VO.ResponseTemplateVO;
import com.example.user.service.entity.User;
import com.example.user.service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody  User user){
        log.info("inside saverUser of userController");
        return userService.saveUser(user);
    }

    @GetMapping("{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("inside getUser of userController");
        return userService.getUserWithDepartment(userId);
    }
}
