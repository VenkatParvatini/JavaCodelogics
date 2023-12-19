package JavaCodes;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
		if(i%i==0&&i%1==0&&i%2==1) {
			System.out.println(i);
		}
		
	}

	}
}
