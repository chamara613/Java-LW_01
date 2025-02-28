package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd-length word:");
        String word = scanner.next();

        scanner.close();
        int lecngth = word.length();

        if (lecngth % 2 == 0) {
            System.out.println("The word is not odd-length.");
        } else {
            int middleIndex = lecngth / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
