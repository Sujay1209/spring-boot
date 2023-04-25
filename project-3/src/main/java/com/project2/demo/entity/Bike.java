package com.project2.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	public int bikeid;
	public String bikename;
	public String cc;
	public String engine;
	Bike(){
		
	}
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public Bike(int bikeid, String bikename, String cc, String engine) {
		super();
		this.bikeid = bikeid;
		this.bikename = bikename;
		this.cc = cc;
		this.engine = engine;
	}
	
	
	

}
