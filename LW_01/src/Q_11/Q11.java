package Q_11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = scanner.nextLine();
        scanner.close();
        String[] nameParts = fullName.split(" ");

        if (nameParts.length != 3){
            System.out.println("Enter correct full name.");
        } else {
            String firstName = nameParts[0];
            String middleName = nameParts[1].substring(0, 1);
            String lastName = nameParts[2];

            System.out.println(lastName + ", " + firstName + " " + middleName + ".");

        }
    }
}
