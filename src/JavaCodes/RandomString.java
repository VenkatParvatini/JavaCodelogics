package JavaCodes;

public class RandomString {

	public static void randomString(String one, String two) {

		StringBuffer sb = new StringBuffer(two);

		for (int i = 0; i < one.length(); i++) {

			sb.insert(i * 2, one.charAt(i));
		}
		System.out.println(sb);

	}

	public static void main(String[] args) {
		randomString("abcd", "1234567");
	}

}
