package com.HBPerHirarcy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("creditCard")
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