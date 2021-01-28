package com.cruds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@RequestMapping(value="/department",method=RequestMethod.GET)
	public String showDeptform(Model model)
	{
		model.addAttribute("command", new Department());
		
		return "dept";
		
	}

	@RequestMapping(value="/department",method=RequestMethod.POST)
	public String doDept( @RequestParam("deptid") int id,@RequestParam("deptname") String name)
	{
		Department d=new Department(id,name);
		
		System.out.println(d); 
		service.Create(d);
		return "redirect:listdept";
	
	}
	
	@RequestMapping(value="/listdept",method=RequestMethod.GET)
	public String get(Model model)
	{
		 List<Department> list=service.getall();
		model.addAttribute("DEPT_LIST", list);
		
		
		return "listdept";
		
	}
	
	@RequestMapping(value="deldept-{deptid}",method=RequestMethod.GET)
	public String dpDeptdelete(@PathVariable int deptid)
	{
		service.Delete(deptid);
		return "redirect:listdept";
		
		
	}
}
