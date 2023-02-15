package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class CreditCardPayment extends Payment {
	
	
	private String cardNumber;
	private String expirationDate;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + "]";
	}

}
