package loop_nov14;
import java.util.Arrays;


public class BinarySearch {

	    // Sequential Search
	    public static int sequentialSearch(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; // Element found, return its index
	            }
	        }
	        return -1; // Element not found
	    }

	    // Binary Search (Array must be sorted)
	    public static int binarySearch(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (array[mid] == target) {
	                return mid; // Element found, return its index
	            } else if (array[mid] < target) {
	                left = mid + 1; // Search in the right half
	            } else {
	                right = mid - 1; // Search in the left half
	            }
	        }

	        return -1; // Element not found
	    }

	    public static void main(String[] args) {
	        int[] array = {2, 5, 8, 12, 16, 23, 38, 42, 56, 72};

	        // Element to search
	        int target = 23;
	          int index=binarySearch(array,target);
	          System.out.println(index);

	     
	    }
	}



