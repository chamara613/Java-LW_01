package Q_05;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE/MMM/yyyy");
        System.out.println(sdf.format(today));
    }
}