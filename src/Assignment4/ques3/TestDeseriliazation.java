package Assignment4.ques3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;


public class TestDeseriliazation {
public static void main(String[] args) {
FileInputStream fileinputStream;
try {
	fileinputStream = new FileInputStream(new File("demo1.txt"));
	ObjectInputStream ois=new ObjectInputStream(fileinputStream);
	Employee e=(Employee) ois.readObject();
	//BankAccount account=(BankAccount) ois.readObject();
	System.out.println("Deserialization done");
	e.display();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
}
}
