package InternAssignment.LoanAssignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoProductException extends Exception {


	public NoProductException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
