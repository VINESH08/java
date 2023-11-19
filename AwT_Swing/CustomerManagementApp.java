import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerManagementApp extends JFrame {
    private JTextField customerNameField, customerNumberField, cityField, stateField, pincodeField;
    private JTextArea outputArea;
    private CustomerManagement customerManagement;

    public CustomerManagementApp() {
        customerManagement = new CustomerManagement();
        createUI();
    }

    private void createUI() {
        // Initialize components
        customerNameField = new JTextField(20);
        customerNumberField = new JTextField(20);
        cityField = new JTextField(20);
        stateField = new JTextField(20);
        pincodeField = new JTextField(20);
        outputArea = new JTextArea(10, 30);

        // Buttons
        JButton addButton = new JButton("Add Customer");
        JButton searchButton = new JButton("Search Customer");
        JButton displayButton = new JButton("Display Customers");

        // Layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(new JLabel("Customer Name:"));
        add(customerNameField);
        add(new JLabel("Customer Number:"));
        add(customerNumberField);
        add(new JLabel("City:"));
        add(cityField);
        add(new JLabel("State:"));
        add(stateField);
        add(new JLabel("Pincode:"));
        add(pincodeField);
        add(addButton);
        add(searchButton);
        add(displayButton);
        add(new JScrollPane(outputArea));

        // Action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCustomer();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchCustomer();
            }
        });
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayCustomers();
            }
        });

        // Setting frame properties
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addCustomer() {
        // Read data from fields and add customer
        String name = customerNameField.getText();
        String number = customerNumberField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pincode = pincodeField.getText();

        Customer customer = new Customer(name, number, city, state, pincode);
        customerManagement.addCustomer(customer);
    }

    private void searchCustomer() {
        // Search for customer and display or save result
        String customerNumber = customerNumberField.getText();
        Customer customer = customerManagement.searchCustomer(customerNumber);

        if (customer != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("customer_output.txt"))) {
                writer.write(customer.getCustomerName());
            } catch (IOException e) {
                e.printStackTrace();
            }
            outputArea.setText("Customer Found: " + customer.getCustomerName());
        } else {
            outputArea.setText("Customer not found.");
        }
    }

    private void displayCustomers() {
        // Display customers from file
        // Implementation depends on file reading logic
        // ...
    }

    public static void main(String[] args) {
        new CustomerManagementApp();
    }

    // Customer class
    static class Customer {
        private String customerName;
        private String customerNumber; // Unique identifier
        private String city;
        private String state;
        private String pincode;

        // Constructor
        public Customer(String customerName, String customerNumber, String city, String state, String pincode) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
            this.city = city;
            this.state = state;
            this.pincode = pincode;
        }

        // Getters and setters for each field
        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerNumber() {
            return customerNumber;
        }

        // Other getters and setters
        // ...
    }

    // CustomerManagement class
    static class CustomerManagement {
        private List<Customer> customers = new ArrayList<>();

        // Add a Customer
        public void addCustomer(Customer customer) {
            customers.add(customer);
        }

        // Search Customer
        public Customer searchCustomer(String customerNumber) {
            for (Customer customer : customers) {
                if (customer.getCustomerNumber().equals(customerNumber)) {
                    return customer;
                }
            }
            return null; // Return null if not found
        }
    }
}
