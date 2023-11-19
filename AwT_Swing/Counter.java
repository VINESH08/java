import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame {
    Counter() {
        TextField display = new TextField("0");
        display.setBounds(50, 60, 300, 30);
        Button increment = new Button("Increment");
        increment.setBounds(60, 100, 100, 30);
        Button reset = new Button("Reset");
        reset.setBounds(190, 100, 70, 30);
        Button decrement = new Button("Decrement");
        decrement.setBounds(280, 100, 100, 30);
        increment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(display.getText());
                display.setText(String.valueOf(++n));
            }
        });
        decrement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(display.getText());
                display.setText(String.valueOf(--n));
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        setLayout(null);
        add(display);
        add(increment);
        add(reset);
        add(decrement);
        setSize(500, 500);
        setTitle("Counter");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Counter();
    }
}