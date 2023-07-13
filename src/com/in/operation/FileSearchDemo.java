package com.in.operation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileSearchDemo {
    public static void search() throws FileNotFoundException, IOException {
        String filepath="data1.txt";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the statement for writing in file");
        String searchElement =sc.nextLine();
        try
            (BufferedReader reader = new BufferedReader(new FileReader("C://Users//sakshi sahu//OneDrive//Desktop//FileManagement_project//data1.txt/"))){
                String line;
                int lineNumber=1;
                boolean elementFound= false;
                while((line= reader.readLine())!= null){
                    if(line.contains(searchElement)){
                        System.out.println("Element found at line"+lineNumber+": "+line);
                        elementFound = true;
                    }
                    lineNumber++;
                }
                if(!elementFound){
                    System.out.println("Element not found in the file");

                }
            
        }catch(IOException e){
            System.out.println("Error reading the file: "+ e.getMessage());
        }

    }
    
}
