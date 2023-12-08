package JavaCodes;
import static java.lang.System.*;

public class divisionwithoutusingoperator {
	
	public static void main(String[] args) {
		int a =10;
		int b =5;
		int q = 0;
		while(a>=b) {
			a=a-b;
			q++;
		}
		
		out.println(q);
	}

}
