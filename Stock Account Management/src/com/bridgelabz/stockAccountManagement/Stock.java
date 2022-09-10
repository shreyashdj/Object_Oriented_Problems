package com.bridgelabz.stockAccountManagement;

/*
 * @author - SHREYASH JADHAV
 */
public class Stock {
	
	// variables
	
	private String stockName;
	private int noOfShare;
	private int sharePrice;
	private int stockPrice;
	
	/*
	 *	created getter and setter methods
	 */

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

}
