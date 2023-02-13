/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe14_dollars;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe14_dollars
File:               Dollars
Created By:   Kimberly Henry
Created On:  Tuesday, 13-Dec-2022
Write a program that calculates and displays the conversion of an entered number of dollars into currency denominations—20s, 10s,
5s, and 1s. Save the program as Dollars.java.
*/
import java.util.Scanner;

public class Dollars
	{
		public static void main(String[] args)
			{
				//variable defined
				Scanner keyboard = new Scanner(System.in);
				final double TWENTY = 20.00;
				final double TEN = 10.00;
				final double FIVE = 5.00;
				final double ONE = 1.00;

				//enter data
				int twenties, tens, fives, ones;
				System.out.print("Enter Dollar Amount:  ");
				double money = keyboard.nextDouble();
				keyboard.nextLine();

				//calculate dollars
				twenties = (int) (money / TWENTY);
				double money1 =  money - (twenties * TWENTY);
				tens = (int)(money1 / TEN);
				double money2 = money1 - (tens * TEN);
				fives = (int)(money2 / FIVE);
				double money3  =  money2 - (fives * FIVE);
				ones = (int)(money3 / ONE);

				//data output
				System.out.println(money + " has " + twenties +
					" twenties, " + tens + " tens, " + fives +
					" fives and " + ones + " ones.");
			}
	}
