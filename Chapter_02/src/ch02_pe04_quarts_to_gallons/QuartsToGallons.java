/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe04_quarts_to_gallons;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe04_quarts_to_gallons
File:               QuartsToGallons
Created By:   Kimberly Henry
Created On:  Sunday, 11-Dec-2022
Write a program that declares a named constant to hold the number of quarts in a gallon (4). Also declare a variable to represent the
number of quarts needed for a painting job, and assign an appropriate value—for example, 18. Compute and display the number of
gallons and quarts needed for the job. Display explanatory text with the values—for example, A job that needs 18 quarts requires 4
gallons plus 2 quarts. Save the program as QuartsToGallons.java.
*/
public class QuartsToGallons
	{
		public static void main(String[] args)
			{
				final int QUARTS_IN_GALLON = 4;
				int jobQuarts = 37;
				int jobGallons = jobQuarts/QUARTS_IN_GALLON;
				int quartsRemain = jobQuarts%QUARTS_IN_GALLON;
				System.out.println("A job that requires " + jobQuarts + " quart(s) will need " +
					jobGallons + " gallons and " + quartsRemain + " quart(s).");
			}
	}
