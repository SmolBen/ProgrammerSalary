/**
 * <p>A class representing a Salaried Programmer.</p>
 *
 * <p>File name: SalariedProgrammer.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents a Salaried Programmer, which is a type of Programmer that receives </p>
 * <p>a fixed weekly salary.</p>
 */
public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

/**
 * Creates a SalariedProgrammer object with the given security level.
 *
 * @param securityLevel The security clearance level of the programmer.
 */
public SalariedProgrammer(SecurityClearance.ClearanceLevel securityLevel) {
    super(securityLevel); // Call the constructor of the superclass
}

/**
 * Creates a SalariedProgrammer object with the specified details.
 *
 * @param firstName            The first name of the programmer.
 * @param lastName             The last name of the programmer.
 * @param socialSecurityNumber The social security number of the programmer.
 * @param weeklySalary         The fixed weekly salary of the programmer.
 * @throws IllegalArgumentException if the weekly salary is negative.
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * Sets the weekly salary for the programmer.
 *
 * @param  weeklySalary The new weekly salary.
 * @throws IllegalArgumentException if the weekly salary is negative.
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * Returns the weekly salary of the programmer.
 *
 * @return The weekly salary.
 */
public double getWeeklySalary() {
return weeklySalary;
} 

/**
 * Returns the fixed weekly salary as the payment amount for the programmer.
 *
 * @return The weekly salary as the payment amount.
 */
@Override                                                           
public double getPaymentAmount(){                                          
return getWeeklySalary();                                        
}                                             

/**
 * Returns a String representation of the SalariedProgrammer object.
 *
 * @return A formatted String containing details of the programmer, including the weekly salary.
 */
@Override 
public String toString() {
	 return "salaried Programmer: " + super.toString() + String.format("%s $%.2f", "weekly salary: ", getWeeklySalary());
}
                                           
}

