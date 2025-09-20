// This program demonstrates the Date class in Java.
// Date class (java.util.Date) represents a specific instant in time, with millisecond precision.
// It is a legacy class but still used in many programs.
// Common methods: getTime(), after(), before(), compareTo(), toString()

import java.util.Date;

public class TheDateClass {
    public static void main(String[] args) {

        System.out.println("Java Date Class Example\n");

        // Creating current date object
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Getting time in milliseconds since Jan 1, 1970
        long timeInMillis = currentDate.getTime();
        System.out.println("Time in milliseconds since Jan 1, 1970: " + timeInMillis);

        // Creating a specific date (deprecated constructors exist, prefer Calendar or LocalDate)
        Date pastDate = new Date(122, 7, 15); // Year = 2022-1900, Month = 7 (August), Day = 15
        System.out.println("Past Date: " + pastDate);

        // Comparing dates
        if (currentDate.after(pastDate)) {
            System.out.println("Current date is after past date");
        }

        if (pastDate.before(currentDate)) {
            System.out.println("Past date is before current date");
        }

        // Using compareTo method
        int compareResult = currentDate.compareTo(pastDate);
        if (compareResult > 0) {
            System.out.println("Current date comes after past date (compareTo result: " + compareResult + ")");
        } else if (compareResult < 0) {
            System.out.println("Current date comes before past date (compareTo result: " + compareResult + ")");
        } else {
            System.out.println("Both dates are equal");
        }

        // Converting to String
        String dateString = currentDate.toString();
        System.out.println("Date as String: " + dateString);
    }
}

/*
Key Points about Date class:

1. Date represents date and time in milliseconds since Jan 1, 1970 (epoch time).
2. Common methods:
   - getTime() - returns milliseconds
   - after(Date anotherDate), before(Date anotherDate)
   - compareTo(Date anotherDate)
   - toString() - converts date to readable string
3. Legacy class, many methods are deprecated; prefer java.time package in modern Java.
4. Can be used for basic date manipulations, comparisons, and storing timestamps.
5. Import java.util.Date to use.
*/
