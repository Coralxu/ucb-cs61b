/*
BadTransactionException.java
*/

public class BadTransactionException extends Exception {

	public int amount;

	public BadTransactionException(int amount) {
		super("Invalid amount: " + amount);
		this.amount = amount;
	} 
}
