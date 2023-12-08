package JavaCodes;

import java.util.*;

public class Occuranceofachar {
	
 static void Occuranceofachar1(String str) {
	 char[] ch = str.toCharArray();
	 int num=1;
	 char chartoreplace = 'c';
	 for(char c:ch) {
		 if(c==chartoreplace) {
			 str = str.replaceFirst(String.valueOf(c), String.valueOf(num));
			 num++;
		 }
	 }
	 System.out.println("The occurance of character 'c' is :"+str);
 }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your string here");
	String str = sc.next();
	Occuranceofachar1(str);
}
}
