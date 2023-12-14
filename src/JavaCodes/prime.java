package JavaCodes;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%n==0||n%1==0) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
