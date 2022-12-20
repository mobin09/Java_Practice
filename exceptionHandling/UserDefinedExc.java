package exceptionHandling;

public class UserDefinedExc {

	public static void main(String[] args) {
		 int age  = Integer.parseInt(args[0]);
		 if(age > 60) {
			 throw new TooOldException("Too Old Exception raised");
		 } else if(age < 18) {
			 throw new TooYoungException("Too Young Exception raised");
		 }else {
			 System.out.println("Thank you for the Registeration");
		 }

	}

}


class TooYoungException extends RuntimeException{
	public TooYoungException(String msg){
		super(msg);
	}
}

class TooOldException extends RuntimeException{
	public TooOldException(String msg) {
		super(msg);
	}
}