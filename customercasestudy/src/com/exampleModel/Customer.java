package com.exampleModel;

public class Customer {
	private String cName;
	private String cItem;
	private String cAddress;
	public Customer() {
		super();
	}
	public Customer(String cName, String cItem, String cAddress) {
		super();
		this.cName = cName;
		this.cItem = cItem;
		this.cAddress = cAddress;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the cItem
	 */
	public String getcItem() {
		return cItem;
	}
	/**
	 * @param cItem the cItem to set
	 */
	public void setcItem(String cItem) {
		this.cItem = cItem;
	}
	/**
	 * @return the cAddress
	 */
	public String getcAddress() {
		return cAddress;
	}
	/**
	 * @param cAddress the cAddress to set
	 */
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	
	
	
			
}
