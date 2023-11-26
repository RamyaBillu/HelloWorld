package loop_nov14;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number");
		int start=sc.nextInt();
		GamePlay gamePlay=new GamePlay();
		if(start==1) {
			gamePlay.play();
		
		}
		
	}

}
