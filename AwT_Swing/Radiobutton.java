import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Radiobutton extends JFrame {

    Radiobutton() {
        setLayout(new FlowLayout());
        JRadioButton b1 = new JRadioButton("Pizza");
        JRadioButton b2 = new JRadioButton("Burgger");
        JRadioButton b3 = new JRadioButton("FingerChips");
        JLabel lab = new JLabel("YOur Order");
        add(lab);
        add(b1);
        add(b2);
        add(b3);
        ButtonGroup b = new ButtonGroup();
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b1.isSelected()) {
                    lab.setText(b1.getText() + "Ordered");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b2.isSelected()) {
                    lab.setText(b2.getText() + "Ordered");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b3.isSelected()) {
                    lab.setText(b3.getText() + "Ordered");
                }
            }
        });
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Radiobutton();
    }
}
