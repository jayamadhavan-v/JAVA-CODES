package com.fileHandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class  FileReader_concepts {
    public static void main(String[] args) {
        String FILE_PATH = "C:\\Users\\jayam\\Desktop\\text1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file is not exists");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
}
