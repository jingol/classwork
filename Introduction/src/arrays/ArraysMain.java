package arrays;

public class ArraysMain {
	public static void main(String[] args) {
		// how to time
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " millesecond(s)");
	}
	public static void arrayIntroMethod() {
		// an array is not an object
		// primitive type arrays fill with zeroes (0, 0.0, or false)
		int[] zeroes1 = {0,0,0};
		int[] zeroes2 = new int[3];
		// these arrays do the same thing
		
		boolean[] booleans = new boolean[3]; 
		
		for (int i = 0; i < booleans.length; i++) {
			System.out.println(i + ". " + booleans[i]);
		}
		// use this for loop if the index of the data is important to reference, you need to customize
		// how you iterate (by 2s, backwards, etc)
		
		for(boolean b: booleans) {
			// boolean b: is a declaration
			System.out.println(b);
		}
		// always goes in order, does not keep track of index, but EASIER to type
		
		String[] strings1 = {"", "", ""};
		String[] strings2 = new String[3];
		// these DO NOT do the same thing
		for (String s: strings1) {
			System.out.println(s);
		}
		for (String s: strings2) {
			System.out.println(s);
		}
	}
}
