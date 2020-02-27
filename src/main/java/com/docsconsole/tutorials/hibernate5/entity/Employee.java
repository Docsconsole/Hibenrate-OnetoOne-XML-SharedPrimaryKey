package com.docsconsole.tutorials.hibernate5.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 88889999998L;
	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_SAL")
	private Long empSal;
	
	@OneToOne(mappedBy="employee")
	private EmployeeDetails empDet;
	
	public Employee() {
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Long empSal) {
		this.empSal = empSal;
	}

	public EmployeeDetails getEmpDet() {
		return empDet;
	}

	public void setEmpDet(EmployeeDetails empDet) {
		this.empDet = empDet;
	}

	
	
	

	
}
