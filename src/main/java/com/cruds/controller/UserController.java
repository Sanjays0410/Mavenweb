package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.entity.User;
import com.cruds.service.UserService;

@Controller
@SessionAttributes("USER")
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showDeptform(Model model)
	{
		model.addAttribute("command", new User());

		return "login";

	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String doDept( @RequestParam("username") String username,@RequestParam("password") String password,RedirectAttributes ra,Model model)
	{
		User u=new User(username, password);

		if(service.Check(username, password))
		{ 
			System.out.println(u);
			model.addAttribute("USER", "Hi :)"+username);
		
			
			return "success";
		}
		else
		{
			ra.addAttribute("MESS","Invalid username or password");

			return "redirect:login";
		}

	}


}
