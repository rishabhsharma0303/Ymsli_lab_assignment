package Assignment2.overriding;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 to create a Vehicle object");
		System.out.println("Enter 2 to create a Car object");
		System.out.println("Enter 3 to create a Convertible object");
		System.out.println("Enter 4 to create a SportCar object.");
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		switch(input) {
		case 1:{
			Vehicle vehicle=new Vehicle(4, 100, 45, "Japan");
			vehicle.display();
			break;
		}
		
	case 2:{
		Car car=new Car(4, 4, 34, "US", 4);
		break;
	}
case 3:{
	Convertible convertible=new Convertible(5, 34, 4, "china", 2, true);

	break;
}
case 4:{
	SportCar sportCar=new SportCar(4, 4, 4, "india", 4);
	sportCar.display();
	break;
}

}

	}

}
