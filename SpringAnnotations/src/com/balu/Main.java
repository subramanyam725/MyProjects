package com.balu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigFile.class);
		System.out.println("beans file loaded");
		College college = context.getBean("collegeBean", College.class);
		college.welcome();
		
	}

}
