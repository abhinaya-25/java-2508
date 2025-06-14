import java.util.Scanner;

public class clgapplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== College Admission Test Application =====");

        // Taking user input
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your 12th standard percentage: ");
        double marks = scanner.nextDouble();

        // Eligibility check
        if (age >= 17 && marks >= 60) {
            System.out.println("\nDear " + name + ",");
            System.out.println(" You are eligible for the College Admission Test!");
            System.out.println(" Test Date: 15th July 2025");
            System.out.println(" Time: 10:00 AM");
            System.out.println(" Venue: Main College Auditorium");
        } else {
            System.out.println("\nSorry " + name + ", you are not eligible for the test.");
            System.out.println(" Required: Age >= 17 and Marks >= 60%");
        }

        scanner.close();
    }
}

