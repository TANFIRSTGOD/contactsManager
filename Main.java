import javax.swing.*;
import java.awt.*;

public class Main {

    static Color secondary = new Color(225, 227, 232);

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Contacts manager");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel title = new JLabel("Contacts");
        title.setBounds(0, 0, 500, 50);
        title.setFont(new Font("Arial", Font.BOLD, 40));

        JLabel a = new JLabel("A");
        a.setBounds(0, 0, 500, 50);
        a.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel b = new JLabel("B");
        b.setBounds(0, 0, 500, 50);
        b.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel c = new JLabel("C");
        c.setBounds(0, 0, 500, 50);
        c.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel d = new JLabel("D");
        d.setBounds(0, 0, 500, 50);
        d.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel e = new JLabel("E");
        e.setBounds(0, 0, 500, 50);
        e.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel f = new JLabel("F");
        f.setBounds(0, 0, 500, 50);
        f.setFont(new Font("Arial", Font.BOLD, 30));

        JPanel panel = new JPanel();
        new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.add(a);
        panel.add(b);
        panel.add(c);
        panel.add(d);
        panel.add(e);
        panel.add(f);

        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 50, 490, 550);

        frame.add(title);
        frame.add(scrollPane);
    }
}
