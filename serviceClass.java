package com.stockers.service;

import java.util.Scanner;

public class serviceClass {
	

		public void companyStock( double CompCount , double currentStock[] , int oper , int c , int d ) {
			double temp=0;
			switch (oper) {
			case 1:
				// accessing array elements using the for loop
				for (int i = 0; i <= CompCount; i++) {
					for (int j = i + 1; j <= CompCount; j++) {
						if (currentStock[i] > currentStock[j]) {
							temp = currentStock[i];
							currentStock[i] = currentStock[j];
							currentStock[j] = temp;
						}
					}
				}
				System.out.println("Company stock prices in ascending order are: ");
				for (int i = 0; i <= CompCount; i++) {
					System.out.print(currentStock[i] + " ");
				}
				break;
			case 2:
				// Sort the array in descending order
				for (int i = 0; i <= CompCount; i++) {
					for (int j = i + 1; j <= CompCount; j++) {
						if (currentStock[i] < currentStock[j]) {
							temp = currentStock[i];
							currentStock[i] = currentStock[j];
							currentStock[j] = temp;
						}
					}
				}
				// Displaying elements of array after sorting
				System.out.println("Elements of array sorted in descending order: ");
				for (int i = 0; i < CompCount; i++) {
					System.out.print(currentStock[i] + " ");
				}
				break;
			case 3:
				System.out.println("Total no of Companies for which stock prices rose today are: " + c);
				break;
			case 4:
				System.out.println("Total no of companies for which stock prices declined today are: " + d);
				break;
			case 5:
				System.out.println("Enter the value: ");
				Scanner sc = new Scanner(System.in);
				double newValue = sc.nextDouble();
				int n = 0;
				for (int i = 0; i < currentStock.length; i++) {
					if (currentStock[i] == newValue) {
						System.out.println("Stock of value " + currentStock[i] + " is present");
						n++;
					}
				}
				if (n == 0) {
					System.out.println("Value not found");
				}

				break;

			case 6:
				System.out.println("Exited successfully ");
				break;

			}

		}

}
