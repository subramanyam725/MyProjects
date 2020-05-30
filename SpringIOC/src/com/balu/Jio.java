package com.balu;

public class Jio implements Sim{
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void calling() {
		System.out.println("calling using Jio");		
	}

	@Override
	public void data() {
		System.out.println("data using Jio");		
		
	}

}
