import java.util.Scanner;
public class EnhancedSwitch {

    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        day = sc.nextLine();
        day =day.toUpperCase();

        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("It's a weekday");
            case "SATURDAY", "SUNDAY" -> System.out.println("It's a weekend ");
            default -> System.out.println("Entered is not a valid day");

        }

        sc.close();
    }
}