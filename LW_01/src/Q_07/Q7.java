package Q_07;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String time = sdf.format(date);

        frame.setSize(300, 300);
        frame.setTitle(time);
        frame.setVisible(true);
    }
}
