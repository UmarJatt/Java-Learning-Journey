// This program demonstrates File Handling in Java.
// Java provides java.io package for file operations such as creating, writing, reading, and deleting files.
// Common classes: File, FileWriter, FileReader, BufferedReader, BufferedWriter
// File handling is essential for storing and retrieving data in text or binary format.

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingInJava {
    public static void main(String[] args) {

        System.out.println("File Handling in Java Example\n");

        // ---------------- Creating a File ----------------
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // ---------------- Writing to a File ----------------
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a sample text file.\n");
            writer.write("File handling in Java is simple and useful.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // ---------------- Reading from a File ----------------
        try {
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("\nReading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // ---------------- Deleting a File ----------------
        File fileToDelete = new File("example.txt");
        if (fileToDelete.delete()) {
            System.out.println("\nFile deleted successfully: " + fileToDelete.getName());
        } else {
            System.out.println("\nFailed to delete the file.");
        }
    }
}

/*
Key Points about File Handling in Java:

1. File class: represents files and directories.
   - createNewFile(), exists(), delete(), getName() are commonly used methods.
2. FileWriter/FileReader: used for writing and reading character files.
3. BufferedReader/BufferedWriter: used to read/write text efficiently line by line.
4. Always handle IOException using try-catch or throws declaration.
5. File handling allows storing, reading, and managing data in files.
6. Can work with text files (.txt) or binary files using FileInputStream/FileOutputStream.
7. Essential for data persistence in Java programs.
*/
