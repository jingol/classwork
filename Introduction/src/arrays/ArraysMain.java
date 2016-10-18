package arrays;

public class ArraysMain {
	public static void main(String[] args) {
		// how to time
		long startTime = System.currentTimeMillis();
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has a number equal to " + sample.getNumber());
		// passByValueDemonstration();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " millesecond(s)");
		//printIntArray(populateArray());
		//printIntArray(randomArray());
		//printIntArray(populateByDice());
		print(deckOfCards());
	}
	
	private static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	private static void passByValueDemonstration() {
		String[] someStrings = new String[100];
		populateArray(someStrings);
		// changeString(someStrings[99]) - we are passing in an ELEMENT so there is no change being made
		changeString(someStrings[99]);
		changeArray(someStrings);
		changeArrayElement(someStrings,99);
		printArray(someStrings);
	}
	private static void changeArrayElement(String[] a, int i) {
		a[i] = "new item " + (i + 1);
	}
	private static void changeArray(String[] a) {
		a = new String[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = "new item " + (i+1);
		}
	}
	private static void changeString(String s) {
		s = "This string has been changed";
	}
	private static void printArray(String[] a) {
		for (String s: a) {
			System.out.println(s);
		}
	}
	private static void populateArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = "value " + (i + 1);
		}
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
		for (int i = 0; i < strings2.length; i++) {
			strings2[i] = "value " + (i + 1);
		}
		for (String s: strings2) {
			System.out.println(s);
		}
	}
	
	public static int[] populateArray() {
		int[] upToFifty = new int[50];
		for (int i = 0; i < upToFifty.length; i++) {
			upToFifty[i] = i+1;
		}
		return upToFifty;
	}
	public static int[] randomArray() {
		int ranLength = (int) (Math.random() * 10);
		if (ranLength <= 2) {
			ranLength += 2;
		}
		int[] ranArray = new int[ranLength];
		for (int i = 0; i < ranArray.length; i++) {
			int num = (int)(Math.random() * 100);
			ranArray[i] = num;
		}
		return ranArray;
	}
	public static int[] populateByDice() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			int die1 = (int)((Math.random() * 6) + 1);
			int die2 = (int)((Math.random() * 6) + 1);
			int total = die1 + die2;
			array[i] = total;
		}
		return array;
	}
	public static String[] deckOfCards() {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] deck = new String[52];
		int i = 0;
		for (int a = 0; a < suits.length; a++) {
			for (int x = 0; x < ranks.length; x++) {
				String card = ranks[x] + " of " + suits[a];
				deck[i] = card;
				i++;
			}
		}
		return deck;
	}
	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
