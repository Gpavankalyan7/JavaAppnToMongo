package com.SBCRUD.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SBCRUD.Model.Employee;
import com.SBCRUD.Repository.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo er;
	
	
	@PostMapping("/AddEmp")
	public String saveEmp(@RequestBody Employee emp) {
	  er.insert(emp);
	   return "Employee saved ";
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee>getEmployees(){
		return er.findAll();
	}
	
	@PutMapping("/update/{emp}")
	public Employee UpdateEmp(@RequestBody Employee emp,@PathVariable Integer id)
	{
		
		
		return emp;
		
	}
	
	@GetMapping("/findBookById/{id}")
	public Optional<Employee>getOneEmp(@PathVariable Integer id){
		
		return er.findById(id);
	}
	
	public String deletebook(@PathVariable Integer id)
	{
		er.deleteById(id);
		return "book deleted ";
	}
	
	
}
