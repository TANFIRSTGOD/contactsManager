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

        JLabel g = new JLabel("G");
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(g);
        
        JLabel h = new JLabel("H");
        h.setFont(new Font("Arial", Font.BOLD, 30));
        h.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(h);

        JLabel i = new JLabel("I");
        i.setFont(new Font("Arial", Font.BOLD, 30));
        i.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(i);

        JLabel j = new JLabel("J");
        j.setFont(new Font("Arial", Font.BOLD, 30));
        j.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(j);

        JLabel k = new JLabel("K");
        k.setFont(new Font("Arial", Font.BOLD, 30));
        k.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(k);

        JLabel l = new JLabel("L");
        l.setFont(new Font("Arial", Font.BOLD, 30));
        l.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(l);

        JLabel m = new JLabel("M");
        m.setFont(new Font("Arial", Font.BOLD, 30));
        m.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(m);

        JLabel n = new JLabel("N");
        n.setFont(new Font("Arial", Font.BOLD, 30));
        n.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(n);

        JLabel o = new JLabel("O");
        o.setFont(new Font("Arial", Font.BOLD, 30));
        o.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(o);

        JLabel p = new JLabel("P");
        p.setFont(new Font("Arial", Font.BOLD, 30));
        p.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(p);

        JLabel q = new JLabel("Q");
        q.setFont(new Font("Arial", Font.BOLD, 30));
        q.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(q);

        JLabel r = new JLabel("R");
        r.setFont(new Font("Arial", Font.BOLD, 30));
        r.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(r);

        JLabel x = new JLabel("X");
        x.setFont(new Font("Arial", Font.BOLD, 30));
        x.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(x);

        JLabel t = new JLabel("T");
        t.setFont(new Font("Arial", Font.BOLD, 30));
        t.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(t);

        JLabel u = new JLabel("U");
        u.setFont(new Font("Arial", Font.BOLD, 30));
        u.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(u);

        JLabel v = new JLabel("V");
        v.setFont(new Font("Arial", Font.BOLD, 30));
        v.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(v);

        JLabel w = new JLabel("W");
        w.setFont(new Font("Arial", Font.BOLD, 30));
        w.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(w);

        JLabel s = new JLabel("S");
        s.setFont(new Font("Arial", Font.BOLD, 30));
        s.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(s);

        JLabel y = new JLabel("Y");
        y.setFont(new Font("Arial", Font.BOLD, 30));
        y.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(y);

        JLabel z = new JLabel("Z");
        z.setFont(new Font("Arial", Font.BOLD, 30));
        z.setBorder(BorderFactory.createEmptyBorder(Top, Left, Bot, Right));
        panel.add(z);



        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 50, 490, 550);

        frame.add(title);
        frame.add(scrollPane);
    }
}
