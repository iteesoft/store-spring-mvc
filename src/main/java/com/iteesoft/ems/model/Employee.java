package com.iteesoft.ems.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Employee{
	@Id
	@GeneratedValue(strategy =  IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int salary;
	private String role;

	@OneToMany(mappedBy = "employee")
	private List<Leave> leaveRequests;

	@OneToMany(mappedBy = "employee")
	private List<Attendance> attendanceList;

}
