package com.relations.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Dept {
	@Id
   private int dept_id;
	@Column(name="name")
   private String name;
	
   @OneToMany(mappedBy="dept",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
   private Set<Employee> employees;
	
	
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int dept_id, String name) {
		super();
		this.dept_id = dept_id;
		this.name = name;
	}
   
   
}
