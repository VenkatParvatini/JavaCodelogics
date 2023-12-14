package JavaCodes;

public class basic {
	
	 int y=10;  //instance variable or global variable
	 static int z =20;
	
	public static void main(String[] args) {
		
		int x =10;  //local variable
		System.out.println(x);
		System.out.println(z);
		
		basic venkat = new basic();
		System.out.println(venkat.y);
		venkat.method1();
		method2();
		
	}
	
	void method1() {  //instance or non static method
		int a =50;
		System.out.println(a);
	}
	
	static void method2() {
		int b =60;
		System.out.println(b);
	}

}
