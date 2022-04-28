package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hiblaptop")
public class laptop {
@Id
private int lid;
private String lname;
private float lprice;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public float getLprice() {
	return lprice;
}
public void setLprice(float lprice) {
	this.lprice = lprice;
}
@Override
public String toString() {
	return "laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
}

}
