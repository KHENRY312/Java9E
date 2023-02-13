/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_ydi06_arithmetic_demo;

import java.util.Scanner;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_ydi06_arithmetic_demo
File:               ArithmeticDemo
Created By:   Kimberly Henry
Created On:  Friday, 09-Dec-2022
*/
public class ArithmeticDemo
	{
		public static void main(String[] args)
			{
				int firstNumber;
				int secondNumber;
				int sum;
				int difference;
				int average;
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Please enter an integer >> ");
				firstNumber = keyboard.nextInt();
				System.out.print("Please enter another integer >> ");
				secondNumber = keyboard.nextInt();
				sum = firstNumber + secondNumber;
				difference = firstNumber - secondNumber;
				average = sum / 2;
				System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
				System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
				System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
			}
	}
