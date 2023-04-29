package com.project2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.demo.entity.Login;



@Repository
public interface LoginRepository extends JpaRepository<Login,Integer>{

	Login findByUsername(String username);

}
