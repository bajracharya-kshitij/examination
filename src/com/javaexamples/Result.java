package com.javaexamples;

import java.util.Scanner;

import com.javaexamples.model.Subject;

public class Result {
	
	public static int total = 0;
	public static int numberOfSubjects = 0;

	public static void main(String[] args) {
		Subject[] subjects = getSubjects();
		displayMarks(subjects);
		calculateResult();
	}
	
	public static Subject[] getSubjects() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of subjects: ");
		numberOfSubjects = scanner.nextInt();
		scanner.nextLine();
		
		Subject[] subjectsList = new Subject[numberOfSubjects];
		for(int i=0; i<=numberOfSubjects-1; i++) {
			System.out.print("Enter name for subject: ");
			String subjectName = scanner.nextLine();
			
			System.out.print("Enter marks for subject: ");
			int marks = scanner.nextInt();
			scanner.nextLine();
			
			Subject subject = new Subject();
			subject.setName(subjectName);
			subject.setMarks(marks);
			subjectsList[i] = subject;
		}
		scanner.close();
		
		return subjectsList;
	}
	
	public static void displayMarks(Subject[] subjects) {
		System.out.println("Your result:");
		
		for(Subject subject : subjects) {
			System.out.println(String.format("Marks for subject %s = %d", subject.getName(), subject.getMarks()));
			total += subject.getMarks();
		}
		
		System.out.println("Total marks received = " + total);
	}
	
	public static void calculateResult() {
		float averageMarks = (float) total/numberOfSubjects;
		System.out.println(String.format("Average marks = %f", averageMarks));
		
		//if total marks greater than or equal to 40%, result = passed else failed
		if(total >= 40*numberOfSubjects) {
			System.out.println("Congratulations! You've passed");
		} else {
			System.out.println("Sorry, you've failed");
		}
		displayDivision(averageMarks);
	}
	
	public static void displayDivision(float avgMarks) {
		/*
		 * if average marks greater or equal to 80, distinction
		 * else if average marks greater or equal to 60 and less than 80, first division
		 * else if average marks greater or equal to 40 and less than 60, second division
		 * else no division, failed
		 * */
		if(avgMarks >= 80) {
			System.out.println("Excellent! You've attained Distinction");
		} else if(avgMarks >= 60) {
			System.out.println("Good! You've attained First Division");
		} else if(avgMarks >= 40) {
			System.out.println("Fair! You've attained Second Division");
		} else {
			System.out.println("Poor! You've attained no division because you failed");
		}
	}
	
}
