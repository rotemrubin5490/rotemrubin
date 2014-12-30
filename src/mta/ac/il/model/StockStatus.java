package mta.ac.il.model;

import mta.ac.il.model.Portfolio.ALGO_RECOMMENDATION;

public class StockStatus extends Stock {

	private ALGO_RECOMMENDATION recommendation;
	private int stockQuantity;
	
	/**
	 * c'tor for stockStatus
	 */
	
	public StockStatus(){
		super();
		this.recommendation = recommendation;
		this.stockQuantity = stockQuantity;
	}
	
	/**
	 * copy of c'tor for stockStatus
	 * @param stocksStatus
	 */
	public StockStatus (StockStatus stocksStatus){
		super(stocksStatus);
		this.recommendation = stocksStatus.getRecommendation();
		this.stockQuantity = stocksStatus.getStockQuantity();
	}
	
	public ALGO_RECOMMENDATION getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(ALGO_RECOMMENDATION recommendation) {
		this.recommendation = recommendation;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

}
