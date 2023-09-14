/**
 * <p>A class representing a Programmer.</p>
 *
 * <p>File name: Programmer.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents a Programmer, which is a base class for different types of programmers </p>
 * <p>that implement the Payme and SecurityClearance interfaces.</p>
 */
public abstract class Programmer implements Payme, SecurityClearance{

private String firstName;
private String lastName;
private String socialSecurityNumber;
private SecurityClearance.ClearanceLevel securityLevel;

/**
 * Creates a Programmer object with the specified details.
 *
 * @param first   The first name of the programmer.
 * @param last    The last name of the programmer.
 * @param ssn     The social security number of the programmer.
 */
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

/**
 * Creates a Programmer object with the given security level.
 *
 * @param securityLevel The security clearance level of the programmer.
 */
public Programmer(SecurityClearance.ClearanceLevel securityLevel) {
    this.securityLevel = securityLevel;
}

/**
 * Returns the security clearance level of the programmer.
 *
 * @return The security clearance level.
 */
public SecurityClearance.ClearanceLevel getSecurityLevel() {
    return securityLevel;
}

/**
 * Returns the first name of the programmer.
 *
 * @return The first name.
 */
public String getFirstName() {
	return firstName;
}

/**
 * Returns the last name of the programmer.
 *
 * @return The last name.
 */
public String getLastName() {
	return lastName;
}

/**
 * Returns the social security number of the programmer.
 *
 * @return The social security number.
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * Returns a String representation of the Programmer object.
 *
 * @return A formatted String containing the programmer's first name, last name, and social security number.
 */
@Override
public String toString() {
    return String.format("%s %s\nsocial security number: %s\n", 
            getFirstName(), getLastName(), getSocialSecurityNumber());
}

/**
 * Abstract method to calculate and return the payment amount for the programmer.
 * This method must be implemented by concrete subclasses of Programmer.
 *
 * @return The payment amount, specific to the concrete subclass implementation.
 */
public abstract double getPaymentAmount(); 
} 


