import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== TO DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();

                    tasks.add(task);

                    System.out.println("Task Added Successfully");
                    break;

                case 2:

                    System.out.println("\nYour Tasks:");

                    if(tasks.isEmpty()) {
                        System.out.println("No Tasks Found");
                    }

                    else {

                        for(int i=0; i<tasks.size(); i++) {

                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                    }

                    break;

                case 3:

                    System.out.println("Program Closed");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}