import java.util.Scanner;

public class Problem04ass02 {
   public static void main(String[]arg) {
	   Scanner input=new Scanner(System.in);
	   int n=input.nextInt();
	   int a[]= new int[40];
		    int i=0;
		   
		   while(n>0) {
	   
		   int re=n%2;
		    a[i++]=re;
		    
		   n=n/2;
			  
			  
		   }
		   
		  
		  
		 for(int j=i-1;j>0;j--) {
			   System.out.print(a[j]+" ");
			   
			   
			   
		   }

	   
   }
}
