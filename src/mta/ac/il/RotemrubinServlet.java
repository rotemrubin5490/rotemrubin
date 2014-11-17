package mta.ac.il;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RotemrubinServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		int num1, num2, num3;
		num1=4;
		num2=3;
		num3=7;
		
		int result=(num1+num2)*num3;
		
		String resultStr = new String("<h1>Result of: (" +num1+"+"+num2+ ")*"+num3+"="+result+"<h1>");
		
		double radius = 50;
		double pai=Math.PI;
		double area = pai*(radius)*(radius);
		
		int angleB=30;
		int hyp=50;
		double r=Math.toRadians(angleB);
		double opp=r*hyp;
		
		int base=20;
		int exp=13;		
		double res3= Math.pow(base, exp);
		
		String line1 = new String("calculation 1: Area of circle with radius " +radius+ " is: " +area+ " square­cm");
		String line2 = new String("calculation 2: Length of opposite where angle B is 30 degrees and Hypotenuse length is 50 cm is: " +opp+ " cm");
		String line3 = new String("calculation 3: Power of 20 with exp of 13 is: " +res3);

        String resultStr1 = line1 + "<br>" + line2 + "<br>" +line3;
		
		resp.getWriter().println(resultStr1);
	}
}
