package mta.ac.il.model;

import java.util.Date;

/**
 * we define the members of every stock
 * @author rotem rubin December 2014
 */

public class Stock {
	protected String symbol;
	protected float ask;
	protected float bid;
	protected java.util.Date date;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getAsk() {
		return ask;
	}
	public void setAsk(float ask) {
		this.ask = ask;
	}
	public float getBid() {
		return bid;
	}
	public void setBid(float bid) {
		this.bid = bid;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	
	/** the method returns an html:
	 * in bold- the stock's name
	 * not in bold- the value of the stock
	 * with spaces
	 * rotem rubin- December 2014 
	 * @return
	 */

	public String getHtmlDescription(){
		String res = "<b>Stock symbol: </b>"+symbol+ " <b> Ask </b> :"  + ask + "<b> Bid: </b>" + bid + " <b>Date:</b> " + getDate() +"<br>";
		return res;
	}
	

	public Stock (Stock stock){
		setSymbol (stock.getSymbol());
		setAsk (stock.getAsk());
		setBid (stock.getBid());
		date= new Date (stock.date.getTime());
	}
	public Stock() {
		// TODO Auto-generated constructor stub
	}
}


