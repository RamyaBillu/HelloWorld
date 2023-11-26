package loop_nov14;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
    int[] array= {8,9,1,2,3,4};
    for(int i=0;i<array.length-1;i++) {
    	for(int j=0;j<array.length-1-i;j++) {
    		//descending order//
//         if(array[j]<array[j+1]) {
        	 if(array[j]>array[j+1]){//ascending order
        	 
        	 int temp=array[j];
        	 array[j]=array[j+1];
        	 array[j+1]=temp;
         }
    	}
    	
    }
    System.out.println(Arrays.toString(array));
	}

}
