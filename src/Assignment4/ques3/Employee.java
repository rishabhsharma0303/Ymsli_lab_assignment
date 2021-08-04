package Assignment4.ques3;

import java.io.Serializable;

public class Employee implements Serializable{
String name;
String id;
Address address;
static double salary=100000;
BankAccount account;

public Employee(String name, String id, Address address ,BankAccount account) {
	
	this.name = name;
	this.id = id;
	this.address = address;

	this.account=account;
}

public void display() {
	System.out.println("***Employee Information***");
	System.out.println("id :" + id + ",name :" + name + ",bankAccount :" + account.getAccountNo());
	System.out.println("address :" + address.getAddress());
	System.out.println("salary :" + salary);
}
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


}
