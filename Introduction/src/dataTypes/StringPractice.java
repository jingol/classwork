package dataTypes;

import java.util.Scanner;

public class StringPractice {
	static String user;
	static int lineCount = 0;
	static Scanner input;
	public static void main(String[] args) {
		createAScanner();
		// demonstrateStringMethods();
		promptname();
		talkForever();
	}
	private static void promptname() {
		print("Hello, human. I am a board covered with semiconductors and other such components"
				+ ". What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you user " + user + " until you terminate me.");
	}
	public static void talkForever() {
		while(true) {
			promptInput();
		}
	}
	public static void print(String s) {
		lineCount++;
		System.out.println("Line #" + lineCount + ": " +s);
	}
	public static void promptInput() {
		print(user + ", try inputing a string");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	public static void createAScanner() {
		input = new Scanner(System.in);
	}
	public static void demonstrateStringMethods() {
		// String text = new String("Hello World");
		String text1 = "Hello World"; //shortcut for creating strings, no need for constructor
		String text2 = "Hello ";
		String text3 = "World";
		
		if (text1.equals(text2 + text3)) {
			print("These strings are equal.");
		}
		else {
			print(text1);
			print(text2 + text3);
		}
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if (word1.compareTo(word2) < 0) {
			print("word1 comes before word2, lexicographically");
		}
	}

}
