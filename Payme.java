/**
 * <p>An interface representing a payment system for programmers.</p>
 *
 * <p>File name: Payme.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Provides a method to calculate a Programmer's payment amount. </p>
 */
public interface Payme {
	
    /**
     * Calculates the payment amount for the programmer.
     * 
     * The actual calculation of the payment amount is implemented in concrete classes that implement this interface.
     * Each concrete class defines its own payment calculation logic based on the type of programmer and their work.
     * 
     * @return The payment amount for the programmer.
     */
	double getPaymentAmount();
	}
