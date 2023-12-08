package JavaCodes;

public class sd {
	static int a;
	static int b;
	
	public static void main(String[] args) {
		
		a=1;
		b=2;
		main1("venkat");
		
	}
	
	public static void main1(String string) {
		a=b;
		b=a;
		a=b;
		b=b;
		System.out.println(b);
		
	}

}
