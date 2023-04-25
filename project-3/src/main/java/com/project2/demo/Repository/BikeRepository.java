package com.project2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.demo.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository <Bike,Integer>{

}
