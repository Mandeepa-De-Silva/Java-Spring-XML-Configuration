package com.mandeepa.springXML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("heroes.xml");

		Hero superman = context.getBean("superman", Hero.class);
		superman.action();

		Hero wonderWoman1 = context.getBean("wonderWoman", Hero.class);
		wonderWoman1.action();

		Hero wonderWoman2 = context.getBean("wonderWoman", Hero.class);
		wonderWoman2.action();

		Hero talkingCat = context.getBean("talkingCat", Hero.class);
		talkingCat.action();

		// compare the instances of WonderWoman
		System.out.println("Are WonderWoman instances the same? " + (wonderWoman1 == wonderWoman2));
	}

}
