package JavaCodes;

import java.util.Scanner;

public class CountofVowels2 {
	
	public static void CountofVowel(String str) {
		
		String[] strarr = str.split(" ");
		int a =0;
		int e =0;
		int i=0;
		int o=0;
		int u=0;
		
		for(int i1=0;i1<strarr.length;i1++) {
			
			char ch =str.charAt(i1);
			if(ch=='a') {
				a++;
			}
			if(ch =='e' ) {
				e++;
			}
			if(ch=='i') {
				i++;
			}
			if(ch =='o' ) {
				o++;
			}
			if(ch =='u' ) {
				u++;
			}
				
		}
		System.out.println(a);
		System.out.println(e);
		System.out.println(i);
		System.out.println(o);
		System.out.println(u);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		CountofVowel(str);
	}

}
