package com.jjbae.app.homework.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BaseballPlayer {
	private String name;
	private String position;
	private int atBats;
	private int hits;
	private float avg;
	private int so;
	private int obp;
	private float soAvg;
	private float obpAvg;
	
	public BaseballPlayer(String name, String position, int atBats, int hits, int so, int obp) {
		this.name = name;
		this.position = position;
		this.atBats = atBats;
		this.hits = hits;
		this.avg = (float)hits / atBats;
		this.so = so;
		this.obp = obp;
		this.soAvg = (float)hits / so;
		this.obpAvg = (hits + obp) / (atBats + obp);
	}

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public int getObp() {
		return obp;
	}

	public void setObp(int obp) {
		this.obp = obp;
	}

	public float getSoAvg() {
		return soAvg;
	}

	public void setSoAvg(float soAvg) {
		this.soAvg = soAvg;
	}

	public float getObpAvg() {
		return obpAvg;
	}

	public void setObpAvg(float obpAvg) {
		this.obpAvg = obpAvg;
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
	
	public int getAtBats() {
		return atBats;
	}
	
	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}
	
	public int getHits() {
		return hits;
	}
	
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
