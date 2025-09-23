package com.fileHandler;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {
       String filePath = "C:\\Users\\jayam\\Desktop\\text1.txt";
        try(Writer fw = new FileWriter(filePath)){
            fw.write("this is written by fileWriter Method \n");
            fw.write("this is an second file \n");
            fw.write("continous is writing the content By Using the File");
            fw.append("the content us append by using the append");
            fw.close();
        }catch( IOException e){
            System.out.println("io exception");
        }finally {
            System.out.println("process was done ");
        }
    }
}
