package com.java.emparrylist;

public class Employees implements Comparable<Employees> {
	private Integer empId;
	private String empName;
	private Double empSalary;	

	public Employees(Integer empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
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
	
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	@Override
	public int compareTo(Employees o) {
		return this.empName.compareTo(o.empName);
	}	
}
