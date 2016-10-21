package arrays;

import java.util.Scanner;

public class Login {
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry() {
		return input.nextLine();
	}
	// 1 point for "private" or inaccessible
	// 1 point for declaration of data type (String)
	// 1 point correct method header
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main (String[] args) {
		// 1 point for only entering username once
		if(correctUser()) {
			askPassword();
		}
		else {
			System.out.println("Unknown username, please contact network administrator");
		}
	}

	public static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		// 1 point for using a loop
		while (inLoop) {
			System.out.println("Enter your password");
			// 1 point for waitForEntry
			String entry = waitForEntry();
			if (entry.equals(password)) {
				System.out.println("You are in!");
				inLoop = false;
			}
			else {
				remainingTries--;
				// 0.5 point for three tries max
				// 0.5 point for saying invalid password after three tries
				if (remainingTries == 0) {
					System.out.println("Invalid password.");
					inLoop = false;
				}
				else {
					// 0.5 point for printing a changing number
					// 0.5 point for a correct number
					System.out.println("Incorrect password. You have " + remainingTries + " attempts remaining");
				}
			}
		}
	}

	public static boolean correctUser() {
		// 1 point for comparing strings
		System.out.println("Enter username");
		if (waitForEntry().equals(username)) {
			return true;
		}
		return false;
	}
}
