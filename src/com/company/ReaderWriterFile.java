package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterFile {
    public static void main(String[] args) {
        String text = "Hello. I am Yash Anant Khankhoje. What is your good name ?";
        try{
            FileWriter fw = new FileWriter("demo.txt");
            fw.write(text);
            fw.close();
            System.out.println("File has be created/ updated successfully. ");
        }
        catch (IOException e){
            System.out.println("Somrthing went wrong" + e.getMessage());
        }

        try{
            FileReader fr = new FileReader("demo.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }
        catch (IOException e){
            System.out.println("Something went wrong" + e.getMessage());
        }
    }
}
