import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Airlines {
    String passname;
    int passid;
    int flightnumb;

    Airlines(String passname, int passid, int flightnumb) {
        this.passname = passname;
        this.passid = passid;
        this.flightnumb = flightnumb;

    }

    public String toString() {
        return "Name:" + passname + " passid:" + passid + " Flightnumb:" + flightnumb;
    }
}

class AirlineManagement {
    JLabel name;
    JTextField nameField;
    JLabel id;
    JTextField idField;
    JLabel flightn;
    JTextField flightfield;
    JButton add;
    JButton search;
    JButton displ;
    JTextArea ta;
    JLabel SearchId;
    JTextField Searchlab;
    JFrame jf;

    AirlineManagement() {
        jf = new JFrame("Jack And Jill Airlines");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        name = new JLabel("Enter your name:");
        name.setBounds(100, 50, 150, 40);
        nameField = new JTextField();
        nameField.setBounds(270, 50, 150, 40);

        id = new JLabel("Enter your id:");
        id.setBounds(100, 80, 150, 40);
        idField = new JTextField();
        idField.setBounds(270, 80, 150, 40);

        flightn = new JLabel("Enter flight numb:");
        flightn.setBounds(100, 110, 150, 40);
        flightfield = new JTextField();
        flightfield.setBounds(270, 110, 150, 40);

        SearchId = new JLabel("Enter id to be searched");
        SearchId.setBounds(100, 140, 150, 40);

        Searchlab = new JTextField();
        Searchlab.setBounds(270, 140, 150, 40);

        add = new JButton("ADD");
        add.setBounds(150, 180, 100, 30);

        search = new JButton("Search");
        search.setBounds(260, 180, 100, 30);

        displ = new JButton("Display");
        displ.setBounds(370, 180, 100, 30);

        ta = new JTextArea(30, 30);
        ta.setBounds(140, 220, 390, 390);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int id = Integer.parseInt(idField.getText());
                int flightnum = Integer.parseInt(flightfield.getText());
                Airlines obj = new Airlines(name, id, flightnum);
                AddDetail(obj);
                ta.append("Object inserted\n");
            }
        });
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sid = Integer.parseInt(Searchlab.getText());
                SearchPassenger(sid);
            }
        });

        Display();
        jf.add(name);
        jf.add(nameField);
        jf.add(id);
        jf.add(idField);
        jf.add(flightn);
        jf.add(flightfield);
        jf.add(SearchId);
        jf.add(Searchlab);
        jf.add(add);
        jf.add(search);
        jf.add(displ);
        jf.add(ta);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    ArrayList<Airlines> al = new ArrayList<Airlines>();

    public void AddDetail(Airlines obj) {
        al.add(obj);
    }

    public void SearchPassenger(int id) {
        int flag = 0;
        Iterator<Airlines> it = al.iterator();
        while (it.hasNext()) {
            Airlines ob = it.next();
            if (ob.passid == id) {
                flag = 1;
                ta.append("Passenger Found:");
                ta.append(ob.toString());
            }
        }
        if (flag == 0)
            JOptionPane.showMessageDialog(jf, "Passenger Not Found!", "Info", JOptionPane.ERROR_MESSAGE);
    }

    public void Display() {
        displ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Airlines ob : al) {
                    ta.append(ob.toString());
                    ta.append("\n");
                }
            }
        });
    }
}

class JJAirGui {
    public static void main(String[] args) {
        new AirlineManagement();
    }
}
