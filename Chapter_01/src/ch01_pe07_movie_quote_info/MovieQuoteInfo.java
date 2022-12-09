/*
 * Copyright (c) 2022. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch01_pe07_movie_quote_info;

import javax.swing.*;

/**
 * The type Movie quote info.
 */
/*
Project:       Java9E
Module:      Chapter_01
Package:     ch01_pe07_movie_quote_info
File:            MovieQuoteInfo
Created By: Kimberly Henry
Created On: Saturday, 03-Dec-2022
*/public class MovieQuoteInfo
	{
		/**
		 * The entry point of application.
		 *
		 * @param args the input arguments
		 */
		public static void main(String[] args)
		{
				JOptionPane.showMessageDialog(null, """
						Gone with the Wind\s
						Year:  1939
						Frankly my dear, I do not give a damn
						Rhett Butler""",
					"FAVORITE MOVIE QUOTE INFO",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
