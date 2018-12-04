package com.javaexamples;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.print("Enter marks in English: ");
		int englishMarks = scanner.nextInt();
		
		System.out.print("Enter marks in Computer: ");
		int computerMarks = scanner.nextInt();
		
		System.out.print("Enter marks in Science: ");
		int scienceMarks = scanner.nextInt();
		
		scanner.close();
		System.out.println("Hello " + name);
		System.out.println("Your result:");
		System.out.println(String.format("English %d, Computer %d and Science %d", englishMarks, computerMarks, scienceMarks));
		
		int total = englishMarks + computerMarks + scienceMarks;
		System.out.println("Total marks received = " + total);
		
		float averageMarks = (float) total/3;
		System.out.println(String.format("Average marks = %f", averageMarks));
		
		//if total marks greater than or equal to 120, result = passed else failed
		if(total >= 120) {
			System.out.println("Congratulations! You've passed");
		} else {
			System.out.println("Sorry, you've failed");
		}
		
		/*
		 * if average marks greater or equal to 80, distinction
		 * else if average marks greater or equal to 60 and less than 80, first division
		 * else if average marks greater or equal to 40 and less than 60, second division
		 * else no division, failed
		 * */
		if(averageMarks >= 80) {
			System.out.println("Excellent! You've attained Distinction");
		} else if(averageMarks >= 60) {
			System.out.println("Good! You've attained First Division");
		} else if(averageMarks >= 40) {
			System.out.println("Fair! You've attained Second Division");
		} else {
			System.out.println("Poor! You've attained no division because you failed");
		}
		
	}
	
}
