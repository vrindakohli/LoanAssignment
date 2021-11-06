package InternAssignment.LoanAssignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import InternAssignment.LoanAssignment.entities.FinalLoanData;
import InternAssignment.LoanAssignment.entities.LoanData;
import InternAssignment.LoanAssignment.exception.NoProductException;
import InternAssignment.LoanAssignment.services.LoanServices;

@RestController
@RequestMapping("/Loan")
public class MyController implements ErrorController {

	@Autowired
	private LoanServices loanServices;

	@GetMapping("/printData")
	public List<LoanData> getInfo() {
		return this.loanServices.getInfo();

	}

	@GetMapping("/printData/{pid}")
	public ResponseEntity<LoanData> getData(@PathVariable Long pid) throws NoProductException {
			
			return this.loanServices.getData(pid);
			
		
	}

	@GetMapping("/emiGenerate/{pId}")
	public long emi(@PathVariable long pId) throws NoProductException {
		return this.loanServices.getEMI(pId);

	}


	@PostMapping(path = "/addData", consumes = "application/json")
	public ResponseEntity<HttpStatus> addDatainDB(@RequestBody LoanData loanData) {
		try {
			this.loanServices.addData(loanData);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/updateData")
	public ResponseEntity<LoanData> updateData(@RequestBody LoanData loanData) throws NoProductException {

		return this.loanServices.updateData(loanData);

	}

	@DeleteMapping("/deleteData/{pId}")
	public ResponseEntity<LoanData> deleteCourse(@PathVariable long pId) throws NoProductException {
			return this.loanServices.deleteData(pId);
		
	}

}
