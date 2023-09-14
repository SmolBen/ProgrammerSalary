/**
 * <p>A security clearance interface to represent different levels of clearance for code documents.</p>
 *
 * <p>File name: Security.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Purpose: Represents a security clearance system to classify code documents based on their clearance level.</p>
 */
public interface SecurityClearance {
	
    /**
     * Retrieves the security clearance.
     * 
     * @return The security level as an instance of ClearanceLevel.
     */
	public ClearanceLevel getSecurityLevel();
	
    /**
     * An enum representing different levels of security clearance for code documents.
     */
	public enum ClearanceLevel {
		
        /**
         * No security clearance.
         */
		NONE(0),
		
		 /**
         * Regular security clearance. 
         */
		REGULAR(1),
		
		/**
         * Enhanced security clearance.
         */
		ENHANCED(2),
		
        /**
         * Higher security clearance.
         */
		SECRET(3),
		
        /**
         * Top-secret security clearance.
         */
		TOP_SECRET(4),
		
        /**
         * The highest level of security clearance.
         */
		TRUMP_LEVEL_SECURITY(5);
		
		private final int clearanceLevel;
		
        /**
         * Constructs a ClearanceLevel enum with the specified integer value representing the clearance level.
         *
         * @param clearanceLevel The integer value representing the clearance level.
         */
		ClearanceLevel(int clearanceLevel){this.clearanceLevel = clearanceLevel;}		
	}
}
