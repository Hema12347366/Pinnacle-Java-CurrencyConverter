import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");

        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = 0;

        switch (choice) {
            case 1:
              convertedAmount = amount * 83.0;
       System.out.println(amount + " USD = "+     convertedAmount + " INR");
                break;

            case 2:
             convertedAmount = amount * 90.0;
            System.out.println(amount + " EUR =  " +convertedAmount + " INR");
                break;

            case 3:
              convertedAmount = amount * 105.0;
            System.out.println(amount + " GBP = " +convertedAmount + " INR");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}