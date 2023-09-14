/**
 * <p>A class representing a Secure Code that implements the SecurityClearance interface.</p>
 *
 * <p>File name: SecureCode.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents a Secure Code with a document number and clearance level.</p>
 */
public class SecureCode implements SecurityClearance {

	private ClearanceLevel clearance;
	private int documentNumber;
	
    /**
     * Creates a SecureCode object with the specified document number and clearance level.
     *
     * @param documentNumber The document number associated with the secure code.
     * @param clearance      The clearance level associated with the secure code.
     */
	public SecureCode(int documentNumber, ClearanceLevel clearance) {
		this.documentNumber = documentNumber;
		this.clearance = clearance;
	}

    /**
     * Returns the clearance level associated with the secure code.
     *
     * @return The clearance level of the secure code.
     */
	public ClearanceLevel getSecurityLevel() {
		return this.clearance;
	};
}
