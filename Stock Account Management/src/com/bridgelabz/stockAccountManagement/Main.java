package com.bridgelabz.stockAccountManagement;

/*
 * @author - SHREYASH JADHAV
 */
public class Main {
	
	public static void main(String[] args) {

		StockPortfolio stockPortfolio = new StockPortfolio();	// created object of StockPortfolio class
		
		int option;		// variable to store value of console options
		
		/*
		 *		used do-while loop and switch-case to make console for activities like
		 *		Add New Stocks, Display Stock Report, Exit
		 */
		
		do {
			System.out.println("\n *** Options *** \n 1) Add New Stocks \n 2) Display Stock Report \n 3) Exit");
			System.out.print("\n Enter option from above : ");
			option = stockPortfolio.scan.nextInt();
		
			switch(option){
		
			case (1) -> stockPortfolio.addStock();
		
			case (2) -> stockPortfolio.displayStockList();
			
			case (3) -> System.out.println("\n Exited");
		
			default -> System.out.println("\n Entered option is not valid");
			
			}
		
		} while(option != 3);
		
	}
}