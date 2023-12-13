import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PassengerDetails {
    private String name;
    private int date;
    private String gender;
    private String berthPreference;

    PassengerDetails(String name, int d, String gender, String berthPreference) {
        this.name = name;
        this.date = d;
        this.gender = gender;
        this.berthPreference = berthPreference;
    }

    int calculateAge() {
        int i;
        i = 2023 - date;
        return i;
    }

    String getBerthPreference() {
        return berthPreference;
    }

    String toStringDetails() {
        return "Name: " + name + "\nDate of Birth: " + date + "\nGender: " + gender + "\nBerth Preference: "
                + berthPreference;
    }
}

class TrainTicket extends JFrame implements ActionListener {

    JTextField nameField, dobField, ageField;
    JRadioButton maleRadio, femaleRadio;
    JComboBox<String> berthPreferenceBox;
    JTextArea outputArea;
    JButton submitButton;

    TrainTicket() {

        setTitle("BOOKING TRAIN TICKETS");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);
        JLabel dobLabel = new JLabel("Date of Birth (yyyy):");
        dobField = new JTextField(15);
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(15);
        ageField.setEditable(false);

        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JLabel berthLabel = new JLabel("Berth Preference:");
        String[] berthPreferences = { "Lower", "Middle", "Upper" };
        berthPreferenceBox = new JComboBox<>(berthPreferences);

        outputArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(dobLabel);
        add(dobField);
        add(ageLabel);
        add(ageField);
        add(maleRadio);
        add(femaleRadio);
        add(berthLabel);
        add(berthPreferenceBox);
        add(scrollPane);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {

            validateInput();

        }
    }

    private void validateInput() {
        String name = nameField.getText();
        String dobText = dobField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String berthPreference = (String) berthPreferenceBox.getSelectedItem();

        int dob = Integer.parseInt(dobText);
        PassengerDetails passenger = new PassengerDetails(name, dob, gender, berthPreference);

        int age = passenger.calculateAge();

        if (age > 60) {
            outputArea.setText("You are a Senior Citizen");
        } else {
            outputArea.setText(passenger.toStringDetails());
        }

    }
}

class Train {
    public static void main(String[] args) {
        TrainTicket a = new TrainTicket();
    }

}
