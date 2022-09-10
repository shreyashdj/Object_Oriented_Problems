package com.bridgelabz.accountManagement;

import java.util.Scanner;	//	imported Scanner class

/*
 * @author - SHREYASH JADHAV
 */
public class Account {
	
	Scanner scan = new Scanner(System.in);	//	created object of Scanner class
	
	//	variables
	
	private int balance;
	private int amount;
	
	/*
	 *  created getter and setter methods
	 */
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	/*
	 * 		method to credit money
	 */
	
	public void credit() {
		
		System.out.print("\n Enter amount to Credit : ");
		setAmount(scan.nextInt());
		
		setBalance(getBalance() + getAmount());
		
		System.out.println("\n Amount Credited successfully");
	}
	
	/*
	 * 		method to withdraw money
	 */
	
	public void debit() {
		
		System.out.print("\n Enter amount to withdraw : ");
		setAmount(scan.nextInt());
		
		setBalance(getBalance() - getAmount());
		
		if(balance < 0) {
			
			setBalance(getBalance() + getAmount());
			System.out.println("\n Debit amount exceeded account balance");
			
		} else {
			
			System.out.println("\n Amount Debited successfully");
		}
		
	}
	
	/*
	 * 	method to check current A/c balance
	 */
	
	public void checkBalance() {
		
		System.out.println("\n Current A/c Balance is : " + getBalance());
		
	}

}
