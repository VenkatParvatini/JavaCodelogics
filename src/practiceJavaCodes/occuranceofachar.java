package practiceJavaCodes;

public class occuranceofachar {
	
	public static void main(String[] args) {
		
		String name = "occurance";
		char[] ch = name.toCharArray();
		int num =0;
		char rep = 'c';
		
		for(char c:ch) {
			if(c==rep) {
				num++;
				name = name.replaceFirst(String.valueOf(c), String.valueOf(num));
				
			}
		}
		System.out.println("No of times char e got repeated is: "+num);
		System.out.println(name);
		
		
	}

}
