package com.bridgelabz.accountManagement;

/*
 * @author - SHREYASH JADHAV
 */
public class Main {

	public static void main(String[] args) {

		Account account = new Account();	//	created object of Account class
		
		int option;		// variable to store value of console options
		
		/*
		 *		used do-while loop and switch-case to make console for activities like
		 *		Credit Money, Withdraw Money, Check A/c Balance, Exit
		 */
		
		do {
			System.out.println("\n *** Options *** \n 1) Credit Amount \n 2) Withdraw Amount \n 3) Check Current A/c Balance \n 4) Exit");
			System.out.print("\n Enter option from above : ");
			option = account.scan.nextInt();
		
			switch(option){
		
			case (1) -> account.credit();
		
			case (2) -> account.debit();
			
			case (3) -> account.checkBalance();
			
			case (4) -> System.out.println("\n Exited");
		
			default -> System.out.println("\n Entered option is not valid");
			
			}
		
		} while(option != 4);

	}
}