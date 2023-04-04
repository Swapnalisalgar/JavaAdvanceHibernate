package com.Hibernatecrud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rno;
	
	@Column(name ="name")
	String fname;
	
	@Column
	String age;

	@Column
	int mobNO;
	public int getMobNO() {
		return mobNO;
	}
	public void setMobNO(int mobNO) {
		this.mobNO = mobNO;
	
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String i) {
		this.age = i;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	

}
