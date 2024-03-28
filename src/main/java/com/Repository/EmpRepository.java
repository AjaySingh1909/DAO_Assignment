package com.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.Entity.Employee;

@Repository
public class EmpRepository implements ObjectRepository<Employee>{

	
	public Map<Integer, Employee> repo;
	
	
	public EmpRepository() {
		this.repo=new HashMap<Integer, Employee>();
	}
	
	
	@Override
	public void store(Employee emp) {
		repo.put(emp.getId(), emp);
	}

	@Override
	public Employee get(int id) {
		return repo.get(id);
	}

	@Override
	public Employee delete(int id) {
		
		Employee e=repo.get(id);
		repo.remove(id);
		return e;
		
	}


	@Override
	public List<Employee> getAll() {
		List<Employee> lst=new ArrayList<Employee>();
		for(Entry<Integer, Employee> m: repo.entrySet()) {
			lst.add(m.getValue());
		}
		return lst;
	}
	
}
