package Assignment2.ques4overloading;

import java.util.Scanner;

public class ApplicationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
String name=sc.nextLine();
System.out.println("Enter the id");
String id=sc.nextLine();
System.out.println("Enter the grade");
double grade=sc.nextDouble();
System.out.println("Enter the year");
int year=sc.nextInt();

Student student=new Student(name, id, grade);
student.display(year);

	}

}
