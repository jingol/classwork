package dataTypes;

import java.util.Random;
public class MathRandom {

	public MathRandom() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] results = new int[6];
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls; index++) {
			int roll = rollUnfairDie();
//			System.out.println("Roll #" + (index + 1) + " Die is " + roll);
			results[roll-1]++;
		}
		for (int i= 0; i < 6; i++) {
			int percentage = (int) Math.round((100*((double)results[i]/totalRolls)));
			System.out.println((i+1) + " was rolled " + percentage + "%.");
		}
	}
	public static int rollFairDie() {
//		Random gen = new Random();
//		return gen.nextInt(6) + 1;
		double rand = Math.random(); // creates a random double (0,1)
		int roll = (int) (6 * rand); //max value [0,5]
		return roll+1; //0 becomes 1, 5 becomes 6
	}
	public static int rollUnfairDie() {
		double rand = Math.random();
		int roll = (int) (6 * rand) + 1;
		int num = (int) (10 * Math.random()) + 1;
		if (roll < 6 && roll > 4 && num < 5) {
			return roll + 1;
		}
		else {
			return roll;
		}
	}
//	public static String pickCard() {
//		Suits[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
//		Ranks[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
//	}
}
