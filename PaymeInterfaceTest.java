/**
 * <p>A class to test the Payme interface and its implementations.</p>
 *
 * <p>File name: PaymeInterfaceTest.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Tests the polymorphic behavior of the Payme interface and its implementations. </p>
 */
public class PaymeInterfaceTest  {

	/**
	 * 
	 * @param args The command-line arguments (not used).
	 */
public static void main(String[] args) {
	
	// Create different Payme objects representing invoices and programmers
	Payme invoice1 = new Invoice("22776", "brakes", 3, 300);
	Payme invoice2 = new Invoice("33442", "gear", 5, 90.99);
	Payme SP = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320.00);
	Payme HP = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40);
	Payme CP = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500, 0.44);
	Payme BP = new BasePlusCommissionProgrammer("Ben", "Nguyen", "102-34-5888", 1200, 0.04, 720);

	// Store the Payme objects in an array
	Payme[] paymeObjects = {invoice1, invoice2, SP, HP, CP, BP};

 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to BasePlusCommissioProgrammer reference.
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 

    System.out.printf("payment due: $%,.2f\n\n", currentPayme.getPaymentAmount());

 }
}
}


