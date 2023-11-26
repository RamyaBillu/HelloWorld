package loop_nov14;

public class SelectionSort {
	    public static void main(String[] args) {
	        int[] array = {5, 2, 9, 1, 5, 6};

	        System.out.println("Original Array: ");
	        printArray(array);

	        selectionSort(array);

	        System.out.println("\nSorted Array: ");
	        printArray(array);
	    }

	    static void selectionSort(int[] arr) {
	        int n = arr.length;

	        // One by one move the boundary of the unsorted subarray
	        for (int i = 0; i < n - 1; i++) {
	            // Find the minimum element in the unsorted array
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}



