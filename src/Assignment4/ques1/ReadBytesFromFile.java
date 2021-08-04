package Assignment4.ques1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputfilePath="C:\\Users\\ve00ym268\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Assignments\\src\\Assignment4\\ques1";
		
		
		try {
			File filePath=new File(inputfilePath,"db.txt");
			InputStream file=new FileInputStream(filePath);
			byte[] allBytes=new byte[(int)filePath.length()];
			file.read(allBytes);
			String s=new String(allBytes);
			System.out.println("File Content: "+s);
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
