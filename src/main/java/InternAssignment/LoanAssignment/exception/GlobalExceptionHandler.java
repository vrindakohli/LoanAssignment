package InternAssignment.LoanAssignment.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(NoProductException.class)
	public ResponseEntity<?> resourceNotFoundException(NoProductException ex, WebRequest web){
		ErrorDetails error=new ErrorDetails(new Date(), ex.getMessage(), web.getDescription(false));
		return new ResponseEntity<> (error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalException(NoProductException ex, WebRequest web){
		ErrorDetails error=new ErrorDetails(new Date(), ex.getMessage(), web.getDescription(false));
		return new ResponseEntity<> (error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
