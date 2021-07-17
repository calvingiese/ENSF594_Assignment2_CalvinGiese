/**
 * Class Name: SortingCLI
 * 
 * Constructs a new DataAnalysis CLI that interacts with the user and sorts an array based on the specifications entered by the user.
 * 
 * The main purpose of this class is to build an array using the size and order determined by the user, sort it using the algorithm 
 * determined by the user and print the results to a text file determined by the user.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */
public class SortingCLI {
	
	/**
	 * reader will allow for command line interactions between the user and the program.
	 */
	private KeyboardReader reader;
	
	/**
	 * Constructs the reader of object type KeyboardReader
	 */
	public SortingCLI() {
		reader = new KeyboardReader();
	}
	
	/**
	 * Implements user dialog
	 */
	public void run() {
		
		// Beginning of CLI
		reader.display('\n' + "		Sorting Analysis Program" + '\n');		
		
		// User input for order selection, repeats input prompt until valid selection is made
		String order;
		while(true) {
		reader.prompt('\n' + "Please enter the order (ascending, descending or random): ");
		order = reader.getKeyboardInput();
		if((order.equals("ascending")) || (order.equals("descending")) || (order.equals("random"))) {
			break;
			}
		}		
		
		// User input for array size, repeats input prompt until valid selection is made
		int length;
		while(true) {
		reader.prompt('\n' + "Please enter the size of the array (e.g. 1, 2, 5, 1000 etc.): ");
		try {
		length = reader.getKeyboardInteger();
		if(length % 1 == 0) {
			break;
			}
		}
		catch(Exception e) {
			length = 0;
			}
		}		
		
		// Builds array using the size and order determined by previous inputs
		ArrayBuilder array = new ArrayBuilder(length);
		array.arrayBuilder(order);
		
		// User input for sorting algorithm, repeats input prompt until valid selection is made
		String algorithm;
		while(true) {
		reader.prompt('\n' + "Please enter the sorting algorithm (bubble, insertion, merge or quick): ");
		algorithm = reader.getKeyboardInput();	
		if((algorithm.equals("bubble")) || (algorithm.equals("insertion")) || (algorithm.equals("merge")) || (algorithm.equals("quick"))) {
			break;
			}
		}
		
		// Executes sort
		Sort sorter = new Sort(algorithm, array.BuildArray());
		int[] sortedArray = sorter.sortArray();
		String exportArray = sorter.toString(sortedArray);
				
		// User input for output file location
		reader.prompt('\n' + "Please enter the file name for the output results (e.g. bubbleSort.txt): ");
		String file = reader.getKeyboardInput();
		Printer printArray = new Printer(file, algorithm, exportArray);
		printArray.Print();
		
		// Gets time taken to sort the array and displays results summary
		String sortTime = sorter.getTime();
		String displayText = '\n' + "The " + order + " array with " + length + " elements took " + sortTime + " seconds to sort when using the " + algorithm + " sorting method.";
		reader.display(displayText);
	}

	public static void main(String[] args) {
		SortingCLI app = new SortingCLI();
		app.run();		
	}

}
