package question2;

public class InvalidCountryException extends Exception {

	public InvalidCountryException(String message) {
		super(message);
	}
	
	public InvalidCountryException() {
		super();
	}
}
