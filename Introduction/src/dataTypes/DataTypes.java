package dataTypes;

public class DataTypes {
	
	public static void main(String[] args) {
		System.out.println(5.0/2);
		// double divided by int
		System.out.println((double)5/2);
		// casting -- taking the 5 and making it into a double
		System.out.println(5/2);
		// without double, it returns as an integer by truncating the double
		System.out.println(3+5.0/2+5*2);
		System.out.println(3.0+5/2+5*2);
		// changed the answer because 5/2 will return 2 instead of 2.5
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		// makes into the nearest integer after the numbers are done calculating
		if(42 == 42.0) {
			System.out.println("42 equals 42.0");
		}
	}
}
