package com.lab2.array;

import java.util.Scanner;

public class ArrayDemoDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many days you want to keep track/ enter the size of transaction array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the daily transactions array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the totl number of targets that needs to be achieved");
		int targetNumber = in.nextInt();
		while (targetNumber-- != 0) {
			int flag = 0;
			long targetValue;
			long sum = 0;
			System.out.println("Enter the Value of your target");
			targetValue = in.nextLong();
			//linear iteration
			for (int i = 0; i < size; i++) {
				sum = sum + arr[i];
				if (sum >= targetValue) {
					System.out.println("Target value achieved after " + (i + 1) + "transactions..");
					flag = 1;
					break;	
				}
				}
		if (flag == 0) {
			System.out.println("Given Target Amount is not achieved");
			}
		}
	}
}

		
		
	

	

