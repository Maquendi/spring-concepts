package com.learning.spring.components.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learing.spring.model.PersonInfo;

@Repository
@Transactional
public class PersonInfoRepository implements EntityRepository<PersonInfo> {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(PersonInfo entity) {
		openSession().save(entity);
	}

	@Override
	public void deleteById(long entityId) {
	
	}

	@Override
	public void update(PersonInfo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonInfo> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonInfo retrieveById(long entityId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Session openSession(){
		return sessionFactory.openSession();
	}

}
