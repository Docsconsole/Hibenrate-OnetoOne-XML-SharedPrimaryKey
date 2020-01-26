package com.docsconsole.tutorials.hibernate5.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetails implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 88889999999L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_DET_ID")
	private Long empDetId;
	
	@Column(name = "EMP_PHONE_NUMBER")
	private Long empPhoneNum;
	
	@OneToOne
	@JoinColumn(name = "EMP_ID")
	private Employee employee;

	public EmployeeDetails() {
	}

	public Long getEmpDetId() {
		return empDetId;
	}

	public void setEmpDetId(Long empDetId) {
		this.empDetId = empDetId;
	}

	public Long getEmpPhoneNum() {
		return empPhoneNum;
	}

	public void setEmpPhoneNum(Long empPhoneNum) {
		this.empPhoneNum = empPhoneNum;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
