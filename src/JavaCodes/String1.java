package JavaCodes;

public class String1 {
	
	public static void main(String[] args) {
		String s = "ecnkateeka";
		
		
		for(int i =0; i<s.length();i++)
		{
			int num=1;
			for(int j=i+1;j<s.length();j++)
			{
				
				if(s.charAt(i)==s.charAt(j)){
					
					System.out.print(s.charAt(i));
					num++;
				}
				
				
			}
		}
	}
	
	
	

}
