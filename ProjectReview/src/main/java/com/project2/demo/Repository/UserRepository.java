package com.project2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.demo.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails,Integer>{

}
