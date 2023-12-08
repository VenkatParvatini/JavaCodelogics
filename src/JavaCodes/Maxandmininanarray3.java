package JavaCodes;

import java.util.*;

public class Maxandmininanarray3 {

	private static void maxmin(int[] num) {

		int largest = num[0];
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {

			if (largest < num[i]) { 
				largest = num[i]; 
			}
			else if(smallest>num[i]) {
				smallest = num[i];      
			}
		}
		System.out.println("The largest number is: " + largest + " and the smallest number is: " + smallest);

	}

	public static void main(String[] args) {
		int[] a = { 6, 1, 2, 3, 4, 5 };

		maxmin(a);
	}
}
