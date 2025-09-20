// This program demonstrates the Calendar class in Java.
// Calendar class (java.util.Calendar) is an abstract class that provides methods to manipulate date and time fields.
// Unlike Date, Calendar allows setting, adding, and retrieving specific fields like year, month, day, hour, minute, etc.

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TheCalendarClass {
    public static void main(String[] args) {

        System.out.println("Java Calendar Class Example\n");

        // Getting current date and time using Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time: " + calendar.getTime());

        // Retrieving specific fields
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months start from 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Setting specific date and time
        Calendar birthday = new GregorianCalendar(2000, Calendar.OCTOBER, 11, 10, 30, 0);
        System.out.println("\nBirthday Date and Time: " + birthday.getTime());

        // Adding or subtracting time
        calendar.add(Calendar.DAY_OF_MONTH, 5); // add 5 days
        calendar.add(Calendar.MONTH, -2);       // subtract 2 months
        System.out.println("Date after adding 5 days and subtracting 2 months: " + calendar.getTime());

        // Comparing two calendars
        if (calendar.after(birthday)) {
            System.out.println("Current date is after birthday");
        } else {
            System.out.println("Current date is before or equal to birthday");
        }
    }
}

/*
Key Points about Calendar class:

1. Calendar is an abstract class; use getInstance() to get current date/time.
2. Use get(field) to retrieve year, month, day, hour, minute, second, etc.
3. Use set(year, month, day) or set(field, value) to set specific fields.
4. Use add(field, amount) to add/subtract days, months, years, hours, etc.
5. Months in Calendar start from 0 (January) to 11 (December).
6. Useful for date manipulations, comparisons, and arithmetic operations.
7. Part of java.util package, import java.util.Calendar / java.util.GregorianCalendar to use.
*/
