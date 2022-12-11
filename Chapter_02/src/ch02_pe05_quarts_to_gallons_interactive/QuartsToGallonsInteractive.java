/*
 * Copyright (c) 2022. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe05_quarts_to_gallons_interactive;

import java.util.Scanner;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe05_quarts_to_gallons_interactive
File:               QuartsToGallonsInteractive
Created By:   Kimberly Henry
Created On:  Sunday, 11-Dec-2022
Convert the QuartsToGallons program to an interactive application. Instead of assigning a value to the number of quarts, accept the
value from the user as input. Save the revised program as QuartsToGallonsInteractive.java.
*/
public class QuartsToGallonsInteractive
	{
		public static void main(String[] args)
			{
				Scanner keyboard = new Scanner(System.in);
				final int QUARTS_IN_GALLON = 4;
				System.out.print("How many quarts are required to complete the job?  ");
				int jobQuarts = keyboard.nextInt();
				int jobGallons = jobQuarts/QUARTS_IN_GALLON;
				int quartsRemain = jobQuarts%QUARTS_IN_GALLON;
				System.out.println("A job that requires " + jobQuarts + " quart(s) will need " +
					jobGallons + " gallons and " + quartsRemain + " quart(s).");
			}
	}
