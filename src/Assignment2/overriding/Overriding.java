package Assignment2.overriding;
class Vehicle{
	int noofWheels;
	int noOfPassenger;
	int model;
	String make;
	
	public Vehicle(int noofWheels, int noOfPassenger, int model, String make) {
		super();
		this.noofWheels = noofWheels;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}

	public void display() {
		System.out.println("make: "+make);
		System.out.println("model: "+model);
		System.out.println("noOfPassenger: "+noOfPassenger);
		System.out.println("noofWheels:"+noofWheels);
	}
	
}

class Car extends Vehicle{
	int noOFDoor;
	public Car(int noofWheels, int noOfPassenger, int model, String make,int noOFDoor) {
		super(noofWheels, noOfPassenger, model, make);
		this.noOFDoor=noOFDoor;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("noOfDoor:"+ noOFDoor);
	}


	
}

class Convertible extends Car{
boolean isHoodOpen;
	public Convertible(int noofWheels, int noOfPassenger, int model, String make, int noOFDoor,boolean isHoodOpen) {
		super(noofWheels, noOfPassenger, model, make, noOFDoor);
		// TODO Auto-generated constructor stub
		this.isHoodOpen=isHoodOpen;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		if(isHoodOpen) {
			System.out.println("hood is open");
		}else {
			System.out.println("hood is open");
		}
	}
	
	
}
class SportCar extends Car{

	public SportCar(int noofWheels, int noOfPassenger, int model, String make, int noOFDoor) {
		super(noofWheels, noOfPassenger, model, make, 2);
		// TODO Auto-generated constructor stub
	}
	
}



