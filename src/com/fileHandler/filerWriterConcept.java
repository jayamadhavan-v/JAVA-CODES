package com.fileHandler;

import com.sun.security.jgss.GSSUtil;

import java.io.*;

public class filerWriterConcept {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt");) {
            writer.write("love u teju ");
            System.out.println("file was created ");
        } catch (IOException e ) {
            System.err.println("could not write e");
        }
    }
}
