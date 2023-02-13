/*
 * Copyright (c) 2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe15_minutes_conversion;/*
    Project:    Java9E
    Module:     Chapter_02
    Package:    ch02_pe15_minutes_conversion
    Class:      MinutesConversion
    Creator:    Kimberly Henry
    Created:    2/12/2023 9:02 PM
    Write a program that accepts a number of minutes and converts it both to hours and days. For example, 6,000 minutes
    equals 100 hours and equals 4.167 days. Save the program as MinutesConversion.java
*/
import java.util.Scanner;
public class MinutesConversion
	{
	public static void main(String[] args)
		{
			final int HOUR = 60;
			final int DAY = 1440;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Please enter total minutes:  ");
			int minutes = keyboard.nextInt();
			System.out.println();
			int totalHours = minutes / HOUR;
			int totalDays = minutes / DAY;
			System.out.println("There is " + totalHours + " hours in " + minutes + ", with " + minutes % HOUR + " minutes " +
				"remaining" +
				".");
			System.out.println("There is " + totalDays + " days in " + minutes + ", with " + (minutes % DAY) / 60 + " hours and" +
				" " + (minutes % DAY) % 60 + " remaining remaining" +
				".");

		}
	}
