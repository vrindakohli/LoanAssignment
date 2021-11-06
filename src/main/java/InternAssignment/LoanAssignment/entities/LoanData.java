package InternAssignment.LoanAssignment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class LoanData {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long productId;
	private String productName;
	private long principalAmount;
	private long tenure;
	private double rateOfInterest;
	private boolean isActive;
	private String createdBy;
	private String createdOn;   //should be date
	private String updatedBy;
	private String updatedOn;   //should be date
	public LoanData( String productName, long principalAmount, long tenure, double d,
			String createdBy, String createdOn, String updatedBy, String updatedOn) {
		
		//this.productId = productId;
		this.productName = productName;
		this.principalAmount = principalAmount;
		this.tenure = tenure;
		this.rateOfInterest = d;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}
	public LoanData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public LoanData(long productId, long principalAmount, long tenure, double rateOfInterest) {
		super();
		this.productId = productId;
		this.principalAmount = principalAmount;
		this.tenure = tenure;
		this.rateOfInterest = rateOfInterest;
	}
	public long getProductId() {
		return productId;
	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(long principalAmount) {
		this.principalAmount = principalAmount;
	}
	public long getTenure() {
		return tenure;
	}
	public void setTenure(long tenure) {
		this.tenure = tenure;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(long rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "LoanData [productId=" + productId + ", productName=" + productName + ", principalAmount="
				+ principalAmount + ", tenure=" + tenure + ", rateOfInterest=" + rateOfInterest + ", isActive="
				+ isActive + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + "]";
	}
	
	


	
	

}
