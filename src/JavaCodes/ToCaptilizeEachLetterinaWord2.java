package JavaCodes;

public class ToCaptilizeEachLetterinaWord2 {
	
	public static void ToCaptilizeEachLetterinaWords(String str) {
		String[] strarr = str.split(" ");
		String capital = "";
		for(String s:strarr) {
			char s1 = s.charAt(0);
			char s2 = Character.toUpperCase(s1);
			s=s.replace(s1, s2);
			capital += s+" ";
		}
//		capital += capital+" ";
		System.out.println(capital);
		
	}
	public static void main(String[] arg) {
		String str = "venkat is good boy";
		ToCaptilizeEachLetterinaWords(str);
	}

}
