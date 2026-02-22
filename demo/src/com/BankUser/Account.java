package com.BankUser;

 class Account {
	 private String name;
	 private long accno;
	 private double bal;
 public Account(String name , long accno) {
	 this.name=name;
	 this.accno=accno;
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal=bal;
}
}