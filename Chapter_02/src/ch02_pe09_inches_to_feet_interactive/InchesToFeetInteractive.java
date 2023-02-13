/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe09_inches_to_feet_interactive;

import java.util.Scanner;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe09_inches_to_feet_interactive
File:               InchesToFeetInteractive
Created By:   Kimberly Henry
Created On:  Monday, 12-Dec-2022
*/
public class InchesToFeetInteractive
	{
		public static void main(String[] args)
			{
				final int FEET = 12;
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Please enter a value of inches.  ");
				int inchLength = keyboard.nextInt();
				int feet = inchLength/FEET;
				int remaining = inchLength%FEET;
				System.out.println(inchLength + " inches becomes " + feet + " feet and " + remaining + " inches.");
			}
	}
