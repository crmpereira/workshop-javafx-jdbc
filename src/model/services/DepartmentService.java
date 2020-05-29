package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	
	
	public List<Department> findAll() {
		
		List<Department> list  = new ArrayList<>();
		list.add(new Department(1, "Teste1" ));
		list.add(new Department(2, "Teste2" ));
		list.add(new Department(3, "Teste3" ));
		list.add(new Department(4, "Teste4" ));
		
		return list;
		
	}
	
	
}
