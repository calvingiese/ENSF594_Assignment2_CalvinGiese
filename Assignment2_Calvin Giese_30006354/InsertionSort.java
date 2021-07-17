/**
 * 
 * Class Name: InsertionSort
 * 
 * Sorts an array of elements using the insertion sorting algorithm
 * 
 * This class sorts an array that has been passed and tracks how long it takes to perform the sorting.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */

public class InsertionSort {

	/**
	 * The array filled with elements in ascending, descending or random order
	 */
	private int[] array;
	
	/**
	 * The amount of time it takes to sort the array
	 */
	private String elapsedTime;
	
	/**
	 * Constructs the array for the class
	 * 
	 * @param array is the array to be sorted
	 */
	public InsertionSort(int[] array) {
		
		this.array = array;
	}
	
	/**
	 * Method used to retrieve the amount of time taken to sort the array
	 * 
	 * @return the algorithm execution time
	 */
	public String getTime() {
		return this.elapsedTime;
	}

	/**
	 * This method performs the sorting, changing the array of elements into an array of ascending order elements
	 * 
	 * @return the sorted array
	 */
	public int[] insertionSort() {
		
		long startTime = System.nanoTime();
		for(int i = 1, j; i < this.array.length; i ++) {
			int temp = this.array[i];
			for(j = i; j > 0 && temp < this.array[j - 1]; j--)
				this.array[j] = this.array[j - 1];
			this.array[j] = temp;
		}
		float timeDiff = (float) ((System.nanoTime() - startTime)/1000000000.0);
		this.elapsedTime = "" + timeDiff;
		return this.array;
	}	
}