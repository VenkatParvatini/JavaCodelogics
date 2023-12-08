package practiceJavaCodes;

public class AddNumbersinInt {

	public static int[] additionofint(int num) {

		int addition1 = 0;
		int addition2 = 0;
		int[] addition = new int[2];
		while (num != 0) {
			addition1 = addition1 + num % 10;
			num = num / 10;
		}
		addition[0] = addition1;
		while (addition1 > 9 || addition1 > 0) {
			addition2 = addition2 + addition1 % 10;
			addition1 = addition1 / 10;
		}

		addition[1] = addition2;

		return addition;
	}

	public static void main(String[] args) {
		int[] addition = additionofint(12345);
		System.out.println(addition[0]);
		System.out.println(addition[1]);
	}

}
