package com.fileHandler;

import java.io.*;

public class MyBufferedReaderAndWriter {
    public static void main(String[] args) {
        String filePath ="C:\\Users\\jayam\\Desktop\\text1.txt";
        try(
        BufferedWriter bw  = new BufferedWriter(new FileWriter(filePath))
        ){
            bw.write("im trying to write something in the file \n");
            bw.write("next was written by me \n");
            bw.write("now im using the new Line concepts in this ");
            bw.close();
        } catch (IOException e) {
            System.err.println("problem on input and output section ");
        }
        finally {

            System.out.println("process done ");
        }
        System.out.println("now im trying to reader data from the file ");
        try(BufferedReader br = new BufferedReader( new FileReader(filePath))){
            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("reader the file is completed");
        }
    }
}
