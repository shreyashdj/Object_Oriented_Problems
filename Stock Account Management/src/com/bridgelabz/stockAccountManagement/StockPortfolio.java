package com.bridgelabz.stockAccountManagement;

import java.util.Scanner;	// imported Scanner class
import java.util.ArrayList;	// imported ArrayList class

/*
 * @author - SHREYASH JADHAV
 */
public class StockPortfolio {
	
	int totalValue;		// variable store total value of stocks
	
	Scanner scan = new Scanner(System.in);	// created object of Scanner class

	ArrayList <Stock> stockList = new ArrayList<>();	//	created object of array list

	/*
	 * 	method to add Stock and store Share Details
	 */
	
	public void addStock() {

		/*
		 * taking user input for Share Details
		 */
		
			Stock stock = new Stock();
			
			System.out.print("\n Enter Name of Stock : ");
			stock.setStockName(scan.next());
		
			System.out.print(" Enter Number of Share : ");
			stock.setNoOfShare(scan.nextInt());
		
			System.out.print(" Enter Price of Share : ");
			stock.setSharePrice(scan.nextInt());
		
			stock.setStockPrice(stock.getNoOfShare() * stock.getSharePrice());
		
			totalValue += stock.getStockPrice();
			
			stockList.add(stock);	//	adding new stock in stockList
		
			
	}
	
	/*
	 * 	method to display Stock Report
	 */
	
	public void displayStockList() {
		
		for(int i = 0; i < stockList.size(); i++) {

			System.out.println("\n *** Stock - " + (i+1) +" ***");
			
			Stock stock = stockList.get(i);

			System.out.println("\n Name of Stock : " + stock.getStockName());

			System.out.println(" Number of Share : " + stock.getNoOfShare());

			System.out.println(" Price of Share : " + stock.getSharePrice());
		
			System.out.println(" Price of Stock : " + stock.getStockPrice());

		}
		
		System.out.println("\n Total Value = " + totalValue);
	}
 }
