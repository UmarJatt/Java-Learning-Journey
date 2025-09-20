// This program demonstrates the GregorianCalendar class in Java.
// GregorianCalendar is a concrete subclass of Calendar and provides the standard calendar system used in most of the world.
// It allows setting dates, checking leap years, and performing date arithmetic.

import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalendarClass {
    public static void main(String[] args) {

        System.out.println("GregorianCalendar Example\n");

        // Creating GregorianCalendar object for current date and time
        GregorianCalendar currentDate = new GregorianCalendar();
        System.out.println("Current Date and Time: " + currentDate.getTime());

        // Retrieving specific fields
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1; // Months start from 0
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
        int hour = currentDate.get(Calendar.HOUR_OF_DAY);
        int minute = currentDate.get(Calendar.MINUTE);
        int second = currentDate.get(Calendar.SECOND);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Creating a specific date
        GregorianCalendar myBirthday = new GregorianCalendar(2005, Calendar.OCTOBER, 11);
        System.out.println("\nMy Birthday: " + myBirthday.getTime());

        // Checking if a year is a leap year
        int checkYear = 2024;
        boolean isLeap = GregorianCalendar.isLeapYear(checkYear);
        System.out.println(checkYear + " is leap year? " + isLeap);

        // Adding days and months
        currentDate.add(Calendar.DAY_OF_MONTH, 10); // Add 10 days
        currentDate.add(Calendar.MONTH, 1);         // Add 1 month
        System.out.println("Date after adding 10 days and 1 month: " + currentDate.getTime());

        // Comparing dates
        if (currentDate.after(myBirthday)) {
            System.out.println("Current date is after my birthday");
        } else {
            System.out.println("Current date is before or equal to my birthday");
        }
    }
}

/*
Key Points about GregorianCalendar:

1. GregorianCalendar is a subclass of Calendar.
2. Can create current date/time or specific dates using constructor.
3. Use get(field) to get year, month, day, hour, minute, second.
4. Months start from 0 (January) to 11 (December).
5. Use add(field, amount) to add/subtract days, months, years.
6. Use isLeapYear(year) to check if a year is a leap year.
7. Useful for date manipulations and calculations.
8. Part of java.util package, import java.util.GregorianCalendar to use.
*/
