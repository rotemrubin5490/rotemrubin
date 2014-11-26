package mta.ac.il;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockDetailsServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		stock Stock1 = new stock();

		Stock1.setSymbol("PIH");
		Stock1.setAsk(12.4f);
		Stock1.setBid(13.1f);

		Calendar c = Calendar.getInstance();
		c.set(2014, 10, 15, 00, 00, 00);
		Date date = c.getTime();
		Stock1.setDate(date);

		resp.getWriter().println("The Stock Details");
		resp.getWriter().println(Stock1.getHtmlDescription());

		stock Stock2 = new stock();

		Stock2.setSymbol("AAL");
		Stock2.setAsk(5.5f);
		Stock2.setBid(5.78f);

		Calendar d = Calendar.getInstance();
		d.set(2014, 10, 15, 00, 00, 00);
		Date date1 = d.getTime();
		Stock2.setDate(date1);

		resp.getWriter().println("The Stock Details");
		resp.getWriter().println(Stock2.getHtmlDescription());

		stock Stock3 = new stock();

		Stock3.setSymbol("CAAS");
		Stock3.setAsk(31.5f);
		Stock3.setBid(31.2f);

		Calendar e = Calendar.getInstance();
		e.set(2014, 10, 15, 00, 00, 00);
		Date date2 = e.getTime();
		Stock3.setDate(date2);

		resp.getWriter().println("The Stock Details");
		resp.getWriter().println(Stock3.getHtmlDescription());
	}


}



