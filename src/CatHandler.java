/**
 * This class to explore exception handling for inheritance. 
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
public class CatHandler {
	
	/**
	 * This is the entry point for the test
	 * display the inheritance of exception and catch subclass exception by superclass.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		testExceptionBeta();
		testExceptionGammer();
		
	}
	
	/** this method to execute a exception from ExceptionBeta()*/
	public static void testExceptionBeta() {
		try{
			throw new ExceptionBeta();
		}catch(ExceptionAlpha e) {
			e.printStackTrace();
		}
	}
	/** this method to execute a exception from ExceptionGammer()*/
	public static void testExceptionGammer() {
			try{
				throw new ExceptionGammer();
			}catch(ExceptionAlpha e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * {@inheritDoc}
	 * an inner class named ExceptionAlpha that extends Exception
	 */
	static class ExceptionAlpha extends Exception{
	}
	
	/**
	 * {@inheritDoc}
	 * an inner class named ExceptionBeta that extends ExceptionAlpha
	 */
	static class ExceptionBeta extends ExceptionAlpha{
	}
	
	/**
	 * {@inheritDoc}
	 * an inner class named ExceptionGammer that extends ExceptionBeta
	 */
	static class ExceptionGammer extends ExceptionBeta{
	}


}
