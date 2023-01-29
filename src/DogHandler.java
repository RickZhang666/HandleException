import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * This class to explore exception handling for different exception type. 
 * <p>Name: 22F Assignment 2</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 26, 2022</p>
 * <p>Section: 313</p>

 * @author Rick Zhang
 * @see java.io.File
 * @see java.io.FileInputStream
 * @see java.io.FileNotFoundException
 * @version 1.0
 * @since 11.0.15
 */
public class DogHandler {
	
	/**
	 * This is the entry point for the test
	 * output catch different type of exception in main method.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		testExceptionDog();
		testExceptionPuppy();
		testNullPointerException();
		testIOException();
	}
	
	/** this method to catch and execute a exception from ExceptionPuppy()*/
	public static void testExceptionDog() {
		try{
			throw new ExceptionDog();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/** this method to catch and execute a exception from ExceptionDog()*/
	public static void testExceptionPuppy() {
		try{
			throw new ExceptionPuppy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** this method to catch and execute a NullPointerException type of exception*/
	public static void testNullPointerException(){
		try{
			int result3[] = null;
			System.out.println(result3[3]);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	/** this method to catch and execute a IOException type of exception*/
	public static void testIOException() {
		try{
			File file = new File("assignment2.txt");
			FileInputStream fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * {@inheritDoc}
	 * an inner class named ExceptionDog that extends Exception
	 */
	static class ExceptionDog extends Exception{
	}
	
	/**
	 * {@inheritDoc}
	 * an inner class named ExceptionPuppy that extends ExceptionDog
	 */
	static class ExceptionPuppy extends ExceptionDog{
	}
}



