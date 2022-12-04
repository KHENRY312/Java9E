/*
 * Copyright (c) 2022. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch01_pe09_triangle;

import javax.swing.*;

/*
Project:       Java9E
Module:      Chapter_01
Package:     ch01_pe09_triangle
File:            Triangle
Created By: Kimberly Henry
Created On: Sunday, 04-Dec-2022
*/public class Triangle
	{
		public static void main(String[] args)
			{
				JOptionPane.showMessageDialog (null, """
                                               *
                                            * *  *
                                         * *  *  *  *
                                        * * * * * * * *
                                      * * * * * * * * * *
                                    * * * * * * * * * * * *\s
                                  * * * * * * * * * * * *  *""",
					"TRIANGLE",
					JOptionPane.PLAIN_MESSAGE);
			}
	}
