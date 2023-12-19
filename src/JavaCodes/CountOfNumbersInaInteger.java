package JavaCodes;

public class CountOfNumbersInaInteger {
	
	public static void numberscount(String str) {
		
		int num = Integer.valueOf(str);
		int sum =0;
		while(num>0) {
			sum =sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
		int totalofsum =0;
		while(sum>9||sum>0) {
			totalofsum += sum%10;
			sum=sum/10;
		}
		System.out.println(totalofsum);
	}
	
	public static void main(String[] args) {
		//numberscount("12345");
		
		String s = "12345";
		
		
		int sum = s.chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
	
	}

}
