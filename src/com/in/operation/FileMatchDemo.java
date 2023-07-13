package com.in.operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMatchDemo {
    public static void match() {
        String file1Path="data.txt";
        String file2Path= "data1.txt";
        try
        
            (BufferedReader reader1= new BufferedReader(new FileReader(file1Path));
        BufferedReader reader2= new BufferedReader(new FileReader(file2Path))){

        String line1, line2;
        int lineNumber=1;
        boolean filesMatch= true;

        while((line1= reader1.readLine())!=null && (line2= reader2.readLine())!=null){
            if(!line1.equals(line2)){
                System.out.println("Files differ at line "+lineNumber);
                filesMatch = false;
                break;
            }
            lineNumber++;
        }
        if(filesMatch){
            if(reader1.readLine()!= null || reader2.readLine()!=null){
                System.out.println("false have different length.");

            }
            else{
                System.out.println("Files match.  ");
            }
         }
         }
      catch(IOException e){
        System.out.println("Errror reading the files: "+ e.getMessage());
      }
    }
}