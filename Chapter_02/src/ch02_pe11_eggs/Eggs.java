/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe11_eggs;

import javax.swing.*;

/*
Project:           Java9E
Module:         Chapter_02
Package:        ch02_pe11_eggs
File:               Eggs
Created By:   Kimberly Henry
Created On:  Tuesday, 13-Dec-2022
*/
public class Eggs
	{
		public static void main(String[] args)
			{
				//Variables required
				final double DOZEN_COST = 3.25;
				final double SINGLE_COST = 0.45;
				final int DOZEN = 12;

				//User input
				int eggsOrdered = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total eggs " +
						"ordered:  ", "EGGS ORDERED",
					JOptionPane.QUESTION_MESSAGE ));

				//Calculations of cost
				int dozensOrdered =  eggsOrdered / DOZEN;
				int singlesOrdered = eggsOrdered % DOZEN;
				double costDozen = dozensOrdered * DOZEN_COST;
				double costSingles = singlesOrdered * SINGLE_COST;
				double totalOrder = costDozen + costSingles;

				//Order details for user.
				JOptionPane.showMessageDialog(null, "Your order of " + eggsOrdered + " eggs will come to " +
						"" + dozensOrdered + " dozens and " + singlesOrdered + " singles. \n" +
						" At the cost of " + DOZEN_COST + " per dozen and " + SINGLE_COST + " cents per single egg,  \n" +
						" your order will cost " + costDozen + " for the dozens and " + costSingles + ".\n" +
						" The total cost will be " + totalOrder + ".",
					" TOTAL ORDER", JOptionPane.INFORMATION_MESSAGE);
			}
	}
