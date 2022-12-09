/*
 * Copyright (c) 2022. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch01_gz01_random_guess;

import javax.swing.*;

/**
 * The type Random guess.
 */
/*
Project:           Java9E
Module:         Chapter_01
Package:        ch01_gz01_random_guess
File:               RandomGuess
Created By:   Kimberly Henry
Created On:  Monday, 05-Dec-2022
*/
public class RandomGuess
	{
		/**
		 * The entry point of application.
		 *
		 * @param args the input arguments
		 */
		public static void main(String[] args)
			{
				JOptionPane.showMessageDialog(null, "Think of a number between 1 - 10",
					"Guess A Number", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null,"The number is "+ (1 + (int)(Math.random() * 10)),
					"Correct Number", JOptionPane.INFORMATION_MESSAGE);
			}
	}
