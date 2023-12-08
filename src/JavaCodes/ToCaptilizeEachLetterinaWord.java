package JavaCodes;

public class ToCaptilizeEachLetterinaWord {
	
	public static void ToCaptilizeEachLetterinaWords(String str) {
		String[] strarray = str.split(" ");
		String capitalString = "";
		for(String s:strarray ) {
			char s1=s.charAt(0);
			char s2 = Character.toUpperCase(s1);
			s=s.replace(s1, s2);
			capitalString += s+" ";
		}
		System.out.println(capitalString);
	}
	public static void main(String[] arg) {
		String str = "venkat is good boy";
		ToCaptilizeEachLetterinaWords(str);
	}

}
