package mta.ac.il.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mta.ac.il.model.Portfolio;
import mta.ac.il.model.Stock;
import mta.ac.il.service.PortfolioService;

@SuppressWarnings("serial")

public class PortfolioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		try{
		resp.setContentType("text/html");

		PortfolioService portfolioService = new PortfolioService();
		Portfolio portfolio1 = portfolioService.getPortfolio();


		/**
		 * print protfolio1 details
		 * @author rotem rubin December 2014
		 *
		 */

			resp.getWriter().println(portfolio1.getHtmlString());
	
		}catch(Exception e){
			resp.getWriter().println(e.getMessage());

		}
	}

}
