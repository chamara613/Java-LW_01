package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        JFrame frame = new JFrame();
        frame.setSize(300, 250);
        frame.setTitle(firstName + " " + lastName);
        frame.setVisible(true);
    }
}