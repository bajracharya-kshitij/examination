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
		
		int averageMarks = total/3;
		System.out.println(String.format("Average marks = %d", averageMarks));
	}
	
}
