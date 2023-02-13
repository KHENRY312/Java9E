/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch01_pe11_comments_dialog;

import javax.swing.*;

/**
 * The type Comments dialog.
 */
/*
Project:       Java9E
Module:      Chapter_01
Package:     ch01_pe11_comments_dialog
File:            CommentsDialog
Created By: Kimberly Henry
Created On: Monday, 05-Dec-2022
*/public class CommentsDialog
	{
		/**
		 * The entry point of application.
		 *
		 * @param args the input arguments
		 */
		public static void main(String[] args)
			{
				JOptionPane.showMessageDialog(null, """
                    Program comments are non-executing
                    statements you add to a file for
                    the purpose of documentation.""",
					"COMMENTS", JOptionPane.PLAIN_MESSAGE);
			}
	}
	/*Program comments are non executing statements you add to a file for the purpose of
	documentation.*/

//Program comments are non executing statements you add to a file for the purpose of
//documentation.
