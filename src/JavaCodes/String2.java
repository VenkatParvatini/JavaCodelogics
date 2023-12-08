package JavaCodes;

import java.util.HashMap;
import java.util.Map;

public class String2 {
	public static void main(String[] args) {
		OccuranceofString("Venkatee");
		
	}
	
	public static void OccuranceofString(String str) {
		int num =1;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
			
		}
		for(char key:map.keySet()){
			if(map.get(key)>1)
			System.out.println(key+": "+map.get(key));
		}
		
		
		
	}
}
