package rotemrubin.exception;

/**
 * ­ exception to be thrown when adding more stocks than allowed

 * @author rotemrub
 *
 */
public class PortfolioFullException extends Exception{
	public PortfolioFullException() {
		super("You had reached maximum portfolio size!");

	}
}
