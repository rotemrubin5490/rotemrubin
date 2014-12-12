package mta.ac.il.modle;

import java.util.Date;

public class Portfolio {

	private String title="portfolio#1";
	private final static int MAX_PORTFOLIO_SIZE=5;
	private int portfolioSize=0;
	private Stock[] stocks;
	private StockStatus[] stocksStatus;
	public Portfolio (){
		
		stocks=new Stock[MAX_PORTFOLIO_SIZE];

		stocksStatus = new StockStatus[MAX_PORTFOLIO_SIZE];
	}
	
	public Portfolio (Portfolio portfolio){
		setTitle(portfolio.getTitle());
		//setPortfolioSize(portfolio.getPortfolioSize());
		portfolioSize = portfolio.portfolioSize;

		stocks = new Stock[MAX_PORTFOLIO_SIZE];
		for (int i=0; i<3; i++)
		{
			stocks[i]=new Stock (portfolio.stocks[i]);
		}
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public StockStatus[] getStocksStatus() {
		return stocksStatus;
	}

	public void setStocksStatus(StockStatus[] stocksStatus) {
		this.stocksStatus = stocksStatus;
	}
	
	public int getPortfolioSize() {
		return portfolioSize;
	}

	public void setPortfolioSize(int portfolioSize) {
		this.portfolioSize = portfolioSize;
	}

	public void setStocks(Stock[] stocks) {
		this.stocks = stocks;
	}

	public void addStock (Stock stock){

		stocks[portfolioSize] = stock;
		portfolioSize++;
	}

	public Stock[] getStocks(){
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
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public float getCurrentBid() {
			return currentBid;
		}
		public void setCurrentBid(float currentBid) {
			this.currentBid = currentBid;
		}
		public float getCurrentAsk() {
			return currentAsk;
		}
		public void setCurrentAsk(float currentAsk) {
			this.currentAsk = currentAsk;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getRecommendation() {
			return recommendation;
		}
		public void setRecommendation(int recommendation) {
			this.recommendation = recommendation;
		}
		public int getStockQuantity() {
			return stockQuantity;
		}
		public void setStockQuantity(int stockQuantity) {
			this.stockQuantity = stockQuantity;
		}

		public StockStatus(StockStatus stockStatus){
			setSymbol (stockStatus.getSymbol());
			setCurrentBid (stockStatus.getCurrentBid());
			setCurrentAsk (stockStatus.getCurrentAsk());
			date=new Date(stockStatus.date.getTime());
			setRecommendation (stockStatus.getRecommendation());
			setStockQuantity (stockStatus.getStockQuantity());
		}
	}
}
