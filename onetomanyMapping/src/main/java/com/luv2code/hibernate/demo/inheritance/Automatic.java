package com.luv2code.hibernate.demo.inheritance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@DiscriminatorValue(value = "automatic car")
public class Automatic extends Car implements Serializable {

	
	
	@Column(name="is_automatic",nullable = true)
	private String isAutomatic;

	public Automatic() {
		super();
	}

	public Automatic(String isAutomatic) {
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
