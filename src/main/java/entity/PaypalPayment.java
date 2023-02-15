package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 
@DiscriminatorValue("1")
public class PaypalPayment extends Payment {
	
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "PaypalPayment [accountNumber=" + accountNumber + "]";
	}
	
}
