package com.in.operation;

import java.io.*;
import java.util.Scanner;

public class FileUpdateDemo {
	public static void update() {
		String filePath = "data.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder contentBuilder = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				String updatedLine = line.toUpperCase();
				contentBuilder.append(updatedLine).append(System.lineSeparator());
			}

			String updatedContent = contentBuilder.toString();

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
				writer.write(updatedContent);
			}

			System.out.println("File updated successfully!");
		} catch (IOException e) {
			System.err.println("Error updating the file: " + e.getMessage());
		}

	}
}
