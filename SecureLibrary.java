/**
 * <p>A class representing a Secure Library.</p>
 *
 * <p>File name: SecureLibrary.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents a Secure Library containing code documents with various security clearances.</p>
 */
public class SecureLibrary {
	
    /**
     * Retrieves an array of code documents in the secure library.
     * Under real conditions, the library, and the documents, would be behind a secure firewall
     *
     * @return An array of `SecurityClearance` objects representing code documents with various security clearances.
     */
	public SecurityClearance[] getLibrary() {
		SecurityClearance[] clearanceLibrary = {
			new SecureCode(1111, SecurityClearance.ClearanceLevel.NONE),
			new SecureCode(1112, SecurityClearance.ClearanceLevel.TOP_SECRET),
			new SecureCode(1113, SecurityClearance.ClearanceLevel.REGULAR),
			new SecureCode(1114, SecurityClearance.ClearanceLevel.TOP_SECRET),
		    	new SecureCode(1112, SecurityClearance.ClearanceLevel.SECRET),
		    	new SecureCode(1113, SecurityClearance.ClearanceLevel.TRUMP_LEVEL_SECURITY)};
		return clearanceLibrary;
	}
}
