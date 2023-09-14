/**
 * <p>A class to test the security clearance system and its implementations.</p>
 *
 * <p>File name: SecurityClearanceTester.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Tests the security clearance system by processing programmers and code documents from the library </p>
 * <p>and determining access status for each Programmer based on their security clearance level.</p>
 */
public class SecurityClearanceTester {

    /**
     * @param args The command-line arguments (not used).
     */
	public static void main(String[] args) {

		// Create an array of different Programmer objects with different security clearance levels
		SecurityClearance[] programmers = { 

			new CommissionProgrammer(SecurityClearance.ClearanceLevel.TOP_SECRET),
			new BasePlusCommissionProgrammer(SecurityClearance.ClearanceLevel.SECRET),
			new SalariedProgrammer(SecurityClearance.ClearanceLevel.NONE)
		};
					
		// Create a SecureLibrary object and get the array of code documents from the library
		SecureLibrary library = new SecureLibrary();
		SecurityClearance[] clearanceLibrary = library.getLibrary();
		
		
        // Print the header row with Programmer numbers
        System.out.printf("                 ");
        for (int i = 0; i < programmers.length; i++) {
            System.out.printf("Programmer #%d" + "            ", (i + 1));
        }
        System.out.println();

        // Print the rows for each SecureCode object and the access status for each Programmer
        for (int i = 0; i < clearanceLibrary.length; i++) {
            System.out.printf("SecureCode #%d" + "    ", (i + 1));
            for (int j = 0; j < programmers.length; j++) {

            	// Compare security level
                if (programmers[j].getSecurityLevel().ordinal() >= clearanceLibrary[i].getSecurityLevel().ordinal()) {
                    System.out.printf("%-25s", "Cleared for Access");
                } else {
                    System.out.printf("%-25s", "Access Denied");
                }
            }
            System.out.println();
        }
    }
}

/* References:
 * [1]L. Gupta, "Java Enum Tutorial - Constructor and Methods (with Examples)" HowToDoInJava, Dec. 06, 2012. https://howtodoinjava.com/java/enum/enum-tutorial/ Aaccessed July 29, 2023).
 */
