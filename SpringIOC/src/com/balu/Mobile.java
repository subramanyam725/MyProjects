package com.balu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans.xml file loaded");
		Jio jio = context.getBean("jio",Jio.class);
		System.out.println(jio.getNumber());
		jio.calling();
		jio.data();

	}

}
