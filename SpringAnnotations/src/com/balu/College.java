package com.balu;

import org.springframework.beans.factory.annotation.Value;

public class College {
	
	@Value("${College.colNumber}")
	private int colNumber;
	
	public void welcome()
	{
		System.out.println("hi welcome");
		System.out.println(colNumber);
	}

}
