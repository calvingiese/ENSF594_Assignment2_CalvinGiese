/**
 * 
 * Class Name: MergeSort
 * 
 * Sorts an array of elements using the merge sorting algorithm
 * 
 * This class sorts an array that has been passed and tracks how long it takes to perform the sorting.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */

public class MergeSort {
// https://www.baeldung.com/java-merge-sort
// Accessed July 13, 2021
// Portions of code provided by: Baeldung
	
	/**
	 * The array filled with elements in ascending, descending or random order
	 */
	private int[] array;
	
	/**
	 * The length of the array being sorted
	 */
	private int length;
	
	/**
	 * The amount of time it takes to sort the array
	 */
	private String elapsedTime;

	/**
	 * 
	 * Constructs the array and array length for the class
	 * 
	 * @param array is the array to be sorted
	 * @param length is the number of elements in the array
	 */
	public MergeSort(int[] array, int length) {
		
		this.array = array;
		this.length = length;
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
	 * @param a is the array
	 * @param n is the array size
	 * @return the sorted array
	 */
	public int[] mergeSort(int[] a, int n) {
		
		long startTime = System.nanoTime();
		if(n< 2) {
			return a;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
		
		for(int i = 0; i < mid; i ++) {
			l[i] = a[i];
		}
		
		for(int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		
		mergeSort(l, mid);
		mergeSort(r, n - mid);
		
		float timeDiff = (float) ((System.nanoTime() - startTime)/1000000000.0);
		this.elapsedTime = "" + timeDiff;
		return merge(a, l , r, mid, n - mid);
	}
	
	/**
	 * 
	 * This method adds two subarrays back together
	 * 
	 * @param a is the array to sort
	 * @param l is the left subarray
	 * @param r is the right subarray
	 * @param left is the biggest element index the left array should be counted to
	 * @param right is the smallest elements index the right array should count from
	 * @return the merged array
	 */
	public int[] merge(int[] a, int[] l, int[]r, int left, int right) {
		
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        }
	        else {
	            a[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        a[k++] = l[i++];
	    }
	    while (j < right) {
	        a[k++] = r[j++];
	    }
	    
	    return a;
	}
}