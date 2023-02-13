/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe06_mile_conversions;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe06_mile_conversions
File:               MileConversions
Created By:   Kimberly Henry
Created On:  Sunday, 11-Dec-2022
Write a program that declares named constants to represent the number of inches, feet, and yards in a mile. Also declare a variable to
 represent a number of miles and assign a value to it. Compute and display, with explanatory text, the value in inches, feet, and yards.
 Save the program as MileConversions.java.
*/
public class MileConversions
	{
		public static void main(String[] args)
			{
				final int INCHES_IN_MILE = 63360;
            final int FEET_IN_MILE = 5280;
            final int YARD_IN_MILE = 1760;
				int milesToTravel = 157;
				int inchesTravel = INCHES_IN_MILE * milesToTravel;
				int feetTravel = FEET_IN_MILE * milesToTravel;
				int yardTravel = YARD_IN_MILE * milesToTravel;
				System.out.println("Traveling " + milesToTravel + " miles would be " +
					inchesTravel + " inches or " +
					feetTravel + " feet or " +
					yardTravel + " yards.");
			}
	}
