package com.primfaces.backbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.primfaces.bo.Employee;

import jakarta.annotation.PostConstruct;

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {

	private List<Employee> employees = new ArrayList<Employee>();

	public ViewEmployeesManagedBean() {

	}

	@PostConstruct
	public void populateEmployeeList() {
		for (int i = 1; i <= 10; i++) {
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#" + i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
