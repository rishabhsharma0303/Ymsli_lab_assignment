package Assignment4.ques7;

import java.io.IOException;

class InputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InputException() {
		super("Input Exception occured");
	}

}

public class TwoExceptions {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		try {
			throwException(n);
		} catch (InputException e) {
			// TODO Auto-generated catch block
			System.out.println("Input Exception Occurred");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException  Occurred");
			e.printStackTrace();
		}

	}
	public static void throwException(int number) throws IOException,InputException{
		if(number==1) {
			throw new IOException();
		}
		throw new InputException();
	}
}
