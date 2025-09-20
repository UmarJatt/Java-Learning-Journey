// This program demonstrates the Java Time API introduced in Java 8 (java.time package).
// Java Time API provides modern classes for handling date, time, and date-time with better functionality and thread-safety.
// Key classes: LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration
// Provides formatting and parsing with DateTimeFormatter.

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Period;

public class JavaTimeAPI {
    public static void main(String[] args) {

        System.out.println("Java Time API Example\n");

        // ---------------- LocalDate ----------------
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        LocalDate birthday = LocalDate.of(2005, 10, 11);
        System.out.println("Birthday: " + birthday);

        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

        // ---------------- LocalTime ----------------
        LocalTime currentTime = LocalTime.now();
        System.out.println("\nCurrent Time: " + currentTime);

        LocalTime customTime = LocalTime.of(14, 30, 0);
        System.out.println("Custom Time: " + customTime);

        Duration duration = Duration.between(customTime, currentTime);
        System.out.println("Duration between customTime and currentTime: " + duration.toHours() + " hours");

        // ---------------- LocalDateTime ----------------
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\nCurrent Date and Time: " + currentDateTime);

        LocalDateTime customDateTime = LocalDateTime.of(2025, 12, 25, 10, 15);
        System.out.println("Custom DateTime: " + customDateTime);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Current DateTime: " + formattedDateTime);

        // ---------------- ZonedDateTime ----------------
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Karachi"));
        System.out.println("\nZoned DateTime (Asia/Karachi): " + zonedDateTime);
    }
}

/*
Key Points about Java Time API:

1. Introduced in Java 8 under java.time package.
2. LocalDate - date only, LocalTime - time only, LocalDateTime - both date and time.
3. ZonedDateTime - date-time with time zone.
4. Period - difference between two dates (years, months, days).
5. Duration - difference between two times (hours, minutes, seconds).
6. DateTimeFormatter - format date/time to string or parse string to date/time.
7. Thread-safe and more accurate than legacy Date and Calendar classes.
8. Use LocalDate.of(year, month, day) and LocalTime.of(hour, minute, second) for custom date/time.
*/
