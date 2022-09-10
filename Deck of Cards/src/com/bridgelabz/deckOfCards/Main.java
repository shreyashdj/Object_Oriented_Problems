package com.bridgelabz.deckOfCards;

/*
 * @author - SHREYASH JADHAV
 */
public class Main {

	public static void main(String[] args) {

		DeckOfCards deckOfCards = new DeckOfCards();	//	created object of DeckOfCards class
		
		int option;		// variable to store value of console options
		
		/*
		 *		used do-while loop and switch-case to make console for activities like
		 *		Distribute Cards, Show All Cards, Show Player Cards, Exit
		 */
		
		do {
			System.out.println("\n *** Available Options *** ");
			System.out.println(" 1. Distribute Cards \n 2. Show All Players Cards \n 3. Show Single Player Cards \n 4. Exit");
			System.out.print(" Enter option to perform activity : ");
			option = deckOfCards.scan.nextInt();
			
			switch (option) {
			
			case 1 -> deckOfCards.distributeCards();
			
			case 2 -> deckOfCards.showAllCards();

			case 3 -> deckOfCards.playerCards();

			case 4 -> System.out.println("\n Exited Successfully");
			
			default -> System.out.print("\n Option not Available \n");
			
			}
			
		} while(option != 4);
		
	}

}
