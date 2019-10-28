package com.learning.spring.components.dao;

import java.util.List;

import com.learing.spring.utils.ResourceNotFound;

public interface EntityRepository<T> {
 public void save(final T entity);
 public void deleteById(final long entityId) throws ResourceNotFound;
 public void update(final T entity);
 public List<T> retrieveAll();
 public T retrieveById(final long entityId) throws ResourceNotFound;
}
