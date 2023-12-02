package com.giriharan.HCQLExampleApp;

import java.util.List;

public interface DAO<T> {
	public int save(T object);
	public int delete(int id);
	public List<T> getAll(char order); 
	public int update(int id,Integer field);
}
