package Assignment4.ques2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(
						new FileWriter("C:\\Users\\ve00ym268\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Assignments\\src\\Assignment4\\ques2\\demo.txt"));) {
			System.out.println("Enter the text");
			String name = reader.readLine();
			System.out.println(name);
			writer.write(name);
			System.out.println("Success");
		} catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}

}
