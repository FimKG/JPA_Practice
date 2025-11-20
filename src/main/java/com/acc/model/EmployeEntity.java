package com.acc.model;

import javax.persistence.*;

@Entity
public class EmployeEntity {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private Double empSalary;
    private String empRole;

    public EmployeEntity() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}
	/*public void setEmpId(Integer empId) {
		this.empId = empId;
	}*/
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
    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
    public String getEmpRole() {
        return empRole;
    }

}
