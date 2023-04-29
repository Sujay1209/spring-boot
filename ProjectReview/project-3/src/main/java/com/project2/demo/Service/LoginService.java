package com.project2.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.demo.Repository.LoginRepository;
import com.project2.demo.entity.Login;

@Service
public class LoginService {

	@Autowired
	LoginRepository lr;
    
    public List<Login> getDetails()
    {
    	return lr.findAll();
    }
    
    public Login saveLogin(Login l)
	{
		return lr.save(l);
	}
    
    public String loginCheckData(String username,String password)
    {
    	Login user=lr.findByUsername(username);
    	if(user==null)
    	{
    		return "No user Found";
    	}
    	else
    	{
    		if(user.getPassword().equals(password))
    		{
    			return "Login Successful";
    		}
    		else
    		{
    			return "Login Failed";
    		}	
    	}
    	
    }
	
}
