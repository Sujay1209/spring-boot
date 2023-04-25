package com.project2.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.demo.Repository.BikeRepository;
import com.project2.demo.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeRepository br;
	
	public List<Bike> getall()
	{
		return br.findAll();
	}
	public Bike saveall(Bike b)
	{
		return br.save(b);
	}
	public Bike update(Bike b)
	{
		return br.save(b);
	}
	public void delete(int id)
	{
		br.deleteById(id);
	}
	public Optional<Bike> find(int id)
	{
		return br.findById(id);
	}
	
}

	
