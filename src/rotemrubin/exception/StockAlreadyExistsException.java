package rotemrubin.exception;

/**
 * ­ exception to be thrown when a stock already exists
 * @author rotemrub
 *
 */
public class StockAlreadyExistsException extends Exception {

	public StockAlreadyExistsException(String symbol) {
		super("Sorry, Stock " + symbol + " already exists!");
	}

}
