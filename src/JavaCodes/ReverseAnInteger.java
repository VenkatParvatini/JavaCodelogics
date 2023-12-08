package JavaCodes;

import java.util.*;

public class ReverseAnInteger {
	public static void ReverseAnIntegers(int n) {
		int sum=0;
		while(n !=0) {
			sum=sum*10+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your required Integer here");
		int n = sc.nextInt();
		ReverseAnIntegers(n);
	}

}
