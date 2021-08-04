package Assignment6.ques4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompareDoublesFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	try {
		Scanner sc=new Scanner(new File("C:\\Users\\ve00ym268\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Assignments\\src\\Assignment6\\ques4\\data.txt"));
		double largest=sc.nextDouble();
		while(sc.hasNextDouble()) {
			Double no=sc.nextDouble();
			largest=Math.max(largest, no);
		}
		sc.close();
		System.out.println(largest);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
