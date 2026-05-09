import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = sc.nextInt();

        if(choice == 1) {

            System.out.println("Enter Celsius:");
            double c = sc.nextDouble();

            double f = (9 * c / 5) + 32;

            System.out.println("Fahrenheit = " + f);

        }

        else if(choice == 2) {

            System.out.println("Enter Fahrenheit:");
            double f = sc.nextDouble();

            double c = (f - 32) * 5 / 9;

            System.out.println("Celsius = " + c);

        }

        else {
            System.out.println("Invalid Choice");
        }
    }
}