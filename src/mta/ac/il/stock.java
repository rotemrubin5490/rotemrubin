package mta.ac.il;

public class stock {
	private String symbol;
	private float ask;
	private float bid;
	private java.util.Date date;
	public String getSymbole() {
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
	
	public String getHtmlDescription(){
		String res = "<b>Stock symbol: </b>"+symbol+ " <b> Ask </b> :"  + ask + "<b> Bid: </b>" + bid + " <b>Date:</b> " + getDate() +"<br>";
		return res;
	}
	}


