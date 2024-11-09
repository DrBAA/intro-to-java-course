package com.cbfacademy;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

public class FileManager {

    // Method to read a file and return its content as a List of Strings
    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }

    // Method to copy content from one file to another
    public void copy(String inputFile, String outputFile) throws IOException {
        Files.copy(Paths.get(inputFile), Paths.get(outputFile), StandardCopyOption.REPLACE_EXISTING);
    }

// Method to reverse the lines from inputFile and write them to outputFile
public void reverseLines(String inputFile, String outputFile) throws IOException {
    // Adjust paths to handle resources folder correctly
    Path inputPath = Paths.get(inputFile); // Use input file path directly
    Path outputPath = Paths.get(outputFile); // Use output file path directly

    // Read all lines from the input file
    List<String> lines = Files.readAllLines(inputPath);

    // Reverse the order of lines
    Collections.reverse(lines);

    // Write the reversed lines to the output file
    Files.write(outputPath, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
}



    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        try {
            // Example usage of readFile method
            List<String> lines = fileManager.readFile("input.txt");
            for (String line : lines) {
                System.out.println(line);
            }

            // Example usage of copy method
            fileManager.copy("input.txt", "output.txt");
            System.out.println("File copied successfully.");

            // Example usage of reverseLines method
            fileManager.reverseLines("input.txt", "output.txt");
            System.out.println("Lines reversed and written to output file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



// to run the code: ./mvnw clean test
