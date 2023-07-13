package com.in.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.in.operation.CreateFileDemo;
import com.in.operation.FileAppendDemo;
import com.in.operation.FileMatchDemo;
import com.in.operation.FileReadDemo;
import com.in.operation.FileSearchDemo;
import com.in.operation.FileUpdateDemo;
import com.in.operation.FileWriteDemo;

public class Merging {
	Scanner scan = new Scanner(System.in);

	void select() {
		int select = 0;

		System.out.println("Enter 1 for Writing Something in file \nEnter 2 for updating "
				+ "in file \nenter 3 for searching Something in file\nEnter 4 for Reading the " +
				"file\nEnter 5 for checking file is same or"
				+ " not\nEnter 6 for appending the file\nEnter 7 for creating file");
		select = scan.nextInt();
		switch (select) {
		case 1: {
			FileWriteDemo.write();
			break;
		}
		case 2: {
			FileUpdateDemo.update();
			break;
		}
		case 3: {
			try {
				FileSearchDemo.search();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
		case 4: {
			try {
				FileReadDemo.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
		case 5:{
			FileMatchDemo.match();
			break;
		}
		case 6:{
			FileAppendDemo.append();
			break;
		}
		case 7:{
			CreateFileDemo.create();
			break;
		}
		}
	}

	public static void main(String[] args) {
		Merging mer = new Merging();
		mer.select();
	}

}
