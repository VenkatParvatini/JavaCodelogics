package JavaCodes;

import java.util.*;

public class OccuranceEachCharacter {
	
	public static void occ(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		for(char c:map.keySet()) {
			if(map.get(c)>1) {
				System.out.println(c+": "+map.get(c));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String str = sc.next();
		occ(str);
	}

}
