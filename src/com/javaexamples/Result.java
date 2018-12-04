package com.javaexamples;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.print("Enter number of subjects: ");
		int numberOfSubjects = scanner.nextInt();
		
		int total = 0;
		for(int i=0; i<=numberOfSubjects-1; i++) {
			System.out.print("Enter marks for subject: ");
			int marks = scanner.nextInt();
			total += marks;
		}
		
		scanner.close();
		
		System.out.println("Total marks received = " + total);
		
		float averageMarks = (float) total/numberOfSubjects;
		System.out.println(String.format("Average marks = %f", averageMarks));
		
		//if total marks greater than or equal to 120, result = passed else failed
		if(total >= 40*numberOfSubjects) {
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
