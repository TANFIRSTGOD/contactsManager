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
        title.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        title.setFont(new Font("Arial", Font.BOLD, 40));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        int Left = 5;
        int Top = 10;
        int Right = 5;
        int Bot = 10;
        
        JLabel a = new JLabel("A");
        a.setFont(new Font("Arial", Font.BOLD, 30));
        a.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(a);
        
        JLabel b = new JLabel("B");
        b.setFont(new Font("Arial", Font.BOLD, 30));
        b.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(b);
        
        JLabel c = new JLabel("C");
        c.setFont(new Font("Arial", Font.BOLD, 30));
        c.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(c);
        
        JLabel d = new JLabel("D");
        d.setFont(new Font("Arial", Font.BOLD, 30));
        d.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(d);
        
        JLabel e = new JLabel("E");
        e.setFont(new Font("Arial", Font.BOLD, 30));
        e.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(e);
        
        JLabel f = new JLabel("F");
        f.setFont(new Font("Arial", Font.BOLD, 30));
        f.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(f);
        

        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 50, 490, 550);

        frame.add(title);
        frame.add(scrollPane);
    }
}
