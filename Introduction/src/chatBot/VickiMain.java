package chatBot;

import java.util.Scanner;

public class VickiMain {
	static String user;
	static Scanner input;
	static boolean inLoop;
	static String response;
	static Topic school;
	public static void main(String[] args) {
		createTopics();
		// demonstrateStringMethods();
		promptName();
		talkForever();
	}
	private static void promptName() {
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
			if (findKeyword(response, "good", 0)) {
				print("I'm so happy you're good.");
			}
			else if (response.indexOf("school") >= 0) {
				inLoop = false;
				school.talk();
			}
			else {
				print("I'm sorry, I don't understand you.");		
			}
		}
	}
	public static boolean findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim();
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		int psn = phrase.indexOf(key);
		while (psn >= 0) {
			String before = " ";
			String after = " ";
			if (psn + key.length() < phrase.length()) {
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
			}
			if (psn > 0) {
			before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (before.compareTo("a") < 0 && after.compareTo("a") < 0) {
				return true;
			}
			psn = phrase.indexOf(key, psn+1);
		}
		return false;
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
	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
	}
}
