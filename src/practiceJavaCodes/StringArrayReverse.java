package practiceJavaCodes;

public class StringArrayReverse {

	public static void straryreverse(String str) {

		String[] strarr = str.split(" ");
		String reverse = "";
		for (String ch : strarr) {
			for (int i = ch.length() - 1; i >= 0; i--) {
				reverse += ch.charAt(i);
			}
			reverse +=" ";
		}

		System.out.println(reverse);

	}

	public static void main(String[] args) {
		straryreverse("Venkat Parvatini");
	}

}
