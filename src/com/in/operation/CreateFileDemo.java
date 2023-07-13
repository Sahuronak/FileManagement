package com.in.operation;

import java.io.File;

public class CreateFileDemo{
    public static void create() {
        File myFile= new File("data1.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println(" File give error in creation");
            }
        }
            catch (Exception e) {
                System.out.println(" giving exception error");
            }
        
    }
    
  
}
