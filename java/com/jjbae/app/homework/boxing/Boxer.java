package com.jjbae.app.homework.boxing;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Boxer {
	// field
	private String name;
	private Gender gender;
	private int age;
	private int weight;
	private Hand hand;
	private int health;
	private int strength;
	
	// constructor
	public Boxer(String name, Gender gender, int age, int weight, Hand hand, int health, int strength) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.hand = hand;
		this.health = health;
		this.strength = strength;
	}
	
	// method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
