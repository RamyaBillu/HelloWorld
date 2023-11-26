package loop_nov14;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int number =sc.nextInt();
    int temp=number;
    int reverse=0;
    while(number>0) {
    	int rem=number%10;
    	reverse=reverse*10+rem;
    	number=number/10;
    	
    	
    }
    if(temp==reverse)
    	System.out.println("palindrome");
    else System.out.println("not palindrome");
	}

}
