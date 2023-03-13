package com.pranav.UserDetails.controller;

import com.pranav.UserDetails.model.Contact;
import com.pranav.UserDetails.model.User;
import com.pranav.UserDetails.service.UserService;
//import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/{userId}")
    public User getUsers(@PathVariable("userId") Long userId)
    {
        User user=this.userService.getUsers(userId);
        List contacts=this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(),List.class);
        user.setContact(contacts);
        return user;
    }
}
