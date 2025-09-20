// This program demonstrates DateTimeFormatter in Java Time API.
// DateTimeFormatter is used to format LocalDate, LocalTime, and LocalDateTime objects to a readable string.
// It can also parse a formatted string back to date/time objects.

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeDateFormatter {
    public static void main(String[] args) {

        System.out.println("Java Time Date Formatter Example\n");

        // ---------------- Formatting LocalDate ----------------
        LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        // ---------------- Formatting LocalTime ----------------
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted Time: " + formattedTime);

        // ---------------- Formatting LocalDateTime ----------------
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // ---------------- Parsing Strings to Date/Time ----------------
        String dateString = "20-09-2025";
        DateTimeFormatter parserFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, parserFormatter);
        System.out.println("Parsed LocalDate: " + parsedDate);

        String timeString = "15:45:30";
        DateTimeFormatter parserTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parsedTime = LocalTime.parse(timeString, parserTimeFormatter);
        System.out.println("Parsed LocalTime: " + parsedTime);
    }
}

/*
Key Points about DateTimeFormatter:

1. DateTimeFormatter formats LocalDate, LocalTime, and LocalDateTime to a readable string.
2. Use ofPattern("pattern") to define the format (e.g., "dd/MM/yyyy", "HH:mm:ss").
3. format(dateTimeObject) converts date/time object to string.
4. parse(string, formatter) converts string back to LocalDate or LocalTime.
5. Provides thread-safe way to handle date/time formatting.
6. Useful for displaying date/time in custom formats or reading user input.
7. Part of java.time.format package, import java.time.format.DateTimeFormatter to use.
*/
