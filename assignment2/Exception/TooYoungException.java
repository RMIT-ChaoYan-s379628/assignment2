
/**
* @Author:Meng Gao	
* @Date: 17/5/2018
* @Introduction: 
*
*/
public class TooYoungException extends Exception {

	/*
	 * The set of variable unchangeable
	 */
	private static final long serialVersionUID = 1L;

	public TooYoungException() {
		super("Trying to make friend with a young child");
	}
}
