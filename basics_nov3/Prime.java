package basics_nov3;


	import java.util.Scanner;//debugging

	public class Prime{
		public static void main(String[]args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter n:");
			
			int n=s.nextInt();
			test(n);
		}
			static void test(int s) {
			for(int i=2;i<=s/2;i++) {
				if(s%i==0) {
					System.out.println("not prime");
				}
				break;
				
			}
			System.out.println("prime");
		}
		
	
	}
	


		





