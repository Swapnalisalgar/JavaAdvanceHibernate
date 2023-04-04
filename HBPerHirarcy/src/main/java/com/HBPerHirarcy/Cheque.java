package com.HBPerHirarcy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cheque")
public class Cheque extends Payment{
	
	@Column(name = "ChequeType")
	private String ChequeType;

	public String getChequeType() {
		return ChequeType;
	}

	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}

		
}