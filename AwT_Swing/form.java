import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class form {
    form() {

        JFrame frame = new JFrame("Form");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JLabel Emaillabel = new JLabel("Email");
        Emaillabel.setBounds(100, 50, 100, 30);
        TextField emailField = new TextField("Enter your mail");
        emailField.setBounds(270, 50, 200, 30);

        JLabel Passwordlabel = new JLabel("Password");
        Passwordlabel.setBounds(100, 90, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(270, 90, 200, 30);

        Label ageLabel = new Label("Age");
        ageLabel.setBounds(100, 130, 100, 30);
        TextField ageField = new TextField("Enter your age");
        ageField.setBounds(270, 130, 200, 30);
        Button btn = new Button("Submit");
        btn.setBounds(195, 200, 100, 40);

        JCheckBox ch = new JCheckBox("C++");
        ch.setBounds(100, 150, 70, 30);
        frame.add(ch);
        JCheckBox ch2 = new JCheckBox("Java");
        ch2.setBounds(180, 150, 70, 30);
        frame.add(ch2);
        ch.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ch.isSelected())
                    System.out.println("Selected C++");
                else
                    System.out.println("Deselected c++");
            }
        });
        btn.addActionListener(new ActionListener() {// action listiner is a interface
            public void actionPerformed(ActionEvent e) { // Corrected to ActionEvent
                // Your code here
                System.out.println(emailField.getText());
                System.out.println(passField.getText());
                System.out.println(ageField.getText());
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(Emaillabel);
        frame.add(Passwordlabel);
        frame.add(ageLabel);
        frame.add(emailField);
        frame.add(passField);
        frame.add(ageField);
        frame.add(btn);
        frame.setSize(500, 500);
    }

    public static void main(String[] args) {
        new form();
    }
}
/*
 * for line 24 alternate sol:inseted of creating annoymous inner class
 * class ButtonListiner implements ActionListiner{
 * Textfield emailInput;
 * Textfield passwordInput;
 * Textfield ageInput;
 * ButtonListiner(Textfield emailInput,Textfield PasswordInput,Textfield
 * ageInput){
 * this.emailInput=emailInput;
 * this.passwordInput=passwordInput;
 * this.ageInput=ageInput;
 * }
 * public void actionPerformed(ActionEvent e){
 * System.out.println(emailInput.getText());
 * System.out.println(passwordInput.getText());
 * System.out.println(ageInput.getText());
 * 
 * }
 * }
 * now create obj for button listiner -> ButtonListiner buttonlistiner=new
 * ButtonListiner(emailField,passwordField,ageField);
 * now pass this buttonlistiner object to the button->
 * btn.addActionListiner(buttonlistiner);
 */
