package com.HBTablePerConcretClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chequepc")
@AttributeOverrides({
	@AttributeOverride(name = "paymentId", column = @Column(name = "id")),
	@AttributeOverride(name = "amount", column = @Column(name = "amount"))
})
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