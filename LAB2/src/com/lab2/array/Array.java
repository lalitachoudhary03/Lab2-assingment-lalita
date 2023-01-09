package com.lab2.array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the size of array:");
		int size = in.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the Elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}

}
