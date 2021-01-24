package com.kgisl.tech.spring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kgisl.tech.spring.model.User;

@Transactional
@Repository
public class UserDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> getAllUsers() {

		List<User> allUsers = new ArrayList<>();

		String userQuery = "select id, name, access, emailId from users";
		List<Map<String, Object>> result = jdbcTemplate.queryForList(userQuery);

		for (Map row : result) {
			allUsers.add(new User(row.get("id").toString(), row.get("name").toString(), 
					row.get("access").toString(), row.get("emailId").toString()));
		}

		return allUsers;
	}

}