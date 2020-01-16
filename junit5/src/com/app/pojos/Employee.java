package com.app.pojos;

import java.time.LocalDate;

public class Employee {

	// Id, name, basic salary, department, reporting authority, designation, date of
	// joining

	private String id;
	private String name;
	private double b_sal;
	private String dept;
	private String r_auth;
	private String desg;
	private LocalDate doj;

	public Employee(String id, String name, double b_sal, String dept, String r_auth, String desg, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.b_sal = b_sal;
		this.dept = dept;
		this.r_auth = r_auth;
		this.desg = desg;
		this.doj = doj;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (!id.matches("^ID[0-9][0-9][0-9][0-9][0-9]$")) {
			id = "ID10001";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getB_sal() {
		return b_sal;
	}

	public void setB_sal(double b_sal) {
		this.b_sal = b_sal;
	}

	public double getNetSal() {
		if(b_sal<0)
			b_sal=0;
		return b_sal + 1000;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getR_auth() {
		return r_auth;
	}

	public void setR_auth(String r_auth) {
		this.r_auth = r_auth;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

}
