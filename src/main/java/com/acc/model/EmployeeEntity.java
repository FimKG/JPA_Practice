package com.acc.model;

import javax.persistence.*;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSalary;

	public EmployeeEntity() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	//Eclipse
}
