/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_ydi02_integer_demo;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_ydi02_integer_demo
File:               IntegerDemo
Created By:   Kimberly Henry
Created On:  Thursday, 08-Dec-2022
*/
public class IntegerDemo
	{
		public static void main(String[] args)
			{
				int anInt = 1234;
				byte aByte = 12;
				short aShort = 12345;
				long aLong = 1234567890987654321L;
				System.out.println("The int is " + anInt + ".");
				System.out.println("The byte is " + aByte + ".");
				System.out.println("The short is " + aShort + ".");
				System.out.println("The long is " + aLong + ".");
				int anotherInt = anInt * 10000000;
				System.out.println("Another int is " + anotherInt);
			}
	}
