import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        if (birthDate.isAfter(currentDate)) {
            System.out.println("Future date mat daal bhai 😑");
        } else {
            Period age = Period.between(birthDate, currentDate);

            System.out.println("\n🎂 Your Age is:");
            System.out.println(age.getYears() + " Years");
            System.out.println(age.getMonths() + " Months");
            System.out.println(age.getDays() + " Days");
        }

        sc.close();
    }
}