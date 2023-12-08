package practiceJavaCodes;

public class ReverseInt {
	
	public static int reverseint(int a) {
		int b =0;
		while(a!=0) {
			b =b+a%10;
			a = a/10;
		}
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseint(12345));
	}

}
