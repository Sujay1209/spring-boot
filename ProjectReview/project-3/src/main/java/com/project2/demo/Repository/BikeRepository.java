package com.project2.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.demo.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository <Bike,Integer>{
	public List<Bike>findByBikenameStartingWith(String prefix);
	public List<Bike>findByBikenameEndingWith(String suffix);
	public List<Bike>findByEngine(String engine);
	

}
