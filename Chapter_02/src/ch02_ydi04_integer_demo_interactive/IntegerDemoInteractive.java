/*
 * Copyright (c) 2022. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_ydi04_integer_demo_interactive;

import java.util.Scanner;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_ydi04_integer_demo_interactive
File:               IntegerDemoInteractive
Created By:   Kimberly Henry
Created On:  Friday, 09-Dec-2022
*/
public class IntegerDemoInteractive
	{
		public static void main(String[] args)
			{
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Please enter an integer >>  ");
				int anInt = keyboard.nextInt();
				System.out.print("Please enter a byte integer >>  ");
				byte aByte = keyboard.nextByte();
				System.out.print("Please enter a short integer >>  ");
				short aShort = keyboard.nextShort();
				System.out.print("Please enter a long integer >> ");
				long aLong = keyboard.nextLong();
				System.out.println("The int is " + anInt + ".");
				System.out.println("The byte is " + aByte + ".");
				System.out.println("The short is " + aShort + ".");
				System.out.println("The long is " + aLong + ".");
				int anotherInt =  anInt * 1000000;
				System.out.println("anotherInt is " + anotherInt + ".");
			}
	}
