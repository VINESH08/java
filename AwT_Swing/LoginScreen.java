import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class LoginScreen extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    LoginScreen() {
        setTitle("Login Screen");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("User Name:");

        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField("Enter User Name");
        passwordField = new JPasswordField("Enter Password");
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                if (username.equals(String.valueOf(password))) {
                    JOptionPane.showMessageDialog(LoginScreen.this, "LoginSuccessful");
                } else {
                    JOptionPane.showMessageDialog(LoginScreen.this, "Invalid UserName and/or Password");
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("Enter User Name");
                passwordField.setText("Enter Password");
            }
        });

        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (usernameField.getText().equals("Enter User Name")) {
                    usernameField.setText("");

                }
            }
        });

        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(passwordField.getPassword()).equals("Enter Password")) {
                    passwordField.setText("");
                }
            }
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(okButton);
        add(cancelButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}