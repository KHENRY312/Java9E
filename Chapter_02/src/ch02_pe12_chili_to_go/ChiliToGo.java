/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe12_chili_to_go;

import javax.swing.*;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe12_chili_to_go
File:               ChiliToGo
Created By:   Kimberly Henry
Created On:  Tuesday, 13-Dec-2022
*/
public class ChiliToGo
	{
				public static void main(String[] args)
				{
					//Cost of meals, never changes.
					final double ADULT_MEAL = 7.00;
					final double CHILD_MEAL = 4.00;

					//Meals ordered, input required.
					int adultOrder = Integer.parseInt(JOptionPane.showInputDialog(null,
						"How many Adult Meals would you like?  ", "ADULT MEALS",
						JOptionPane.QUESTION_MESSAGE));
					int childOrder = Integer.parseInt(JOptionPane.showInputDialog(null,
						"How many Child's Meals would you like?  ", "CHILD MEALS",
						JOptionPane.QUESTION_MESSAGE));

					//Calculations of each meal.
					double adultPrice = adultOrder * ADULT_MEAL;
					double childPrice = childOrder * CHILD_MEAL;
					double totalOrder = adultPrice + childPrice;

					//Display order total and calculations
					JOptionPane.showMessageDialog(null, "Total Adult Order " + adultPrice + "." +
							"\nTotal Child's Orders " + childPrice + "." +
							"\nTotal Order Cost " + totalOrder + ".",
						"TOTAL ORDERS",
						JOptionPane.INFORMATION_MESSAGE);
			}
	}
