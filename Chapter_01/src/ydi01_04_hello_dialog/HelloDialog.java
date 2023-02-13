/*
 * Copyright (c) 2022-2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ydi01_04_hello_dialog;

import javax.swing.*;

/**
 * The type Hello dialog.
 */
/*
Project:       Java9E
Module:      Chapter_01
Package:     ydi01_04_hello_dialog
File:            HelloDialog
Created By: Kimberly Henry
Created On: Saturday, 03-Dec-2022

*/public class HelloDialog
	{
		/**
		 * The entry point of application.
		 *
		 * @param args the input arguments
		 */
		public static void main(String[] args)
		{
			JOptionPane.showMessageDialog(null, "ydi01_01_hello.Hello, world!",
				"ydi01_01_hello.Hello Dialog", JOptionPane.INFORMATION_MESSAGE);
		}
	}

