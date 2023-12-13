import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.Timer;

public class MobilePurchase extends JFrame {
    private JTextField pricefield;
    private JLabel statuslabel;
    int x = 10;

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
        add(year1);
        add(year2);
        add(year3);
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
        Banner banner = new Banner();
        // banner.setPreferredSize(new Dimension(400, 50));
        add(banner);
        statuslabel = new JLabel();
        add(statuslabel);
        setSize(400, 400);

        setVisible(true);

    }

    class PriceValidationThread extends JPanel implements Runnable {
        public void run() {
            try {
                int price = Integer.parseInt(pricefield.getText());
                if (price < 10000 || price > 50000) {
                    throw new PriceRangeException("Product not availabel");
                }
                statuslabel.setText("Product Added Successfully!");
            } catch (NumberFormatException e) {
                statuslabel.setText("Invalid Price Format");
            } catch (PriceRangeException e) {
                statuslabel.setText(e.getMessage());
            }
        }
    }

    class PriceRangeException extends Exception {
        public PriceRangeException(String message) {
            super(message);
        }
    }

    class Banner extends JPanel {
        Banner() {
            javax.swing.Timer timer = new Timer(1000, e -> {
                if (x < getWidth())
                    x += 10;
                else
                    x = 0;
                repaint();
            });
            timer.start();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("WELCOME TO CRICKET BOARD", x, 30);
        }
    }

    public static void main(String[] args) {
        new MobilePurchase();
    }
}
