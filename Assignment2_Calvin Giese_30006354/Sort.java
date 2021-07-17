/**
 * 
 * Class Name: Sort
 * 
 * Selects the sorting method to be used depending on the entry made by the user
 * 
 * This class creates an instance of one of the sorting algorithm classes when that particular method is chosen. The toString
 * method can also be used to return the sorted array as a string
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */
public class Sort {

	/**
	 * The sorting algorithm to use, chosen by the user 
	 */
	private String algorithm;
	
	/**
	 * The array to sort
	 */
	private int[] array;
	
	/**
	 * The amount of time it takes to sort the array
	 */
	private String elapsedTime;
	
	/**
	 * 
	 * Constructs the array and sorting algorithm for the class
	 * 
	 * @param algorithm is the method selected to sort with
	 * @param array is the array to sort
	 */
	public Sort(String algorithm, int[]array) {
		this.algorithm = algorithm;
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
	 * Uses logic to determine which sorting method will be used and calls on that class to sort the array
	 * 
	 * @return a sorted array
	 */
	public int[] sortArray() {
		if(this.algorithm.equals("bubble")) {
			BubbleSort bubble = new BubbleSort(this.array);
			this.array = bubble.bubbleSort();
			this.elapsedTime = bubble.getTime();
			return this.array;
		}
		else if(algorithm.equals("insertion")) {
			InsertionSort insertion = new InsertionSort(this.array);
			this.array = insertion.insertionSort();
			this.elapsedTime = insertion.getTime();
			return this.array;
		}
		else if(algorithm.equals("merge")) {
			MergeSort merge = new MergeSort(this.array, this.array.length);
			this.array = merge.mergeSort(this.array, this.array.length);
			this.elapsedTime = merge.getTime();
			return this.array;
		} 
		else if(algorithm.equals("quick")) {
			QuickSort quick = new QuickSort(this.array, this.array.length);
			this.array = quick.quickSort(this.array, 0, this.array.length - 1);
			this.elapsedTime = quick.getTime();
			return this.array;
		} 
		else {
			return this.array;
		}
	}
	
	/**
	 * 
	 * Converts the sorted array into string format
	 * 
	 * @param a is the array
	 * @return the sorted array as a string
	 */
	public String toString(int[] a) {
		
		StringBuffer b1 = new StringBuffer();
		String arrString;
		
		for(int z = 0; z < a.length; z++) {
	    	b1.append(a[z]);
	    	if(z < a.length-1) {
				b1.append(" ");
			}
	    }
	    arrString = b1.toString();
	    return arrString;
	}
}
