package practiceJavaCodes;

public class StringReverse1 {
	
	public static String reverseStr() {
		
		
		String name = "venkat";
		String name1="";
		
		for(int i=name.length()-1;i>=0;i--) {
			name1 += name.charAt(i);
		}
		return name1;
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverseStr());
	}

}
