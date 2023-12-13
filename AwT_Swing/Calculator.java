import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {
    Calculator() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label firstnum = new Label("Enter the first Number ");
        firstnum.setBounds(50, 60, 150, 20);
        TextField num1 = new TextField("0");
        num1.setBounds(250, 60, 100, 20);
        Label secondnum = new Label("Enter the second Number");
        secondnum.setBounds(50, 90, 180, 20);
        TextField num2 = new TextField("0");
        num2.setBounds(250, 90, 100, 20);
        Label result = new Label("Result");
        result.setBounds(50, 120, 150, 20);
        TextField dispresult = new TextField("0");
        dispresult.setBounds(250, 120, 100, 20);
        Button sum = new Button("SUM");
        sum.setBounds(50, 150, 90, 30);
        sum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                dispresult.setText(String.valueOf(n1 + n2));
            }
        });
        Button sub = new Button("Sub");
        sub.setBounds(160, 150, 90, 30);

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                dispresult.setText(String.valueOf(n1 - n2));
                setBackground(Color.BLACK);

            }
        });

        Button mul = new Button("mul");
        mul.setBounds(240, 150, 90, 30);
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                dispresult.setText(String.valueOf(n1 * n2));
            }
        });

        Button div = new Button("div");
        div.setBounds(340, 150, 90, 30);
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float n1 = Integer.parseInt(num1.getText());
                float n2 = Integer.parseInt(num2.getText());
                dispresult.setText(String.valueOf(n1 / n2));
            }
        });
        add(mul);
        add(div);
        add(sub);
        add(sum);
        add(firstnum);
        add(secondnum);
        add(num1);
        add(num2);
        add(result);
        add(dispresult);
        setSize(500, 500);
        setLayout(null);
        // setBackground(Color.BLUE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
