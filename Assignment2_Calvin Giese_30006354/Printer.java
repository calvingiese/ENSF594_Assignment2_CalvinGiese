import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 
 * Class Name: Printer
 * 
 * Prints the array elements in string form to an text file
 * 
 * This class prints an array that has been converted to a text file that is determined by the program user
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */

public class Printer {

	/**
	 * The algorithm selected by the user to sort the array
	 */
	String algorithm;
	
	/**
	 * The array in string format to be printed
	 */
	String printArray;
	
	/**
	 * The file location for the array string to be printed to
	 */
	String file;
	
	/**
	 * Constructs the variables used in this class with the file name, algorithm and array string
	 * 
	 * @param file is the output text file location
	 * @param algorithm is the method used to sort the array
	 * @param printArray is the array to print
	 */
	public Printer (String file, String algorithm, String printArray){
		
		this.algorithm = algorithm;
		this.printArray = printArray;
		this.file = file;
	}
	
	/**
	 * This method is used to printed the array string to a text file
	 * 
	 * Does not return a value
	 */
	public void Print() {
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(this.file);
			writer.println(this.printArray);
			writer.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
