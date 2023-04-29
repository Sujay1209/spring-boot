package com.project2.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.demo.Service.LoginService;
import com.project2.demo.entity.Login;


@RestController
public class LoginController {
	
	
	@Autowired
	LoginService ls;
	
	@GetMapping("/getlogin")
	public List<Login> getDetails()
	{
		return ls.getDetails();
	}
	@PostMapping("/checkLogin")
	public String LoginDetails(@RequestBody Login l)
	{
	    System.out.println(l.getUsername());
		return ls.loginCheckData(l.getUsername(),l.getPassword());
	}

	@PostMapping("/addLogin")
	public Login saveLogin(@RequestBody Login l)
	{
		return ls.saveLogin(l);
	}

}
