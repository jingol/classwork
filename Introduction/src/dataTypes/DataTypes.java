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
		// casts double on an integer so both sides take up the same amt of space
		double d1 = 4.64;
		double d2 = 2.0;
		double d3 = 2.64;
		
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3); 
		System.out.println("d1 - d2 : " + (d1 - d2));
		
//		String s = 1;
//		System.out.println(s);
//		type should be int
//		String s = (String)1;
//		System.out.println(s);
//		cannot cast string on int
//		String s = "1";
//		System.out.println(s);
//		String s = ""+1;
//		System.out.println(s);
//		String s = "Happy "+18+"th birthday!";
//		System.out.println(s);
//		String s = "Happy 18th birthday!";
//		System.out.println(s);
//		String s = "Happy "+54/3+"th birthday!";
//		System.out.println(s);
//		String s = "Happy "+(54/3)+"th birthday!";
//		System.out.println(s);
//		int m = 22;
//		int n = 7;
//		System.out.println("m/n is "+(m/n));
		int m = 22;
		int n = 7;
		System.out.println("m/n is "+((double)m/n));
		
		String k = "10";
		String t = "2";
		if (k.compareTo(t) > 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("ok");
		}
	}
}
