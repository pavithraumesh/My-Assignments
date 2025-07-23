package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To print 0,1,1,2,3,5,8 and 13
		int n=8;
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for(int i=1;i<=n-3;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}

}
