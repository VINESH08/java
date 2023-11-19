import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MobilePurchase extends JFrame {
    private JTextField pricefield;
    private JLabel statuslabel;

    MobilePurchase() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("ONLINE MOBILE SHOPPING");
        setLayout(new FlowLayout());
        add(label);
        String brands[] = { "Samsung", "Apple", "OnePlus" };
        JLabel yearlabel = new JLabel("Model ");
        add(yearlabel);
        JComboBox<String> branddropdown = new JComboBox<>(brands);
        add(branddropdown);
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton year1 = new JRadioButton("2018");
        JRadioButton year2 = new JRadioButton("2019");
        JRadioButton year3 = new JRadioButton("2020");
        buttonGroup.add(year1);
        buttonGroup.add(year2);
        buttonGroup.add(year3);

        JTextField modelfield = new JTextField(10);
        pricefield = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        add(modelfield);
        add(pricefield);
        add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new PriceValidationThread()).start();
            }
        });
        statuslabel = new JLabel();
        add(statuslabel);
        setSize(200, 200);
        setVisible(true);

    }

    class PriceValidationThread implements Runnable {
        public void run() {
            try {
                int price = Integer.parseInt(pricefield.getText());
                if (price < 10000 || price > 50000) {
                    throw new PriceRangeException("Product not availabel");
                }
                SwingUtilities.invokeLater(() -> statuslabel.setText("Product Added Successfully!"));
            } catch (NumberFormatException e) {
                SwingUtilities.invokeLater(() -> statuslabel.setText("Invalid Price Format"));
            } catch (PriceRangeException e) {
                SwingUtilities.invokeLater(() -> statuslabel.setText(e.getMessage()));
            }
        }

    }

    class PriceRangeException extends Exception {
        public PriceRangeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MobilePurchase();
            }
        });
    }
}
