package Assignment4.ques6;

public class InputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InputException(int n) {
		super("Number can't be greater then ["+n+"]");
	}

}
