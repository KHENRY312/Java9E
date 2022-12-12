/*
 * Copyright (c) 2022. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe08_inches_to_feet;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe08_inches_to_feet
File:               InchesToFeet
Created By:   Kimberly Henry
Created On:  Monday, 12-Dec-2022
Write a program that declares a variable named inches, which holds a length in inches, and assign a value. Display the value in feet
and inches; for example, 86 inches becomes 7 feet and 2 inches. Be sure to use a named constant where appropriate. Save the program
as InchesToFeet.java.
*/
public class InchesToFeet
	{
		public static void main(String[] args)
			{
				final int FEET = 12;
				int inchLength = 54;
				int feet = inchLength/FEET;
				int remaining = inchLength%FEET;
				System.out.println(inchLength + " inches becomes " + feet + " feet and " + remaining + " inches.");
			}
	}
