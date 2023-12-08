package JavaCodes;

public class Addunderscoreaftereachchar {
	
	public static void method(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+"_");
			
		}
//		System.out.println(str);
		
		
		
	}
	public static void main(String[] args) {
		method("venkat");
	}

}
