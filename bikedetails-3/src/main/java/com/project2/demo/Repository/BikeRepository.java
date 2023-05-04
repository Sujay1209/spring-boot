package com.project2.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project2.demo.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository <Bike,Integer>{
	public List<Bike>findByBikenameStartingWith(String prefix);
	public List<Bike>findByBikenameEndingWith(String suffix);
	public List<Bike>findByEngine(String engine);
	

	//positional parameter
	@Query("select s from Bike s where s.bikename=?1")
	public List<Bike>getByBikename(String bikename);
	//named parameter
	@Query("select s from Bike s where s.engine=:engine")
	public List<Bike>getByEngine(String engine);
	
	//delete query
	@Modifying
	@Query("delete from Bike s where s.bikename=?1")
	public int deleteBikeByBikename(String bikename);
	//update query
    @Modifying
    @Query("update Bike s set s.bikename=?1 where s.engine=?2")
	public int updateBikeByBikename(String bikename,String engine);
	

}
