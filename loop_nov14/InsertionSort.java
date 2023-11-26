package loop_nov14;

public class InsertionSort {

	public static void main(String[] args) {
		
		        int[] array = {5, 2, 9, 1, 5, 6};
		        
		        System.out.println("Original Array: ");
		        printArray(array);

		        insertionSort(array);

		        System.out.println("\nSorted Array: ");
		        printArray(array);
		    }

		    static void insertionSort(int[] arr) {
		        int n = arr.length;

		        for (int i = 1; i < n; ++i) {
		            int key = arr[i];
		            int j = i - 1;

		            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
		            while (j >= 0 && arr[j] > key) {
		                arr[j + 1] = arr[j];
		                j = j - 1;
		            }
		            arr[j + 1] = key;
		        }
		    }

		    static void printArray(int[] arr) {
		        for (int value : arr) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
		

	

}

