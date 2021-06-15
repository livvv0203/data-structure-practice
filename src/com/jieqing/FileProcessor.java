package com.jieqing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {

    // Store file name in variables to avoid hard code
    String fileNameCar = "car_info.txt";
    String fileNamePerson = "person_info.txt";

    // Read car_info.txt and store contents in ArrayList
    public static ArrayList<String> ReadFromFile(String fileName) {

        // Declare and initialize the Array List
        ArrayList<String> listOfLines = new ArrayList<String>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(fileName));

            String line;

            // Add all lines from file to ArrayList
            do {
                line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                if (line.trim().length() > 0) {
                    listOfLines.add(line);
                }
            } while (true);

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // Finally
        return listOfLines;
    }
}
