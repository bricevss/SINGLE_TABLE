package entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name="Discriminator", discriminatorType = DiscriminatorType.INTEGER)
public class Payment {
	
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private float amount;
	
	private String paymentDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int idPayment) {
		this.id = idPayment;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}
	
}
