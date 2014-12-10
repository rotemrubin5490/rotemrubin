package mta.ac.il.service;

import java.util.Calendar;
import java.util.Date;

import mta.ac.il.modle.Portfolio;
import mta.ac.il.modle.Stock;

public class PortfolioService {
	
	public Portfolio getPortfolio(){
		
		Portfolio myPortfolio = new Portfolio();
		Stock Stock1 = new Stock();

		Stock1.setSymbol("PIH");
		Stock1.setAsk(12.4f);
		Stock1.setBid(13.1f);

		Calendar c = Calendar.getInstance();
		c.set(2014, 10, 15, 00, 00, 00);
		Date date = c.getTime();
		Stock1.setDate(date);
		myPortfolio.addStock(Stock1);

		Stock Stock2 = new Stock();

		Stock2.setSymbol("AAL");
		Stock2.setAsk(5.5f);
		Stock2.setBid(5.78f);

		Calendar d = Calendar.getInstance();
		d.set(2014, 10, 15, 00, 00, 00);
		Date date1 = d.getTime();
		Stock2.setDate(date1);
		myPortfolio.addStock(Stock2);
		
		Stock Stock3 = new Stock();

		Stock3.setSymbol("CAAS");
		Stock3.setAsk(31.5f);
		Stock3.setBid(31.2f);

		Calendar e = Calendar.getInstance();
		e.set(2014, 10, 15, 00, 00, 00);
		Date date2 = e.getTime();
		Stock3.setDate(date2);
		myPortfolio.addStock(Stock3);
		
		return myPortfolio;
		}
	
	}


