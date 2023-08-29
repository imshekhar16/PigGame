package com.aurionpro.test;

import java.util.Scanner;

public class PigGame {
	public static void main(String[] args) {
		playPigGame();

	}

	public static void playPigGame() {

		int totalScore = 0;
		int turnScore = 0;
		int turn = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Let's Play PIG!");

		while (totalScore < 20) {
			System.out.println("\nTURN " + turn);

			while (true) {
				System.out.print("Roll or hold? (r/h): ");
				char choice = sc.nextLine().charAt(0);

				if (choice == 'r') {
					int roll = rollDie();
					if (roll == 1) {
						System.out.println("Die= 1: Turn over, no score.");
						turnScore = 0;
					} else {
						turnScore += roll;
						System.out.println("Die: " + roll);

					}
				} else if (choice == 'h') {
					totalScore += turnScore;
					System.out.println("Score for turn: " + turnScore);

					System.out.println("Total score: " + totalScore);
					turnScore = 0;
					break;
				} else {
					System.out.println("Invalid input. Please enter 'r' or 'h'.");
				}
			}

			turn++;
		}

		System.out.println("\nYou finished in " + (turn - 1) + " turns!\nGame over!");
	}

	public static int rollDie() {
		return (int) (Math.random() * 6) + 1;

	}

}

