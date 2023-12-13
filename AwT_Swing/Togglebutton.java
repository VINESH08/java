import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class Togglebutton extends JFrame implements
        ItemListener {

    JToggleButton button;

    JLabel lab;

    Togglebutton() {

        setTitle("JToggleButton with ItemListener Example");

        setSize(200, 200);

        button = new JToggleButton("ON/OFF");

        lab = new JLabel("Status of Toggled Button");

        add(button);

        add(lab);

        button.addItemListener(this);

        setLayout(new FlowLayout());

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void itemStateChanged(ItemEvent eve)

    {

        if (button.isSelected()) {

            lab.setText("ON");

            setBackground(Color.blue);
        } else {
            lab.setText("OFF");
            setBackground(Color.white);
        }
    }

    public static void main(String[] args) {

        new Togglebutton();
    }

}