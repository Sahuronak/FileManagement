package com.in.operation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
	public static void write() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement for writing in file");
		String str1 = sc.nextLine();
		try {
			FileWriter output = new FileWriter("data.txt");
			output.write(str1);
			System.out.println("Data is written successfully");
			output.close();
		} catch (IOException e) {
			System.out.println(" File writer error");

		}
	}
}