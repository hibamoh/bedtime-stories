package com.pluralsight;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.BufferedReader;



public class BedTimeStory {
    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("which bedtime story do you want to read? make sure to add .txt");
        String storyOption = myScanner.nextLine();
        String fileName = "src/main/resources/" + storyOption;
try {
    FileReader fileReader = new FileReader(fileName);
    BufferedReader bufReader = new BufferedReader(fileReader);

    String line = bufReader.readLine();
    while (line != null){
        System.out.println(line);
        line = bufReader.readLine();
    }

} catch (FileNotFoundException e) {
    System.out.println("erm, there is no file named that... : " + e.getMessage());
} catch (IOException e) {
    throw new RuntimeException(e);
}


    }
}
