package JavaCodes;


import java.util.*;

public class toremoveduplicatecharfromaString {
	
	
	public static void main(String[] args) {
			String str = "Manikanth";
			Set<Character> set = new TreeSet<Character>();
			for(int i =0;i<str.length();i++) {
				set.add(str.charAt(i));
			}
			for(char ch: set) {
				
				System.out.print(ch);
			}
		}
	}


