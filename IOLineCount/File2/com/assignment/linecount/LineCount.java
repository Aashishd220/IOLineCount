//program to count number of lines
package com.assignment.linecount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCount {
	public static void main(String args[]) throws FileNotFoundException {

		String filePathString;
		int count = 0;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter file path");
		filePathString = get.next();// stores file path

		File file = new File(filePathString);// passing path to file
		Scanner file1 = new Scanner(new File(filePathString));
		if (file.exists() && !file.isDirectory())// checks if file is there
		{
			while (file1.hasNextLine()) {// count the number of lines
				count++;
				file1.nextLine();
			}
			System.out.println("Number of lines in the file are " + count);
		} else // if file is not there
		{
			System.out.println("File is not there");
		}
	}
}
