/**
 * 
 * Class Name: QuickSort
 * 
 * Sorts an array of elements using the quick sorting algorithm
 * 
 * This class sorts an array that has been passed and tracks how long it takes to perform the sorting.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */

public class QuickSort {
// https://www.programcreek.com/2012/11/quicksort-array-in-java/
// Accessed July 13, 2021
// Portions of code provided by: Program Creek
	
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
	public QuickSort(int[] array, int length) {
		
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
	 * 
	 * This method performs the sorting, changing the array of elements into an array of ascending order elements
	 * 
	 * @param arr is the array to sort
	 * @param begin is the starting position to sort on
	 * @param end is the array element used to pivot
	 * @return the sorted array
	 */
	public int[] quickSort(int arr[], int begin, int end) {
		
		long startTime = System.nanoTime();
		int partition = partition(arr, begin, end);
		 
        if(partition-1>begin) {
            quickSort(arr, begin, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
        
        float timeDiff = (float) ((System.nanoTime() - startTime)/1000000000.0);
		this.elapsedTime = "" + timeDiff;
	    return this.array;
	}
	
	/**
	 * 
	 * This method sorts the subarray passed from the mergeSort method
	 * 
	 * @param arr is the array to sort
	 * @param begin is the starting position to sort at
	 * @param end is the position used to split the array
	 * @return the partially sorted array
	 */
	public int partition(int arr[], int begin, int end) {
		
		int pivot = arr[end];

	    for (int i = begin; i < end; i++) {
	        if (arr[i] < pivot) {
	            int temp = arr[begin];
	            arr[begin] = arr[i];
	            arr[i] = temp;
	            begin++;
	        }
	    }

	    int temp = arr[begin];
	    arr[begin] = pivot;
	    arr[end] = temp;

	    return begin;
	}
}