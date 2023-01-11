package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyScannerClass {
    //private static Scanner scanner = new Scanner(System.in);
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static BufferedReader getScanner() {
        return reader;
    }

    public static String readNextLine(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.getMessage();
        }
        return "";
    }
    public static void closeScanner() {
        try {
            reader.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }


}