package mta.ac.il.service;

import java.util.Calendar;
import java.util.Date;

import mta.ac.il.model.Portfolio;
import mta.ac.il.model.Stock;

/**
 * this class manage our stock portfolio and update it's value.
 * @author rotem rubin December 2014
 *
 */

public class PortfolioService {

	public Portfolio getPortfolio(){

		Portfolio myPortfolio = new Portfolio();

		myPortfolio.setTitle("exe 7 porfolio");
		myPortfolio.updateBalance(10000);

		Stock Stock1 = new Stock();

		Stock1.setSymbol("PIH");
		Stock1.setAsk(10f);
		Stock1.setBid(8.5f);

		Calendar c = Calendar.getInstance();
		c.set(2014, 11, 15, 00, 00, 00);
		Date date = c.getTime();
		Stock1.setDate(date);
		
		myPortfolio.addStock(Stock1);

		Stock Stock2 = new Stock();

		Stock2.setSymbol("AAL");
		Stock2.setAsk(30f);
		Stock2.setBid(25.5f);

		Calendar d = Calendar.getInstance();
		d.set(2014, 11, 15, 00, 00, 00);
		Date date1 = d.getTime();
		Stock2.setDate(date1);
		myPortfolio.addStock(Stock2);

		Stock Stock3 = new Stock();

		Stock3.setSymbol("CAAS");
		Stock3.setAsk(20f);
		Stock3.setBid(15.5f);

		Calendar e = Calendar.getInstance();
		e.set(2014, 11, 15, 00, 00, 00);
		Date date2 = e.getTime();
		Stock3.setDate(date2);
		myPortfolio.addStock(Stock3);

		myPortfolio.buyStock("PIH", 20);
		myPortfolio.buyStock("AAL", 30);
		myPortfolio.buyStock("CAAS", 40);
		myPortfolio.sellStock("AAL", -1);
		myPortfolio.removeStock("CAAS");

		return myPortfolio;
	}

}


