package rotemrubin.exception;

/**
 * exception to be thrown when the portfolio balance becomes negative
 * @author rotemrub
 *
 */

public class BalanceException extends Exception {

	public BalanceException() {
		super("Balance cannot be negetive or you don't have enought money to buy this stock");
	}

}
