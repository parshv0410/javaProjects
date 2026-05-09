import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double a = sc.nextDouble();

        System.out.println("Enter Second Number:");
        double b = sc.nextDouble();

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Answer = " + (a+b));
                break;

            case 2:
                System.out.println("Answer = " + (a-b));
                break;

            case 3:
                System.out.println("Answer = " + (a*b));
                break;

            case 4:
                if(b==0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Answer = " + (a/b));
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
