package com.balu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}

	@Autowired
	@Qualifier("animalHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void test() {
		if (heart == null) {
			System.out.println("you r dead");
		} else {
			System.out.println("u r alive");
		}
	}

}
