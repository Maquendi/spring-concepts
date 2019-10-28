package com.learning.spring.components.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learing.spring.model.PersonInfo;
import com.learing.spring.utils.ResourceNotFound;

@Repository(value="PersonInfoRepository")
@Transactional
public class PersonInfoRepository implements EntityRepository<PersonInfo> {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(PersonInfo entity) {
		openSession().save(entity);
	}

	@Override
	@Transactional
	public void deleteById(long entityId) throws ResourceNotFound{
	  final PersonInfo personInfo = retrieveById(entityId);
	  if( personInfo != null) {
		  openSession().delete(personInfo);   
	    } else {
	    	throw new ResourceNotFound("unable to delete personInfo with id ==>> " + entityId);
	    }
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
	@Transactional
	public PersonInfo retrieveById(long entityId) throws ResourceNotFound {
		 PersonInfo personInfo = null;
		 try {
				@SuppressWarnings("deprecation")
				Criteria criteria = openSession().createCriteria(PersonInfo.class);
				criteria.add(Restrictions.eq("id", entityId));
				personInfo = (PersonInfo) criteria.uniqueResult();
			 
		 }catch(Exception ex) {
			throw new ResourceNotFound("unable to delete personInfo with id ==>> " + entityId);
		 }
		
		return personInfo;
	}
	
	private Session openSession(){
		return sessionFactory.openSession();
	}

}
