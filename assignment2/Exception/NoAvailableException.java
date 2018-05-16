
/*
 * Author:Meng Gao	
 * Date: 17/5/2018
 * Introduction: No connection between two adults
 *Exceptions for adult
 */
public class NoAvailableException extends Exception {

	/*
	*The set of variable unchangeable
	 */
	private static final long serialVersionUID = 1L;

	/* 
	*Exceptions of two adults have least one connection with another adult as a couple.
	*/
	public NoAvailableException() {
		super("At least one of them is already married with another adult.");
	}
}
