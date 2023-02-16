/*
 * Copyright (c) 2023. This code shall not be used, manipulated, decompiled or reproduced for other uses than educational;
 * and not to be used in lieu of performing your own assignments.
 */

package ch02_pe16_election_statistics;
import java.util.Scanner;
/*
    Project:    Java9E
    Module:     Chapter_02
    Package:    ch02_pe16_election_statistics
    Class:      ElectionStatistics
    Creator:    Kimberly Henry
    Created:    2/14/2023 1:24 AM
    Write a program that accepts the names of three political parties and the number of votes each received in the last

    mayoral election. Display the percentage of the vote each candidate received. Save the program as ElectionStatistics.java.
*/
public class ElectionStatistics
	{
	public static void main(String[] args)
		{
			//Get political parties
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the first political candidate name:  ");
			String candidate01 = keyboard.nextLine();
			System.out.print("Enter the second political candidate name:  ");
			String candidate02 = keyboard.nextLine();
			System.out.print("Enter the third political candidate name:  ");
			String candidate03 = keyboard.nextLine();
			//Display the political parties
			System.out.println("The political candidates are " + candidate01 + ", " + candidate02 + ", and " + candidate03 +
				".");
			//Enter and add total votes
			System.out.print("Enter total votes " + candidate01 + " received:  ");
			int candidate01Votes = keyboard.nextInt();
			System.out.print("Enter total votes " + candidate02 + " received:  ");
			int candidate02Votes = keyboard.nextInt();
			System.out.print("Enter total votes " + candidate03 + " received:  ");
			int candidate03Votes = keyboard.nextInt();
			int totalVotes = candidate01Votes + candidate02Votes + candidate03Votes;

			//Display votes for each candidate and total votes
			System.out.println(candidate01 + " received " + candidate01Votes + " votes.");
			System.out.println(candidate02 + " received " + candidate02Votes + " votes.");
			System.out.println(candidate03 + " received " + candidate03Votes + " votes.");
			System.out.println("Total votes received were " + totalVotes);

			//Calculates the percentage of the votes.
			double percentCandidate01 = Math.round((double) totalVotes / candidate01Votes) * 10;
			double percentCandidate02 = Math.round((double) totalVotes / candidate02Votes) * 10;
			double percentCandidate03 = Math.round((double) totalVotes / candidate03Votes) * 10;

			//Displays final percentage of votes
			System.out.println("Candidate one received " + percentCandidate01 + "% of the votes");
			System.out.println("Candidate two received " + percentCandidate02 + "% of the votes");
			System.out.println("Candidate three received " + percentCandidate03 + "% of the votes");
		}
	}
