package com.cruds.db;

import java.util.List;

import com.cruds.entity.Department;

public interface DepartmentDAO {

	
	public boolean Create(Department d);
	
	public List<Department> getall();
	
	public boolean Delete(int deptid);
		
}
