package org.jqsp.bms;


	import java.util.Date;

	public class HDFC extends Account {
		private String bankName;
		private String branchName;
		private String ifscCode;
		private String location;
		private String trnsHis = ""; // Added to track transaction history

		public HDFC(long accountNumber, String accountHolderName, double balance, long phone, String email, String password,
				String status, String accountType, String bankName, String branchName, String ifscCode, String location) {
			super(accountNumber, accountHolderName, balance, phone, email, password, status, accountType);
			this.bankName = bankName;
			this.branchName = branchName;
			this.ifscCode = ifscCode;
			this.location = location;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getIfscCode() {
			return ifscCode;
		}

		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		// ✅ Implemented Transaction History method
//		public String TransactionHis() {
//			return trnsHis;
//		}

		@Override
		public void deposite(double amount) {
			if (amount % 100 == 0) {
				setBalance(getBalance() + amount);
				trnsHis += "Deposited: " + amount + " on " + new Date().toString() + "\n";
				System.out.println("Deposited successfully");
			} else {
				System.out.println("Invalid amount (Enter multiples of 100, 200, 500)");
			}
		}

		@Override
		public void withdraw(double amount) {
			if (amount % 100 == 0) {
				if (getBalance() > amount) {
					setBalance(getBalance() - amount);
					trnsHis += "Withdrawn: " + amount + " on " + new Date().toString() + "\n";
					System.out.println("Withdraw successful");
				} else {
					System.out.println("Check your balance | insufficient funds");
				}
			} else {
				System.out.println("Not Multiple of 100 200 500");
			}
		}

		@Override
		public double checkBal() {
			return getBalance();
		}

		@Override
		public boolean login(long accountNumber, String password) {
			if (accountNumber == this.getAccountNumber() && password.equals(this.getPassword())) {
				return true;
			}
			return false;
		}

		@Override
		public void printBankDetails() {
			System.out.println("============Bank Details================");
			System.out.println("Bank Name: " + bankName);
			System.out.println("Bank branch Name : " + branchName);
			System.out.println("Bank IFSC Code : " + ifscCode);
			System.out.println("Bank Location : " + location);
			System.out.println("========================================");
		}

		@Override
		public void printAccountDetails() {
			System.out.println("=========================================");
			System.out.println("Account Number : " + getAccountNumber());
			System.out.println("Account Holder Name : " + getAccountHolderName());
			System.out.println("Account Balance : " + getBalance());
			System.out.println("Account Phone : " + getPhone());
			System.out.println("Account Email : " + getEmail());
			System.out.println("Account Status : " + getStatus());
			System.out.println("=========================================");
		}

		@Override
		public String transactionHis() {
			// TODO Auto-generated method stub
			return trnsHis;
		}

		
	}