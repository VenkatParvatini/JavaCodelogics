package JavaCodes;

public class ReverseEachWordString {
	
	public static void  ReversewordsString(String str) {
		
	String[] strarr = str.split(" ");
	String reverse = "";
	for(String ch:strarr) {
		for(int i=ch.length()-1;i>=0;i--) {
			reverse = reverse+ch.charAt(i);
		}
		reverse = reverse+" ";
	}
	System.out.println(reverse);
		
	}
	public static void main(String[] args) {
		ReversewordsString("Venkat is good");
	}

}
