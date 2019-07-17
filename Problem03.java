import java.util.*;
public class Problem03ass2 {
	public static void main(String []arg) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a=1;
		int b=a+2;
		double sum=0.0;
		sum+=(a*1.0)/b;
		for(int i=2;i<=n;i++) {
			a=i+2;
			b+=a+2;
		
	
			sum+=(a*1.0)/b;
		}
		System.out.printf("%.2f",sum);
		
		
		
	}

}
