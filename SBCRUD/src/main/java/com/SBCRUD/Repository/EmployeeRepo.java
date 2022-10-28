package com.SBCRUD.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SBCRUD.Model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,Integer> {

}
