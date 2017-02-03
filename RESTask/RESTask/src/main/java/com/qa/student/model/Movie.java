package com.qa.student.model;

public class Movie {
	private static int count = 0;
	private String name;
	private int duration;
	private int id;
	
	public Movie(){
		this.id = count++;
	}
	
	public Movie(String name, int duration){
		this.name = name;
		this.duration = duration;
		this.id = count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getId(){
		return id;
	}
}
