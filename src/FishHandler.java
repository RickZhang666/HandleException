/**
 * This class to explore exception handling for try-catch.
 * <p>Name: 22F Assignment 2</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 26, 2022</p>
 * <p>Section: 313</p>

 * @author Rick Zhang
 * @see java.time.LocalDate
 * @see java.util.Calendar
 * @see java.util.Scanner
 * @version 1.0
 * @since 11.0.15
 */
public class FishHandler {

	/**
	 * This is the entry point for the test
	 * use try-catch structure execute throw exception in main method.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		try {
			easterStarting();
		}catch(Exception e) {
//			e.getStackTrace();
			e.printStackTrace();
//			System.out.println(e.getStackTrace());
		}
	}
	
	/** this method to throw and execute a exception
	 * @throws Exception Exception type
	 */
	public static void easterEnding() throws Exception{
		throw new Exception();
	}
	
	/** this method to throw and execute a exception from method easterEnding() 
	 * @throws Exception Exception type
	 */
	public static void easterStarting() throws Exception{
		try{
			easterEnding();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
