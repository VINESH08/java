import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Contact implements Comparable<Contact> {
    String name;
    int mbnumb;
    String type;

    Contact(String name, int mbnumb, String type) {
        this.name = name;
        this.mbnumb = mbnumb;
        this.type = type;
    }

    public int compareTo(Contact ob1) {
        return this.name.compareTo(ob1.name);
    }

    public String toString() {
        return "Name:" + name + " MobileNumb: " + mbnumb + " Type: " + type;
    }

}

class NotfoundException extends Exception {
    NotfoundException(String str) {
        super(str);
    }
}

public class ContactMain extends JFrame {
    JLabel name, mbnumb, type;
    JTextField nameField, mbnumbField, typeField;
    JButton add, search, display;
    JTextArea ta;
    TreeSet<Contact> ts = new TreeSet<Contact>();
    ArrayList<String> al = new ArrayList<String>();

    ContactMain() {
        setTitle("CONTACT MANAGEMENT");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name = new JLabel("Name");
        name.setBounds(100, 40, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(230, 40, 100, 30);

        mbnumb = new JLabel("MobileNumber");
        mbnumb.setBounds(100, 70, 120, 30);
        mbnumbField = new JTextField();
        mbnumbField.setBounds(240, 70, 150, 20);

        type = new JLabel("Type(Family/Official)");
        type.setBounds(100, 90, 150, 30);
        typeField = new JTextField();
        typeField.setBounds(270, 90, 100, 30);

        add = new JButton("Add");
        add.setBounds(150, 115, 90, 30);

        search = new JButton("Search");
        search.setBounds(250, 115, 100, 30);

        display = new JButton("Display");
        display.setBounds(360, 115, 100, 30);

        ta = new JTextArea(30, 30);
        ta.setBounds(270, 160, 390, 390);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Name = nameField.getText();
                int numb = Integer.parseInt(mbnumbField.getText());
                String Type = typeField.getText();
                Contact obj = new Contact(Name, numb, Type);
                AddContact(obj);
                ta.append("Object inserted\n");
            }
        });
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numb = Integer.parseInt(mbnumbField.getText());
                SearchContact(numb);

            }
        });
        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Display();
            }
        });
        add(name);
        add(nameField);
        add(mbnumb);
        add(mbnumbField);
        add(type);
        add(typeField);
        add(ta);
        add(add);
        add(search);
        add(display);
        setSize(500, 500);
        setVisible(true);
    }

    public void AddContact(Contact obj) {
        ts.add(obj);
    }

    public void SearchContact(int mbnum) {
        try {
            Iterator<Contact> it = ts.iterator();
            int flag = 0;
            while (it.hasNext()) {
                Contact ob = it.next();
                if (ob.mbnumb == mbnum) {
                    flag = 1;
                    ta.setText("Found!: " + ob.toString());
                    break;
                }
            }
            if (flag == 0) {
                throw new NotfoundException("Contact not found");
            }

        } catch (NotfoundException e) {
            ta.setText(e.getMessage());
        }
    }

    public void Display() {
        for (Contact ob : ts) {
            al.add(ob.toString());
        }
        for (String s : al) {
            ta.append(s);
            ta.append("\n");
        }
    }

    public static void main(String[] args) {
        new ContactMain();
    }
}
