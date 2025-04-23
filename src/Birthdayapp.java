import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthdayapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday (MM/dd/yyyy):");
        String userInput = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(userInput, formatter);
            System.out.println("Your Birthday Is: " + birthDate);
            System.out.println("You were born :  "+ birthDate.getDayOfWeek());
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);
            System.out.println("You are " + age.getYears()+ "Years old");
        }catch (DateTimeException e){
            System.out.println("Invalid Format");
        }
        input.close();
    }
}
