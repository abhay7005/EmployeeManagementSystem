package ems;

public class Employee {
	protected int employeeCode;
	private String employeeName;
	private String employeeDepa;

	protected Employee(int employeeCode, String employeeName, String employeeDepa) {
		
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeDepa = employeeDepa;
	}

//	public Employee(int num1) {
//		
//	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepa() {
		return employeeDepa;
	}

	public void setEmployeeDepa(String employeeDepa) {
		this.employeeDepa = employeeDepa;
	}

	@Override
	public String toString() {
		return  "     "+employeeCode +"\t     "+ employeeName +"\t        "+ employeeDepa;
	}

}
