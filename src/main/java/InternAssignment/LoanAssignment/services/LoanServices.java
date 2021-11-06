package InternAssignment.LoanAssignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import InternAssignment.LoanAssignment.entities.FinalLoanData;
import InternAssignment.LoanAssignment.entities.LoanData;
import InternAssignment.LoanAssignment.exception.NoProductException;

public interface LoanServices {

	public List<LoanData> getInfo();
	
	public ResponseEntity<LoanData> getData(long productId) throws NoProductException;
	
	public void addData(LoanData loanData) throws NoProductException;
	
	
	public ResponseEntity<LoanData> deleteData(long pId) throws NoProductException;

	public long getEMI(long pId) throws NoProductException;

	public ResponseEntity<LoanData> updateData(LoanData loanData) throws NoProductException;
	
	
	
	

}
