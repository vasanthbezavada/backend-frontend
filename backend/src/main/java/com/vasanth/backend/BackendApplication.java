package com.vasanth.backend;

import com.vasanth.backend.model.Person;
import com.vasanth.backend.service.PersonServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		ApplicationContext app =
		SpringApplication.run(BackendApplication.class, args);
		PersonServiceImpl obj= app.getBean(PersonServiceImpl.class);
		for(int i=10001;i<10008;i++)
			obj.createPerson(new Person(i,"vasanth","bezavada","java","fresher"));
	}

}
