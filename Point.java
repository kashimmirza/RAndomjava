
public class Point {
	int x,y;
	//constructor
	Point(){
		
		
	}
	Point(int a,int b){
		
		x=a;
		y=b;
	}
	public  void print() {
		
		System.out.println("this is x:"+x+" "+" this is :"+y);
	}
	public boolean check(Point c) {
		if(x==c.x&&y==c.y) {
			return true;
		}
		return false;
		
		
	}
	public double  dis(Point c) {
		double val =Math.pow(x-c.x,2)+Math.pow(y-c.y, 2);
	return	Math.sqrt(val);
		
		
	}
	public static void main(String[]arg) {
		
		Point t=new Point(23,45);
		System.out.println(t.x);
		System.out.println(t.y);
		t.print();
		Point p=new Point(2,3);
	 Point c=new Point(5,7);
		
		System.out.println(p.check(c));
		System.out.println(p.dis(c));
	}

}
