package com.cruds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.UserDAO;
import com.cruds.entity.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	public boolean Check(String username,String password)
	{
		return userDAO.check(username, password);
	}
}
