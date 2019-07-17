import java.util.*;
public class Problem06ass02 {
	public static void main(String[]arg) {
		double start=1;
		double end=901;
		System.out.println("\ni      m(i)");
		System.out.println("_ _ _ _") ;
		for(double i=start;i<=end;i+=100) {
			
			System.out.printf("%-12.0f", i);
			System.out.printf("%-6.4f\n",est(i));
		}
		
		
		
		
		
	}
	public static double est(double n) {
		
		
		double pi=0;
		for(double i=1;i<=n;i++) {
			pi+=Math.pow(-1,i+1)/(2*i-1);
		}
		pi*=4;
		return pi;
		
	}
	

}
