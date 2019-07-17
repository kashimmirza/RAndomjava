import java.util.*;
public class Problem05ass02 {
	public static void main(String[]arg) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(palin(n));
	}
		
		public static int rev(int k) {
		 int sum = 0;
			while(k>0) {
			 int r=k%10;
			 k=k/10;
			   sum=sum*10+r;
		 }
		 return sum;
		}
public static boolean palin(int n) {
			
		
		
			if(n-rev(n)==0) {
				return true;
				
			}
			return false;
		}
		
		
	}


