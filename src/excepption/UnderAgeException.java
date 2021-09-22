package excepption;

public class UnderAgeException extends Exception{

	public UnderAgeException() {
		super("You are underAge");
	}
	public UnderAgeException(String message) {
		super(message);
	}
}
