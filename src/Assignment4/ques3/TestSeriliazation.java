package Assignment4.ques3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSeriliazation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address address=new Address("Shahdara");
BankAccount account=new BankAccount("234656");
Employee employee=new Employee("Rishabh", "ve00ym268", address,account);
try {
	FileOutputStream fileoutputStream=new FileOutputStream(new File("demo1.txt"));
	
	ObjectOutputStream oss=new ObjectOutputStream(fileoutputStream);
	oss.writeObject(employee);
	System.out.println("Serialization done");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
