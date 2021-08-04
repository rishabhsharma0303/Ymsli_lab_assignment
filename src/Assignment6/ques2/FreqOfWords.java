package Assignment6.ques2;
import java.util.*;
import java.io.*;
import java.security.KeyStore.Entry;
public class FreqOfWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
 * 1. we need to read a file
 * 2. make token of a file till it is not finished
 * 3.we have to take a collection Map<String,Integer>
 * 
 */
		Map<String,Integer> map=new HashMap<>();	
			BufferedReader br= new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym268\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Assignments\\src\\Assignment6\\ques2\\story.txt")));
			String line =null;
			while((line =br.readLine())!=null) {
				String []tokens=line.split(" ");
				for(String token: tokens) {
					if(map.containsKey(token)) {
						Integer temp=map.get(token);
						map.put(token, ++temp);
					}else {
						map.put(token,1);
					}
				
				}
			}
		
		System.out.println("printing word with freq.!");
		Set<java.util.Map.Entry<String, Integer>> entrySet=map.entrySet();
		
		for(java.util.Map.Entry<String, Integer> e:entrySet) {
			System.out.println(e.getKey()+" appears "+e.getValue()+" times");
		}
		
		
		
	}

}
