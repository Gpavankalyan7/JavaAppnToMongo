package com.SBCRUD.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection ="Employee")
public class Employee {
	
	@Id
	private Integer id;
	private String name;
	private Double sal;
	
	
	
}
