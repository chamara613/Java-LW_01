package Q_08;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with an exclamation mark(!):");
        String input = scanner.nextLine();
        scanner.close();
        int index = input.indexOf('!');
        String before = input.substring(0, index).trim();
        String after = input.substring(index + 1).trim();

        System.out.println(before);
        System.out.println(after);

    }
}
