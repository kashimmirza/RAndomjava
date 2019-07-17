import java.util.Scanner;

public class Prob01ass02 {
	public static void main(String[]arg) {
		Scanner input=new Scanner(System.in);
	
		int []a=  new  int [100];
		int  belowave=0;
		int aboveave=0;
		double av=0.0;
		int i=0;
		int s=0;
		int  sum=0;
		while(true) {
			int x=input.nextInt();
			if(x==0) {
				break;
			}
			else {
				s++;
				a[i]=x;
				sum+=a[i];
				i++;
				
			}
			
		}
		av=sum/s*(1.0);
	
		for(int j=0;j<i;j++) {
			if(a[j]>av) {
				aboveave++;
				
				
				
			}
			else
				belowave++;
			
		}
		System.out.println("average "+" "+av);
		System.out.println(" belowav "+" "+belowave);
		System.out.println("aboveave "+" "+aboveave);
	
		
	}

}
