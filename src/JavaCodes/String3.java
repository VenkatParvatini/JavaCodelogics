package JavaCodes;

import java.util.HashMap;
import java.util.Map;

public class String3 {
	
	public static void main(String[] args) {
		occuranceofcharinastring("weelcomeee");
	}
	
	public static void occuranceofcharinastring(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		for(char c:map.keySet()){
			if(map.get(c)>1) {
				System.out.println(c+":"+map.get(c));
			}
		}
	}
}
