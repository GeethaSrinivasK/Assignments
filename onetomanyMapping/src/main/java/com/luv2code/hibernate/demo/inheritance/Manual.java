package com.luv2code.hibernate.demo.inheritance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value = "manual car")
public class Manual  extends Car implements Serializable {

	
	@Column(name="is_automatic",nullable = true)
	private String isAutomatic;

	public Manual() {
		super();
	}

	public Manual(String isAutomatic) {
		super();
		this.isAutomatic = isAutomatic;
	}

	public String getIsAutomatic() {
		return isAutomatic;
	}

	public void setIsAutomatic(String isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
}
