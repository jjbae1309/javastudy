package com.jjbae.app.homework.test;

public class Player {
	private String name;
	private String position;
	private int speed;
	private int accel;
	private int goal;
	private int total;
	private int health;
	
	public Player() {
	}
	
	public Player(String name, String position, int speed, int accel, int goal, int health) {
		this.name = name;
		this.position = position;
		this.speed = speed;
		this.accel = accel;
		this.goal = goal;
		this.health = health;
		this.total = speed + accel + goal + health;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getAccel() {
		return accel;
	}
	
	public void setAccel(int accel) {
		this.accel = accel;
	}
	
	public int getGoal() {
		return goal;
	}
	
	public void setGoal(int goal) {
		this.goal = goal;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return String.format("name=%s, position=%s, speed=%s, accel=%s, goal=%s, health=%s, total=%s", 
				name, position, speed, accel, goal, health, total);
	}
}
