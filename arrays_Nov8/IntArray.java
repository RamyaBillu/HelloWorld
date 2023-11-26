package arrays_Nov8;

public class IntArray {

	public static void main(String[] args) {
		// int []array=new int[4];//arrays declaring types//
		// int[]array= {10,20};
		int[] array = null;
		array = new int[4];
		array[0] = 10;
		array[1] = 2;
		array[2] = 30;
		array[3] = 40;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		//printing sum//
		System.out.println(array[0] + array[1] + array[2] + array[3]);

		System.out.println(array[5]);// exception index out of bounds
	}

}
