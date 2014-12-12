package mta.ac.il.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mta.ac.il.modle.Portfolio;
import mta.ac.il.modle.Stock;
import mta.ac.il.service.PortfolioService;

@SuppressWarnings("serial")
	public class PortfolioServlet extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/html");

			PortfolioService portfolioService = new PortfolioService();
			Portfolio portfolio1 = portfolioService.getPortfolio();
			
			Portfolio portfolio2= new Portfolio(portfolio1);
			portfolio2.setTitle("portfolio#2");
			portfolio2.getStocks()[2].setBid(55.55f);
			
			
			/**
			 * print protfolio1 details
			 * @author rotem rubin December 2014
			 *
			 */
			
			resp.getWriter().println(portfolio1.getHtmlString());
			/**
			 * print protfolio2 details
			 * @author rotem rubin December 2014
			 *
			 */
			resp.getWriter().println(portfolio2.getHtmlString());
			
		}

}
