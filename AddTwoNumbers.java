import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class AddNumbers extends JFrame{
    public AddNumbers(){
        super("Add Two Numbers");
        num1 = new JLabel("First Number: ");
        tf1 = new JTextField();
        num2 = new JLabel("Second Number: ");
        tf2 = new JTextField();
        answer = new JButton("Answer");
        ansl = new JLabel("Answer: ");
        ans = new JLabel("");
        answer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                String s=String.valueOf(x+y);
                ans.setText(s);
            }});
        p = new JPanel(new GridLayout(3,2));
        p.add(num1);
        p.add(tf1);
        p.add(num2);
        p.add(tf2);
        p.add(ansl);
        p.add(ans);

        add(p, BorderLayout.CENTER);
        add(answer, BorderLayout.SOUTH);
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws Exception {
        new AddNumbers().setVisible(true);
    }

    private JPanel p;
    private JLabel num1, num2, ansl, ans;
    private JTextField tf1, tf2;
    private JButton answer;
}
