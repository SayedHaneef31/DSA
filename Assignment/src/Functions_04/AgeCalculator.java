package Functions_04;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth date:");

        System.out.print("Year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Day: ");
        int birthDay = scanner.nextInt();

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int currentMonth = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH) + 1;
        int currentDay = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_MONTH);

        int ageInYears = currentYear - birthYear;
        int ageInMonths = currentMonth - birthMonth;
        int ageInDays = currentDay - birthDay;

        // Adjust for negative values
        if (ageInDays < 0) {
            ageInMonths--;
            ageInDays += 30; // Assuming a month has 30 days
        }

        if (ageInMonths < 0) {
            ageInYears--;
            ageInMonths += 12;
        }

        // Display the result
        System.out.println("Your age is: " + ageInYears + " years, " +
                ageInMonths + " months, and " + ageInDays + " days.");

        scanner.close();
    }
}
