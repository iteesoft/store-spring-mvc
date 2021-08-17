package com.iteesoft.ems.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "employees")
public class Employee{
	@Id
	@GeneratedValue(strategy =  IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String email;
	private String password;
	private int salary;

	@Transient
	private Integer age;


	@OneToMany(mappedBy = "employee")
	private List<Leave> leaves;

}
