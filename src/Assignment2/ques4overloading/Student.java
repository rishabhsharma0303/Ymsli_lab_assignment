package Assignment2.ques4overloading;

public class Student {
String name;
String id;
double grade;
public Student(String id) {
	this.id = id;
}
public Student(String name, String id) {
	this(id);
		this.name = name;
		
	}

public Student(String name, String id, double grade) {
this(name,id);
this.grade = grade;
}


public void display() {
	System.out.println("name: "+name);
	System.out.println("id: "+id);
	System.out.println("grade: "+grade);
}

public void display(int y) {
	this.display();
	System.out.println("year: "+y);
}

}
