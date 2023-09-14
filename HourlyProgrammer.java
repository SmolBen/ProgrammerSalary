/**
 * <p>A class representing an Hourly Based Programmer.</p>
 *
 * <p>File name: HourlyProgrammer.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents a Hourly Based Programmer, which is a type of Programmer that </p>
 * <p>receives an hourly wage.</p>
 */
public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

/**
 * Creates an HourlyProgrammer object with the specified details.
 *
 * @param firstName           The first name of the programmer.
 * @param lastName            The last name of the programmer.
 * @param socialSecurityNumber The social security number of the programmer.
 * @param wage                The hourly wage of the programmer.
 * @param hours               The hours worked for the week by the programmer.
 * @throws IllegalArgumentException if the wage is negative or if the hours are not within the range [0.0, 168.0].
 */
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * Sets the hourly wage for the programmer.
 *
 * @param wage The new hourly wage.
 * @throws IllegalArgumentException if the wage is negative.
 */
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * Returns the hourly wage of the programmer.
 *
 * @return The hourly wage.
 */
public double getWage() {
return wage;
} 

/**
 * Sets the number of hours worked for the programmer.
 *
 * @param hours The new hours worked for the week.
 * @throws IllegalArgumentException if the hours are not within the range [0.0, 168.0].
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * Returns the number of hours worked for the programmer.
 *
 * @return The hours worked for the week.
 */
public double getHours() {
return hours;
} 

/**
 * Calculates and returns the payment amount for the programmer.
 *
 * @return The total payment amount based on the hourly wage and hours worked.
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

/**
 * Returns a String representation of the HourlyProgrammer object.
 *
 * @return A String containing details of the programmer, including hourly wage and hours worked.
 */          
@Override         
public String toString() {
return "hourly Programmer: " + super.toString() + String.format("hourly wage: $%.2f; hours worked: %.2f",
        getWage(), getHours()
);
}

}

