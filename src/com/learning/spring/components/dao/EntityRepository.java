package com.learning.spring.components.dao;

import java.util.List;

public interface EntityRepository<T> {
 public void save(final T entity);
 public void deleteById(final long entityId);
 public void update(final T entity);
 public List<T> retrieveAll();
 public T retrieveById(final long entityId);
}
