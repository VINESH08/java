import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class Stock_Details {
    String name;
    int stockid;
    int cost;

    Stock_Details(String name, int stockid, int cost) {
        this.name = name;
        this.stockid = stockid;
        this.cost = cost;
    }

    public String toString() {
        return "Name:" + name + " " + "Stockid:" + stockid;
    }
}

class StockManagement {
    JLabel Name;
    JTextField nameField;
    JLabel id;
    JTextField idField;
    JLabel Cost;
    JTextField costField;;
    JButton add;
    JButton displ;
    JTextArea ta;

    StockManagement() {

        JFrame jf = new JFrame();
        jf.setTitle("Stock Management");
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Name = new JLabel("Enter your name");
        Name.setBounds(100, 50, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(250, 50, 100, 30);
        id = new JLabel("Enter your id");
        id.setBounds(100, 80, 150, 50);
        idField = new JTextField();
        idField.setBounds(270, 80, 90, 30);
        Cost = new JLabel("Enter Cost");
        Cost.setBounds(100, 110, 130, 50);
        costField = new JTextField();
        costField.setBounds(260, 110, 90, 30);
        add = new JButton("ADD");
        add.setBounds(170, 190, 70, 40);
        displ = new JButton("Display");
        displ.setBounds(250, 190, 70, 40);
        ta = new JTextArea(30, 30);
        ta.setBounds(150, 240, 390, 390);
        jf.add(ta);
        jf.add(Name);
        jf.add(nameField);
        jf.add(id);
        jf.add(idField);
        jf.add(Cost);
        jf.add(costField);
        jf.add(add);
        jf.add(displ);
        jf.setSize(500, 500);
        jf.setVisible(true);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n = nameField.getText();
                int id = Integer.parseInt(idField.getText());
                int cos = Integer.parseInt(costField.getText());
                Stock_Details obj = new Stock_Details(n, id, cos);
                Add_Stock_Details(obj);
                ta.append("Object Inserted!\n");
            }
        });

        Display_Stock_Details();
        nameField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                nameField.setText("");
            }
        });
    }

    ArrayList<Stock_Details> al = new ArrayList<Stock_Details>();

    public void Add_Stock_Details(Stock_Details obj) {
        al.add(obj);
    }

    public void Display_Stock_Details() {
        displ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText(" ");
                for (Stock_Details i : al) {
                    ta.append(i.toString());
                    ta.append("\n");
                }
            }
        });
    }

}

class Stock {

    public static void main(String[] args) {
        new StockManagement();

    }
}