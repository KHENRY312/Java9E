/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe07_mile_conversions_interactive;

import java.util.Scanner;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe07_mile_conversions_interactive
File:               MileConversionInteractive
Created By:   Kimberly Henry
Created On:  Sunday, 11-Dec-2022
Convert the MileConversions program to an interactive application. Instead of assigning a value to the miles variable, accept it from
the user as input. Save the revised program as MileConversionsInteractive.java
*/
public class MileConversionInteractive
	{
		public static void main(String[] args)
			{
				Scanner keyboard = new Scanner(System.in);
				final int INCHES_IN_MILE = 63360;
				final int FEET_IN_MILE = 5280;
				final int YARD_IN_MILE = 1760;
				System.out.print("How many miles are you traveling?  ");
				int milesToTravel = keyboard.nextInt();
				int inchesTravel = INCHES_IN_MILE * milesToTravel;
				int feetTravel = FEET_IN_MILE * milesToTravel;
				int yardTravel = YARD_IN_MILE * milesToTravel;
				System.out.println("Traveling " +
					milesToTravel + " miles would be " +
					inchesTravel + " inches or " +
					feetTravel + " feet or " +
					yardTravel + " yards.");
			}
	}
