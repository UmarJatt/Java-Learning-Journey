// This program demonstrates Date and Time in Java.
// Java 8 introduced java.time package for handling date and time.
// Key classes: LocalDate (date), LocalTime (time), LocalDateTime (date + time)
// Provides easy and safe way to work with date/time compared to older Date and Calendar classes.

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeInJava {
    public static void main(String[] args) {

        System.out.println("Date and Time in Java Example\n");

        // ---------------- LocalDate ----------------
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Getting specific values
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Month: " + currentDate.getMonth());
        System.out.println("Day: " + currentDate.getDayOfMonth());

        // ---------------- LocalTime ----------------
        LocalTime currentTime = LocalTime.now();
        System.out.println("\nCurrent Time: " + currentTime);

        // Getting specific values
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());

        // ---------------- LocalDateTime ----------------
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\nCurrent Date and Time: " + currentDateTime);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Creating custom date and time
        LocalDate customDate = LocalDate.of(2025, 12, 25);
        LocalTime customTime = LocalTime.of(14, 30, 45);
        LocalDateTime customDateTime = LocalDateTime.of(customDate, customTime);

        System.out.println("\nCustom Date: " + customDate);
        System.out.println("Custom Time: " + customTime);
        System.out.println("Custom DateTime: " + customDateTime);
    }
}

/*
Key Points about Date and Time in Java:

1. LocalDate - represents date only (year, month, day)
2. LocalTime - represents time only (hour, minute, second, nano)
3. LocalDateTime - represents both date and time
4. Use now() method to get current date/time.
5. Use of() method to create specific date/time.
6. Use getYear(), getMonth(), getDayOfMonth(), getHour(), getMinute() etc. to extract specific parts.
7. DateTimeFormatter can format date/time to a readable string.
8. java.time package is thread-safe and recommended over older Date/Calendar classes.
*/
