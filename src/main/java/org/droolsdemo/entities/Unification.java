package org.droolsdemo.entities;

public class Unification {
	
	private Account sourceAccount;
	
	private Account targetAccount;

	private Account unifiedAccount;
	
	public Unification(Account sourceAccount, Account targetAccount) {
		super();
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
	}

	public void unify() {
		System.out.println("Unifying account " + sourceAccount + " with account: " + targetAccount);
		unifiedAccount = new Account(sourceAccount.getAccountName() + " unified with " + targetAccount.getAccountName(), sourceAccount.getBillingCycle());
	}
	
	public Account getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Account getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(Account targetAccount) {
		this.targetAccount = targetAccount;
	}

	public Account getUnifiedAccount() {
		return unifiedAccount;
	}

	public void setUnifiedAccount(Account unifiedAccount) {
		this.unifiedAccount = unifiedAccount;
	}
	
}
