package Assignment4.ques1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteByteIntoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream opStream=null;
		 
		String strContent="This example shows how to write byte content into file";
		byte[] byteContent=strContent.getBytes();
		File myFile=new File("C:\\Users\\ve00ym268\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Assignments\\src\\Assignment4\\ques1/MyTestFile.txt");
if(!myFile.exists()) {
	try {
		myFile.createNewFile();
		opStream=new FileOutputStream(myFile);
		opStream.write(byteContent);
		opStream.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(opStream!=null) opStream.close();
	}
}

	}

}
