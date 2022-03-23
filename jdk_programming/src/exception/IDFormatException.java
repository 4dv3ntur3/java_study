package exception;

public class IDFormatException extends Exception {
	
	// Exception class의 생성자 중 하나를 가져다가 쓴 것 
	// String message를 받는 생성자를 쓴 것임
	public IDFormatException(String message){
		super(message);
	}

}
