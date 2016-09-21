package dataTypes;

public class StringPractice {

	public static void main(String[] args) {
//		String text = new String("Hello World");
		String text1 = "Hello World"; //shortcut for creating strings, no need for constructor
		String text2 = "Hello ";
		String text3 = "World";
		
		if (text1.equals(text2 + text3)) {
			System.out.println("These strings are equal.");
		}
		else {
			System.out.println(text1);
			System.out.println(text2 + text3);
		}
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if (word1.compareTo(word2) < 0) {
			System.out.println("word1 is before word2, lexicographically");
		}
	}

}
