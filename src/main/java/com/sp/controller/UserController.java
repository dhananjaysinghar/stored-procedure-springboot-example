package com.sp.controller;


import com.sp.entity.User;
import com.sp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/users")
@Transactional
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("byId/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userRepository.findUserWithId(id);
    }

    @GetMapping("byAddress/{address}")
    public Integer countUserByAddress(@PathVariable String address) {
        return userRepository.countByAddress(address);
    }
}
