package com.jdbc.entity;

public class Student {
	private int id;
	private String name;
	private float percentage;
	public Student(String name, int id, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	

}
