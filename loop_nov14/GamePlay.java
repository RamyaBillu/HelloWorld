package loop_nov14;

import java.util.Scanner;

public class GamePlay {
	public void play() {
		int []array= {1,1,1,0,0};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			
			
		}
		System.out.println(sum);
		int sum1=0;
		
		int array1[]= {1,1,1,1,1};
		for(int i=0;i<array1.length;i++) {
			sum1+=array1[i];
			
		}
		System.out.println(sum1);
		int sum2=0;
		int array2[]= {0,0,0,0,0};
		
			for(int i=0;i<array2.length;i++) {
				sum2+=array2[i];}
			System.out.println(sum2);
				
			 int sum3=0;
		int array3[]= {1,0,1,0,1};
		for(int i=0;i<array3.length;i++) {
			sum3+=array3[i];
		}
		System.out.println(sum3);
		int sum4=0;
			
		int array4[]= {1,0,0,1,1};
		for(int i=0;i<array4.length;i++) {
			sum4+=array4[i];
			
		
		}
		System.out.println(sum4);
		System.out.println("...............");
		int []add= {sum,sum1,sum2,sum3,sum4};
		for(int j=0;j<add.length;j++) {
				
		
		System.out.println(add[j]+"is sum for"+"="+j);
		
		if(add[j]>=5) 

		System.out.println("they r winners");
			
		}
	}
}


