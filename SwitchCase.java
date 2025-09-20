// This program explains the switch-case statement in Java.
// Switch is used to execute one block of code out of many options based on a value.
// It is an alternative to multiple if-else statements.
// Each case is checked, and if matched, the corresponding block runs.
// The default case runs if no other case matches.

public class SwitchCase {
    public static void main(String[] args) {

        int day = 3;

        // Basic switch statement
        System.out.print("Day " + day + " is: ");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // stops checking other cases
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day"); // runs if no case matches
        }

        // Switch with multiple cases for same output
        char grade = 'B';
        System.out.print("Your grade " + grade + " means: ");
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade");
        }

        // Using switch with String
        String fruit = "Mango";
        System.out.print("Fruit: " + fruit + " is ");
        switch (fruit) {
            case "Apple":
                System.out.println("Red or Green");
                break;
            case "Banana":
                System.out.println("Yellow");
                break;
            case "Mango":
                System.out.println("Yellow and sweet");
                break;
            default:
                System.out.println("Unknown color");
        }
    }
}
