import java.io.FileNotFoundException;
/**
 * This class to explore exception handling for try-catch-finally. 
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
public class OrderHandler {
	
	/**
	 * This is the entry point for the test
	 * try catching the superclass exception type before the subclass exception type.
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				throw new FileNotFoundException();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
