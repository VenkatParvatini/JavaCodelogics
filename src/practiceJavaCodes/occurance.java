package practiceJavaCodes;

import java.util.HashMap;
import java.util.Map;

public class occurance {
	public static void main(String[] args) {

		String str = "occurance";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(str.charAt(i), 1);
			}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			
		}
		System.out.println(map);
	}
}
