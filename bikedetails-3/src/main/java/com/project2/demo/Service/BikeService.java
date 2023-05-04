package com.project2.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import com.project2.demo.Repository.BikeRepository;
import com.project2.demo.entity.Bike;

import jakarta.transaction.Transactional;

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
	public List<Bike>sortby(String field)
	{
		return br.findAll(Sort.by(Direction.DESC,field));
		
	}
	public List<Bike>paging(int offset,int pagesize )
	{
		Pageable paging =PageRequest.of(offset,pagesize);
		Page<Bike>data=br.findAll(paging);
		List<Bike>Bikelist=data.getContent();
		return Bikelist;
		
	}
	public List<Bike>page(int offset,int pagesize,String field)
	{
		Pageable paging =PageRequest.of(offset, pagesize,Sort.by(field));
		Page<Bike>data=br.findAll(paging);
		List<Bike>bikeList=data.getContent();
		return bikeList;
	}
	public List<Bike>fetchBikePrefix(String prefix)
	{
		return br.findByBikenameStartingWith(prefix);
	}
	public List<Bike>fetchBikeSufix(String sufix)
	{
		return br.findByBikenameEndingWith(sufix);
	}
	public List<Bike>fetchBikeEngine(String engine)
	{
		return br.findByEngine(engine);
	}
	public List<Bike>getByBikename(String bikename)
	{
		return br.getByBikename(bikename);
	}
	public List<Bike>getByEngine(String engine)
	{
		return br.getByEngine(engine);
	}
	@Transactional
	public int deleteByBikename(String bikename)
	{
		return br.deleteBikeByBikename(bikename);
	}
	@Transactional
	public int updateByBikename(String bikename,String engine)
	{
		return br.updateBikeByBikename(bikename,engine);
	}
	
	
}

	
