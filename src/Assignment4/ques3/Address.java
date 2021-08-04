package Assignment4.ques3;

import java.io.Serializable;

public class Address implements Serializable{
String address;

public Address(String address) {

	this.address = address;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


}
