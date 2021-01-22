package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDAO departmentDAO;

	public boolean Create(Department d)
	{
		return departmentDAO.Create(d);
		
	}
	public List<Department> getall()
	{
		
		return departmentDAO.getall();
	
	}
	public boolean Delete(int deptid)
	{
		return departmentDAO.Delete(deptid);
	}
	
}
