package com.cruds.db;

import com.cruds.entity.User;

public interface UserDAO {

	public boolean check(String username,String password);
	
}

