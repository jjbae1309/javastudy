package com.jjbae.app.homework.derby;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Horse {
	private int speed;
	private String name;
		
		public int getSpeed() {
			return speed;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this);
	}
}
