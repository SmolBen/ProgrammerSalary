/**
 * <p>A class representing an Invoice that implements the Payme interface.</p>
 *
 * <p>File name: Payme.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents an invoice with details of the part, quantity, and price per item, and provides </p>
 * <p>a method to calculate the total payment amount for the invoice.</p>
 */
public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;

/**
 * Creates an Invoice object with the specified part number, part description, quantity, and price per item.
 *
 * @param part         The part number.
 * @param description  The part description.
 * @param count        The quantity of items.
 * @param price        The price per item.
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

/**
 * Sets the part number.
 *
 * @param part The new part number to be set.
 */
public void setPartNumber(String part) {
 partNumber = part; 
}

/**
 * Returns the part number.
 *
 * @return The part number.
 */
public String getPartNumber() {
 return partNumber;
}

/**
 * Sets the part description.
 *
 * @param description The new part description to be set.
 */
public void setPartDescription(String description) {
 partDescription = description; 
}

/**
 * Returns the part description.
 *
 * @return The part description.
 */
public String getPartDescription() {
 return partDescription;
}

/**
 * Sets the quantity of items in the invoice.
 *
 * @param count The new quantity to be set. If the input count is negative, the quantity will be set to 0.
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

/**
 * Returns the quantity of items.
 *
 * @return The quantity.
 */
public int getQuantity() {
 return quantity;
}

/**
 * Sets the price per item.
 *
 * @param price The new price per item to be set. If the input price is negative, the price will be set to 0.0.
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

/**
 * Returns the price per item.
 *
 * @return The price per item.
 */
public double getPricePerItem() {
 return pricePerItem;
}

/**
 * Returns a String representation of the Invoice object.
 *
 * @return A formatted String containing details of the invoice, including part number, part description,
 * quantity, and price per item.
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * Calculates and returns the total payment amount for the invoice.
 *
 * The total payment amount is calculated by multiplying the quantity of items with the price per item.
 *
 * @return The total payment amount for the invoice.
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); 
}
}

/* References: 
 * [1]"Java Ternary Operator with Examples" GeeksforGeeks, Nov. 25, 2019. https://www.geeksforgeeks.org/java-ternary-operator-with-examples/ (Accessed July 29, 2023).
 */

