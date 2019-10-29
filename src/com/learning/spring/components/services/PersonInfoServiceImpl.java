package com.learning.spring.components.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learing.spring.model.PersonInfo;
import com.learning.spring.components.dao.EntityRepository;


@Service
public class PersonInfoServiceImpl {

	private final Log LOGGER = LogFactory.getLog(PersonInfoServiceImpl.class);
	
	@Autowired
	private EntityRepository<PersonInfo> repository;
	
	public void saveOne(final PersonInfo person) {
		LOGGER.info("Saving this person " + person);
		repository.save(person);
	}
	
}
