package mta.ac.il.modle;

import java.util.Date;

import mta.ac.il.stock;

public class Portfolio {
	
	private String title="exercise 5";
	private final static int MAX_PORTFOLIO_SIZE=5;
	private int portfolioSize=0;
	
	stock[] stocks;
	StockStatus[] stocksStatus;
	
	public Portfolio (){
		stocks = new stock[MAX_PORTFOLIO_SIZE];
		stocksStatus = new StockStatus[MAX_PORTFOLIO_SIZE];

	}
	
	public void addStock (stock stock){
		
		stocks[portfolioSize] = stock;
		portfolioSize++;
	}
	
	public stock[] getStocks(){
		return stocks;
	}
	
	public String getHtmlString (){
		String res=new String();
		res+= "<h1>" + title + "</h1>";
		
		for (int i=0; i<portfolioSize; i++){
			res +=stocks[i].getHtmlDescription();
		}
		return res;
	}
	
	public class StockStatus{
		private final static int DO_NOTHING = 0;
		private final static int BUY = 1;
		private final static int SELL = 2;
		private String symbol;
		private float currentBid, currentAsk;
		private Date date;
		private int recommendation;
		private int stockQuantity;
		
	}

}
