package InternAssignment.LoanAssignment.entities;

public class FinalLoanData extends LoanData {
	
	private double emi;
	

	

	public FinalLoanData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinalLoanData(long productId, long principalAmount, long tenure, double rateOfInterest) {
		super(productId, principalAmount, tenure, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	

}
