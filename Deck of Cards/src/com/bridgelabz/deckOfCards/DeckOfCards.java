package com.bridgelabz.deckOfCards;

import java.util.Scanner;	//	imported Scanner class

/*
 * @author - SHREYASH JADHAV
 */
public class DeckOfCards {
	
	Scanner scan = new Scanner(System.in);	//	created object of Scanner class
	
	// variables
	
	int cardSuit;
	int cardRank;
	int playerNo;
	int cardsPerPlayer;
	boolean check;
	String[][] players;
	
	//	String arrays to store suit and rank of cards
	
	String [] suit = {"Clubs ", "Diamonds ", "Hearts ", "Spades "};
	String [] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	/*
	 * 	method to assure that same card should not be distribute again
	 */
	
	public boolean checkCard() {
		check = true;
		for(int i = 0; i < playerNo; i++) {
			for(int j = 0; j < cardsPerPlayer; j++) {

				if (false == players[i][j].equals(suit[cardSuit] + rank[cardRank]) ) { // return true => string are equal
					
				} else {
					check = false;
					break;
				}
				
			}
		}
		return check;
	}
	
	/*
	 * 	method to Distribute Cards between Players
	 */
	
	public void distributeCards() {
		
		System.out.print("\n Enter No. of Players : ");
		playerNo = scan.nextInt();
		
		System.out.println(" Max cards for each Player : " + (52/playerNo));
		System.out.print(" Enter No. of Cards for each Player : ");
		cardsPerPlayer = scan.nextInt();

		//	initialized players array and store blank value
		
		players = new String [playerNo][cardsPerPlayer];

		for(int i = 0; i < playerNo; i++) {
			for(int j = 0; j < cardsPerPlayer; j++) {
				
				players[i][j] = " ";
			}
		}
		
		//	taking random numbers to distribute cards randomly
		
		for(int i = 0; i < playerNo; i++) {
			for(int j = 0; j < cardsPerPlayer; j++) {
				do {
					cardSuit = (int) (Math.random()*4);
					cardRank = (int) (Math.random()*13);
					checkCard();
				} while(check == false);
				players[i][j] = suit[cardSuit] + rank[cardRank];
			}
		}
	}
		
	
	/*
	 * 	method to print Cards of All Players
	 */
	
	public void showAllCards() {
			
		System.out.println("\n *** Player Cards *** \n");
		
		for(int i = 0; i < playerNo; i++) {
			System.out.print(" Player " + (i+1) + " : ");
			for(int j = 0; j < cardsPerPlayer; j++) {
				System.out.print(players[i][j] + " , ");
			}
			System.out.println();
		}
			
	}
	
	/*
	 * 	method to print Cards of Specific Player
	 */
	
	public void playerCards() {
		
			System.out.println("\n Total Players : " + playerNo);
			System.out.print(" Enter Player No. : ");
			int i = scan.nextInt();
					
			System.out.print(" Player " + (i) + " : ");
			for(int j = 0; j < cardsPerPlayer; j++) {
				System.out.print(players[i-1][j] + " , ");
			}
			System.out.println();
	}

}