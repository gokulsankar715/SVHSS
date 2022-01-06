package com.example.school.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentid;

	private String studentname;

	private String studentstatus;

	private String address;

	private Date dob;

	public student() {

	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentstatus() {
		return studentstatus;
	}

	public void setStudentstatus(String studentstatus) {
		this.studentstatus = studentstatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "student [studentid=" + studentid + ", studentname=" + studentname + ", studentstatus=" + studentstatus
				+ ", address=" + address + ", dob=" + dob + "]";
	}

	public student(int studentid, String studentname, String studentstatus, String address, Date dob) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentstatus = studentstatus;
		this.address = address;
		this.dob = dob;
	}

}
