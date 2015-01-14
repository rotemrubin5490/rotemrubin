package rotemrubin.exception;

/**
 * exception to be thrown when a stock doesn’t exist.
 * @author rotemrub
 *
 */
public class StockNotExistException extends Exception {
		public StockNotExistException(String symbol) {
			super("Stock " + symbol + " not exists!");
		}

	}

