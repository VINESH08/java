import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class CarParking {
    String carid, carno, membtype;
    int EntryTime_h, EntryTime_m, ExitTime_h, ExitTime_m;
    double ParkingCharge;

    CarParking(String carid, String carno, String membtype, int EntryTime_h, int EntryTime_m, int ExitTime_h,
            int ExitTime_m) {
        this.carid = carid;
        this.carno = carno;
        this.membtype = membtype;
        this.EntryTime_h = EntryTime_h;
        this.EntryTime_m = EntryTime_m;
        this.ExitTime_h = ExitTime_h;
        this.ExitTime_m = ExitTime_m;
    }

}

public class IndAirport extends JFrame {
    JRadioButton nv, sv;
    JButton calcul;
    JLabel carid, carno, enth, entm, exth, extm;
    JTextField idField, noField, enthField, entmField, exthField, extmField;
    JTextArea ta;

    IndAirport() {
        setTitle("CAR PARKING");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nv = new JRadioButton("NormalVisiter");
        nv.setBounds(100, 30, 150, 30);
        sv = new JRadioButton("SpecialVisiter");
        sv.setBounds(260, 30, 150, 30);
        ButtonGroup g = new ButtonGroup();
        g.add(nv);
        g.add(sv);
        carid = new JLabel("Carid:");
        carid.setBounds(100, 50, 90, 30);
        idField = new JTextField();
        idField.setBounds(210, 50, 110, 20);

        carno = new JLabel("CarNo");
        carno.setBounds(100, 70, 90, 30);
        noField = new JTextField();
        noField.setBounds(210, 70, 110, 20);

        enth = new JLabel("EntryTimeHrs:");
        enth.setBounds(100, 90, 120, 30);
        enthField = new JTextField();
        enthField.setBounds(230, 90, 90, 30);

        entm = new JLabel("EntryTimeMin:");
        entm.setBounds(100, 120, 120, 30);
        entmField = new JTextField();
        entmField.setBounds(230, 120, 90, 30);

        exth = new JLabel("ExitTimeHrs:");
        exth.setBounds(100, 150, 120, 30);
        exthField = new JTextField();
        exthField.setBounds(230, 150, 90, 30);

        extm = new JLabel("ExitTimeMin:");
        extm.setBounds(100, 180, 120, 30);
        extmField = new JTextField();
        extmField.setBounds(230, 180, 90, 30);

        calcul = new JButton("Calculate Parking Charge");
        calcul.setBounds(170, 200, 150, 30);
        ta = new JTextArea(30, 30);
        ta.setBounds(170, 240, 390, 390);
        claculateParkingCharge();
        add(carid);
        add(idField);
        add(carno);
        add(noField);
        add(enth);
        add(enthField);

        add(entm);
        add(entmField);
        add(exth);
        add(exthField);
        add(extm);
        add(extmField);
        add(nv);
        add(sv);
        add(calcul);
        add(ta);

        setSize(600, 600);
        setVisible(true);
    }

    void claculateParkingCharge() {
        calcul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int enh = Integer.parseInt(enthField.getText());
                int enm = Integer.parseInt(entmField.getText());
                int exh = Integer.parseInt(exthField.getText());
                int exm = Integer.parseInt(extmField.getText());
                int totaltime = exh * 60 + exm - (enh * 60 + enm);
                if (nv.isSelected() == true) {
                    int charge = 0;
                    if (totaltime > 0 && totaltime < 10)
                        ta.setText("No parking charges required");
                    else if (totaltime > 10 && totaltime <= 30)
                        charge += 50;
                    else if (totaltime > 30 && totaltime <= 720)
                        charge += 80;
                    else if (totaltime > 720 && totaltime <= 1440)
                        charge += 120;
                    else
                        charge += 150;
                    ta.setText("Total charge is: " + charge);
                } else if (sv.isSelected() == true) {
                    int charge = 0;
                    if (totaltime > 0 && totaltime < 30)
                        ta.setText("No parking charges required");
                    else if (totaltime > 30 && totaltime <= 60)
                        charge += 45;
                    else if (totaltime > 60 && totaltime <= 720)
                        charge += 60;
                    else if (totaltime > 720 && totaltime <= 1440)
                        charge += 90;
                    else
                        charge += 120;
                    ta.setText("Total charge is: " + charge);

                }
            }
        });
    }

    public static void main(String[] args) {
        new IndAirport();
    }
}
