package org.jqsp.bms;

public interface Bank {
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	public abstract double checkBal();
	public abstract boolean login(long accountNumber, String password);
	public abstract void printBankDetails();
	public abstract void printAccountDetails();
	public abstract String transactionHis();
}
