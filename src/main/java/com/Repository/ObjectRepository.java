package com.Repository;

import java.util.List;

public interface ObjectRepository<T> {
	
	public void store(T t);
	
	public T get(int id);
	
	public T delete(int id);
	
	public List<T> getAll();
}
