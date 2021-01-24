package com.kgisl.tech.spring.controller;

import java.util.List;

import com.kgisl.tech.spring.dao.UserDAO;
import com.kgisl.tech.spring.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("multitenant")
public class UserController{

    @Autowired
    private UserDAO userDao;

    @GetMapping("users")
	public ResponseEntity<List<User>> getListOfUsers() {
    	
    	List<User> user = null;
		try {
			user = userDao.getAllUsers();
			return new ResponseEntity<List<User>>(user, HttpStatus.OK);
		} catch (Exception e) {
			// catch to handle IllegalStateException during datasource lookup
			System.out.println("Exception occurred while getting users: " + e.getMessage());
			return new ResponseEntity<List<User>>(user, HttpStatus.BAD_REQUEST);
		}
	}

}