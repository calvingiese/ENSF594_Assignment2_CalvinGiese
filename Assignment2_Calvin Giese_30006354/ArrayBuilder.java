
/**
 * 
 * Class Name: ArrayBuilder
 * 
 * Builds an array from the provided parameters, one being the length of the array and the other being the order of values.
 * 
 * This class can build an array in ascending order, descending order or random (with number generated between 0 and n). It 
 * can also return the array in string format with the toString method. 
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since July 17, 2021
 *
 */
public class ArrayBuilder {

	/**
	 * Empty array that will be filled with ordered or random elements for the user-entered size 
	 */
	private int[] array;
	
	/**
	 * Number of elements in the array
	 */
	private int len;
	
	/**
	 * Constructor initializes the array with the length passed into the class
	 * 
	 * @param len is the length/number of elements inside the array
	 */
	public ArrayBuilder(int len) {
		this.len = len;
		this.array = new int[len];
	}	
	
	/**
	 * 
	 * This method returns the empty array and can be filled with the arrayBuilder method
	 * 
	 * @return the built array
	 */
	public int[] BuildArray() {
		
		return this.array;
	}

	/**
	 * 
	 * This method fills the array with elements either in ascending, descending or random order.
	 * 
	 * @param order is the way the elements are organized in the array. 
	 * @return the filled array
	 */
	public int[] arrayBuilder(String order) {
		
		if(order.equals("ascending")) {
			for(int i = 0; i < this.len; i++) {
				this.array[i] = i + 1;
			}
		}
		else if(order.equals("descending")) {
			for(int i = 0; i < this.array.length; i++) {
				this.array[i] = this.array.length - i;
			}
		}
		else if(order.equals("random")) {
			for(int i = 0; i < this.len; i++) {
				this.array[i] = (int)Math.round(Math.random() * this.len);
			}
		}
	return this.array;
	}
	
	/**
	 * 
	 * This method converts an array to a string format with spaces between elements
	 * 
	 * @param a is the array, full of elements
	 * @return the array in string format
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
