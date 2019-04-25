package com.example.dockerdemo.web;

import com.example.dockerdemo.domain.User;
import com.example.dockerdemo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
    @RequestMapping("/getUser")
    public User getUser() {
    	User user=userRepository.findByUserName("admin");
        return user;
    }
    
    @RequestMapping("/getUsers")
    public List<User> getUsers() {
    	List<User> users=userRepository.findAll();
        return users;
    }
}