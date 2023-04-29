package com.project2.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	private int bikeid;
	private String bikename;
	private String cc;
	private String engine;
	private String mileage;
	private String tyretype;
	private String power;
	private String torque;
	private String brake;
	private String price;
	Bike(){}
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
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getTyretype() {
		return tyretype;
	}
	public void setTyretype(String tyretype) {
		this.tyretype = tyretype;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getTorque() {
		return torque;
	}
	public void setTorque(String torque) {
		this.torque = torque;
	}
	public String getBrake() {
		return brake;
	}
	public void setBrake(String brake) {
		this.brake = brake;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Bike(int bikeid, String bikename, String cc, String engine, String mileage, String tyretype, String power,
			String torque, String brake, String price) {
		super();
		this.bikeid = bikeid;
		this.bikename = bikename;
		this.cc = cc;
		this.engine = engine;
		this.mileage = mileage;
		this.tyretype = tyretype;
		this.power = power;
		this.torque = torque;
		this.brake = brake;
		this.price = price;
	}
		
	
	
	
	

}
