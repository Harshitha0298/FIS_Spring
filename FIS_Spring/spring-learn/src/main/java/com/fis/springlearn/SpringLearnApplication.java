package com.fis.springlearn;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
	}


static void displayDate()  {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
	 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
	 try {
		Date parseDate = (Date) format.parse("31/12/2018");
		System.out.println(parseDate);
	} catch (ParseException e) {
		e.printStackTrace();
	}
}
}