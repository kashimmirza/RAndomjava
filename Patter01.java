package java002;

public class Matrix {
	public static void main(String []arg) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("*");
				}
				else 
					System.out.print("#");
			}
			System.out.println();
		}
	}

}
