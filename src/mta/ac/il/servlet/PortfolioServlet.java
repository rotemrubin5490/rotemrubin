package mta.ac.il.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mta.ac.il.stock;
import mta.ac.il.modle.Portfolio;
import mta.ac.il.service.PortfolioService;

@SuppressWarnings("serial")
	public class PortfolioServlet extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
			PortfolioService portfolioService = new PortfolioService();
			Portfolio portfolio = portfolioService.getPortfolio();
			stock[] stocks = portfolio.getStocks();

		
			resp.setContentType("text/html");
			resp.getWriter().println(portfolio.getHtmlString());
			
		}

}
