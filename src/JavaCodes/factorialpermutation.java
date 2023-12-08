package JavaCodes;

import java.util.Scanner;

public class factorialpermutation {
	
	
	public static void method1(int n, int r) {
		
		int fact1 = n;
		
		for(int i =n-1;i>=1;i--) {
			fact1 = fact1*i;
		}
		
		int number = n-r;
		int fact2 = number;
		for(int i =number-1;i>=1;i--) {
			fact2 = fact2*i;
		}
		
		int rep = fact1/fact2;
		System.out.println(rep);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		method1(n,r);
	}

}
