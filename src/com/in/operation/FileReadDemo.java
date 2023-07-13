package com.in.operation;

import java.io.FileReader;
import java.io.IOException;
public class FileReadDemo {
    public static void read() throws IOException {
        char[] data= new char[1000];
        FileReader input = new FileReader("data1.txt");
        
        System.out.println("Data received from a file");
        System.out.println(data);
        input.close();
    }
}