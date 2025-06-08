/*
 * public class Driver {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * Bank b = null; boolean flag = true; do {
 * System.out.println("1. CREATE ACCOUNT");
 * System.out.println("2. ICICI ACCOUNT"); System.out.println("3. EXIT");
 * System.out.println("1. Choose any one option"); switch (choose) { case 1: {
 * System.out.println("1. SBI ACCOUNT"); System.out.println("1. ICICI ACCOUNT");
 * System.out.println("1. HDFC ACCOUNT");
 * 
 * } } } }
 * 
 * }
 */

package org.jqsp.bms; 
import java.util.Scanner; 
public class Driver {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Bank b = null;
	        boolean flag = true;

	        do {
	            System.out.println("1.CREATE ACCOUNT");
	            System.out.println("2.LOGIN ACCOUNT");
	            System.out.println("3.EXIT");
	            System.out.println("Choose any one option");
	            int choose = sc.nextInt();

	            switch (choose) {
	                case 1: {
	                    // create account logic
	                    System.out.println("1.SBI ACCOUNT");
	                    System.out.println("2.ICICI ACCOUNT");
	                    System.out.println("3.HDFC ACCOUNT");
	                    System.out.println("choose any one option");
	                    int op = sc.nextInt();
	                    switch (op) {
	                        case 1: {
	                            System.out.println("Enter Account Number");
	                            long accno = sc.nextLong();
	                            System.out.println("Enter Account Holder Name");
	                            String name = sc.next();
	                            System.out.println("Enter Intial Balance");
	                            double bal = sc.nextDouble();
	                            System.out.println("Enter phone Number");
	                            long phone = sc.nextLong();
	                            System.out.println("Enter Email ");
	                            String email = sc.next();
	                            System.out.println("Enter Password");
	                            String pwd = sc.next();
	                            System.out.println("Enter Account status");
	                            String status = sc.next();
	                            System.out.println("Enter Account Type");
	                            String accType = sc.next();

	                            b = new SBI(accno, name, bal, phone, email, pwd, status, accType,
	                                    "SBI", "Nagwara", "IFSC0891", "Banglore");
	                            System.out.println("SBI bank account created");
	                            break;
	                        }
	                        default: {
	                            System.out.println("Invalid option");
	                        }
	                    }
	                    break;
	                }

	                case 2: {
	                    // login logic
	                    System.out.println("Enter Account Number To login");
	                    long accno = sc.nextLong();
	                    System.out.println("Enter password to login");
	                    String pass = sc.next();
	                    if (b != null && b.login(accno, pass)) {
	                        boolean flg = true;
	                        do {
	                            System.out.println("1.DEPOSITE AMOUNT");
	                            System.out.println("2.WITHDRAW AMOUNT");
	                            System.out.println("3.CHECK BALANCE");
	                            System.out.println("4.BANK DETAILS");
	                            System.out.println("5.ACCOUNT DETAILS");
	                            System.out.println("6.EXIT");
	                            System.out.println("choose any one option");
	                            int opt = sc.nextInt();

	                            switch (opt) {
	                                case 1: {
	                                    System.out.println("Enter amount to deposite");
	                                    b.deposite(sc.nextDouble());
	                                    break;
	                                }
	                                case 2: {
	                                    System.out.println("Enter amount to withdraw");
	                                    b.withdraw(sc.nextDouble());
	                                    break;
	                                }
	                                case 3: {
	                                    System.out.println("Balance : " + b.checkBal());
	                                    break;
	                                }
	                                case 4: {
	                                    b.printBankDetails();
	                                    break;
	                                }
	                                case 5: {
	                                    b.printAccountDetails();
	                                    break;
	                                }
	                                case 6: {
	                                    flg = false;
	                                    break;
	                                }
	                                default: {
	                                    System.out.println("Invalid option");
	                                }
	                            }
	                        } while (flg);
	                    } else {
	                        System.out.println("Invalid Account number and Password");
	                    }
	                    break;
	                }

	                case 3: {
	                    flag = false;
	                    break;
	                }

	                default: {
	                    System.out.println("Invalid option");
	                }
	            }
	        } while (flag);
	        System.out.println("Thanks for visiting this Bank");
	    }
	}
