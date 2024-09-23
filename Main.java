import javax.swing.*;
import java.awt.*;

public class Main {

    static Color secondary = new Color(225, 227, 232);

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel title = new JLabel("Contacts");

        title.setOpaque(true);
        title.setBounds(0, 0, 500, 50);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setBackground(secondary);

        frame.add(title);

        frame.setTitle("Contacts manager");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
