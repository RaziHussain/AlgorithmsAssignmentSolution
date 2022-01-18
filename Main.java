package com.stockers.service;

import java.util.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double CompCount;
		boolean StockComp = false; 
		int c=0;
		int d=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of companies: ");
		CompCount = sc.nextDouble();
		double[] currentStock = new double[10];
		for (int i = 1; i <= CompCount; i++) {
			System.out.println("Enter current stock price of the company " + i + ":");
			currentStock[i] = sc.nextDouble();

			System.out.println("Whether company's stock price rose today compare to yesterday? \nTrue or False");
			StockComp = sc.nextBoolean();
			if (StockComp == true) {
				c++;
			} else {
				d++;
			}
		}

		System.out.println("Enter the operation that you want to perform: ");
		System.out.println("1. Display the companies stock prices in ascending order ");
		System.out.println("2. Display the companies stock prices in descending order ");
		System.out.println("3. Display the total no of companies for which stock prices rose today ");
		System.out.println("4. Display the total no of companies for which stock prices declined today ");
		System.out.println("5. Search a specific stock price ");
		System.out.println("6. press 6 to exit ");
		int oper = sc.nextInt();
		
		        serviceClass sd = new serviceClass();
				sd.companyStock(CompCount, currentStock, oper, c, d);
	}
}
