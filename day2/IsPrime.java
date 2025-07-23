package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=2;i<=n-1;i++){
		if(n%i==0) {
		System.out.println("Not a Prime number");
		break;
		}
		else {
		System.out.println("Prime number");
						}
					}
	}
}
