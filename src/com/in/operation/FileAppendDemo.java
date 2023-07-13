package com.in.operation;

import java.io.FileWriter;
import java.util.Scanner;

public class FileAppendDemo {
    public static void append() {
        String data = " here  is code";
        try{
        FileWriter output = new FileWriter("data.txt",true);
        output.write(data);
        System.out.println(" Data append successfully");
        output.close();
    }catch (Exception e) {
         System.out.println(" Error generate");
       
    }
    }
}
