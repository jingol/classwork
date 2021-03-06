package dataTypes;

import java.util.Scanner;

public class StringPractice {
	static String user;
	static Scanner input;
	static boolean inLoop;
	static String response;
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
		inLoop = true;
		print("Greetings, " + user + ". How are you?");
		while(inLoop) {
			response = getInput();
			if (response.indexOf("good") >= 0) {
				print("I'm so happy you're good.");
			}
			else {
				print("I'm sorry, I don't understand you.");
			}
		}
	}
	public static String getInput() {
		return input.nextLine();
	}
	public static void print(String s) {
		// create a multi-line string
		String printString = "";
		int cutoff = 35;
		// check to see if there are words to add
		while (s.length() > 0) {
			String currentLine = "";
			String nextWord = "";
			while (currentLine.length() + nextWord.length() <= cutoff && s.length() > 0) {
				currentLine += nextWord;
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if (endOfWord == -1) {
					endOfWord = s.length() - 1;
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}
		System.out.println(printString);
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
