package JavaCodes;

public class WithoutArithmeticoperator1 {
	
	public static void main(String[] args) {
		int a = 11;
		int b = 5;
		int q = 0;
//		System.out.println(a%b+" "+a/b);
		while(a>=b) {
			a = a-b;
			q++;
		}
		System.out.println("Remainder is: "+a+ " and Quotient is: "+ q);
		
	}

}
