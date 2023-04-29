package com.project2.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.demo.Repository.UserRepository;
import com.project2.demo.entity.UserDetails;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	
	public List<UserDetails> getUserDetail()
	{
		return ur.findAll();
	}

	public UserDetails saveUserDetail(UserDetails u)
	{
		return ur.save(u);
	}
}


