package com.edu;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hibstudent")
public class Student {
	
@Id
	
private int rollno;
private String name;
@OneToOne
laptop lp;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;


}
public laptop getLp() {
	return lp;
}
public void setLp(laptop lp) {
	this.lp = lp;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", lp=" + lp + "]";
}


	
}
