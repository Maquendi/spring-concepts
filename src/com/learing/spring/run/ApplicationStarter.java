package com.learing.spring.run;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learing.spring.model.PersonInfo;
import com.learning.spring.components.services.PersonInfoServiceImpl;
import com.learning.spring.configs.ApplicationConfig;

public class ApplicationStarter {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class)){
			
			PersonInfoServiceImpl service = context.getBean("personInfoServiceImpl", PersonInfoServiceImpl.class);
			
			PersonInfo person = new PersonInfo();
			
			person.setFirstName("Maquendi");
			
			person.setLastName("Beltran Novas");
			
			person.setEmail("beltran_12455@hotmail.com");
			
			person.setIdCardNumber("250-896785-32");
			
			person.setHomePhoneNumber("829-789-9632");
			
			person.setCellPhoneNumber("829-785-9600");
			
			service.saveOne(person);
			
		}
	}
	
	
}
