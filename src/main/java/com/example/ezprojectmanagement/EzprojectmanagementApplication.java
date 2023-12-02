package com.example.ezprojectmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class EzprojectmanagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EzprojectmanagementApplication.class, args);
//		Populator populate = context.getBean("populate", Populator.class);
//		populate.populate();
	}

}
