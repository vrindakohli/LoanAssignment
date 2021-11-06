package InternAssignment.LoanAssignment.services;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import InternAssignment.LoanAssignment.dao.AccountDao;
import InternAssignment.LoanAssignment.entities.FinalLoanData;
import InternAssignment.LoanAssignment.entities.LoanData;
import InternAssignment.LoanAssignment.exception.NoProductException;
import ch.qos.logback.core.status.Status;

@Service
public class LoanServiceImplement implements LoanServices {

	@Autowired
	private AccountDao accDaoVariable;

	// List<LoanData> list;

	@Override
	public List<LoanData> getInfo() {
		// TODO Auto-generated method stub
		return accDaoVariable.findAll();
	}
	

	@Override
	public ResponseEntity<LoanData> getData(long productId) throws NoProductException {
		// TODO Auto-generated method stub
		LoanData loanData=accDaoVariable.findById(productId).orElseThrow(()->new NoProductException("no such product found"));
	
		return ResponseEntity.ok().body(loanData);
	}

	@Override
	public void addData(LoanData loanData) {
		
		accDaoVariable.save(loanData);
	}

	@Override
	public ResponseEntity<LoanData>  updateData(LoanData loanData) throws NoProductException {
		// TODO Auto-generated method stub
		
		LoanData ld=accDaoVariable.findById(loanData.getProductId()).orElseThrow(()->new NoProductException("no product exists"));
		//if(loanData!=null)
		//loanData.setCreatedBy("raju");
		//System.out.println("done");
		accDaoVariable.save(loanData);
		return ResponseEntity.ok().body(loanData);
	}

	@Override
	public ResponseEntity<LoanData> deleteData(long pId) throws NoProductException {
		// TODO Auto-generated method stub
		LoanData ld=accDaoVariable.findById(pId).orElseThrow(()->new NoProductException("no such product found"));


//		Optional<LoanData> entity=accDaoVariable.findById(pId);
		accDaoVariable.deleteById(pId);
		return ResponseEntity.ok().body(ld);

	}

	@Override
	public long getEMI(long pId) throws NoProductException{
		// TODO Auto-generated method stub
		//System.out.println("EMI WILL BE: ");
		long emi = 0;
		//LoanData loanData = (LoanData) accDaoVariable.getOne(pId);
		LoanData loanData=accDaoVariable.findById(pId).orElseThrow(()->new NoProductException("no such product found"));

		long p = loanData.getPrincipalAmount();
		double r = loanData.getRateOfInterest() / 100;
		long n = loanData.getTenure();

		if (loanData != null)
			emi = (long) (p * r * Math.pow(1+r, n) / (Math.pow((1 + r) , n) - 1));
		//entity.setEmi(emi);
		
		return  emi;

	}


	

}
