package com.HBTablePerSubClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "creditCardps")
@AttributeOverrides({
	@AttributeOverride(name = "paymentId", column = @Column(name = "id")),
	@AttributeOverride(name = "amount", column = @Column(name = "amount"))
})
public class CreditCard extends Payment{
	
	@Column(name = "CreditCardType")
	private String CreditCardType;
	

	public String getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}
	
		
}