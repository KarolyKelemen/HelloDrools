package org.droolsdemo.entities;

public class Account {

	private String accountName;
	
	private byte billingCycle;

	public Account(String accountName, byte billingCycle) {
		super();
		this.accountName = accountName;
		this.billingCycle = billingCycle;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public byte getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(byte billingCycle) {
		this.billingCycle = billingCycle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountName=");
		builder.append(accountName);
		builder.append(", billingCycle=");
		builder.append(billingCycle);
		builder.append("]");
		return builder.toString();
	}
	
}
