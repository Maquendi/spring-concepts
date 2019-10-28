package com.learing.spring.run;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learing.spring.model.PersonInfo;
import com.learning.spring.components.dao.PersonInfoRepository;
import com.learning.spring.configs.ApplicationConfig;

public class ApplicationStarter {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		PersonInfoRepository repo = (PersonInfoRepository)context.getBean("PersonInfoRepository", PersonInfoRepository.class);
		
		PersonInfo person = new PersonInfo();
		
		person.setFirstName("Maquendi");
		person.setLastName("Beltran Novas");
		
		repo.save(person);
	}
	
	
}
