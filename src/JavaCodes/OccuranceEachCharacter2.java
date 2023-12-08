package JavaCodes;

import java.util.*;

public class OccuranceEachCharacter2 {
	
	public static void OccuranceofEachCharacter(String str) {
		int num = 2;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0;i<str.length();i++) {
		
		
		if(!map.containsKey(str.charAt(i))) {
			
			map.put(str.charAt(i), 1);
			
							
		}
		else {
			map.put(str.charAt(i), num);
			num++;
		}
		}
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		OccuranceofEachCharacter("Venkateeee");
	}
	

}
