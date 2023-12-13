import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

class Person {
    String name;
    int macnt;
    int id;
}

class Batsman extends Person implements Comparable<Batsman> {
    int truns;
    float srate;

    Batsman(String name, int macnt, int id, int truns) {
        this.name = name;
        this.macnt = macnt;
        this.id = id;
        this.truns = truns;
        srate = (float) (truns / macnt);
    }

    public int compareTo(Batsman ob) {
        return (int) (ob.srate - srate);// descinding order..
    }
}

class Bowler extends Person implements Comparable<Bowler> {
    int wcnt;

    Bowler(String name, int macnt, int id, int wcnt) {
        this.name = name;
        this.macnt = macnt;
        this.id = id;
        this.wcnt = wcnt;
    }

    public int compareTo(Bowler b) {
        return (int) (b.wcnt - wcnt);
    }
}

class InvalidTextException extends Exception {
    InvalidTextException(String str) {
        super(str);
    }
}

class GUI extends JPanel implements Runnable {
    JFrame jf;

    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4;
    JRadioButton rb1, rb2;
    JTextArea ta1;
    ButtonGroup g;
    int x = 10;
    ArrayList<Batsman> al1 = new ArrayList<Batsman>();
    ArrayList<Bowler> al2 = new ArrayList<Bowler>();

    GUI() {
        jf = new JFrame("CRICKET BOARD");
        rb1 = new JRadioButton("BATSMAN");
        rb2 = new JRadioButton("BOWLER");

        t1 = new JTextField("Enter name");
        t2 = new JTextField("Enter id", 20);
        t3 = new JTextField("Enter match count", 20);
        t4 = new JTextField("Enter total runs or wickets taken", 20);
        JTextField t5 = new JTextField("search id", 20);
        b1 = new JButton("ADD");
        b2 = new JButton("SEARCH");
        b3 = new JButton("TOP 3 PLAYERS");
        b4 = new JButton("DISPLAY");
        g = new ButtonGroup();
        ta1 = new JTextArea(20, 40);

        setLayout(new FlowLayout());

        add(rb1);
        add(rb2);
        g.add(rb1);
        g.add(rb2);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);

        add(ta1);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (t1.getText().equals(null) || t2.getText().equals(null) || t3.getText().equals(null)
                            || t4.getText().equals(null)) {
                        throw new InvalidTextException("Please Fill all the necessary fields");

                    } else if (rb1.isSelected() == true) {
                        String n = t1.getText();
                        int x = Integer.parseInt(t2.getText());
                        int y = Integer.parseInt(t3.getText());
                        int z = Integer.parseInt(t4.getText());
                        Batsman bt = new Batsman(n, y, x, z);
                        al1.add(bt);
                        Collections.sort(al1);
                        ta1.append("object inserted\n");
                    } else {
                        String n = t1.getText();
                        int x = Integer.parseInt(t2.getText());
                        int y = Integer.parseInt(t3.getText());
                        int z = Integer.parseInt(t4.getText());
                        Bowler bo = new Bowler(n, y, x, z);
                        al2.add(bo);
                        Collections.sort(al2);
                        ta1.append("object inserted \n");
                    }
                } catch (InvalidTextException e) {
                    ta1.setText(e.getMessage());
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta1.append("search result\n");
                if (rb1.isSelected() == true) {
                    int flag = 0;
                    int x = Integer.parseInt(t5.getText());
                    Iterator<Batsman> i = al1.iterator();
                    while (i.hasNext()) {
                        Batsman ob = i.next();
                        if (ob.id == x) {
                            ta1.append("name: " + ob.name + "\n" + "srate: " + ob.srate + "\n" + "id: " + ob.id + "\n"
                                    + "match count: " + ob.macnt + "\n");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        ta1.append("DETAILS OF BATSMAN NOT FOUND\n");
                    }
                } else {
                    int flag = 0;
                    int x = Integer.parseInt(t5.getText());
                    Iterator<Bowler> i = al2.iterator();
                    while (i.hasNext()) {
                        Bowler ob = i.next();
                        if (ob.id == x) {
                            ta1.append("name: " + ob.name + "\n" + "wcnt: " + ob.wcnt + "\n" + "id: " + ob.id + "\n"
                                    + "match count: " + ob.macnt + "\n");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        ta1.setText("DETAILS OF BOWLER NOT FOUND");
                    }
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta1.append("TOP 3 PLAYERS\n");
                if (rb1.isSelected() == true) {
                    int c = 0;
                    for (Batsman ob : al1) {
                        if (c < 3) {
                            ta1.append("name: " + ob.name + "\n" + "srate: " + ob.srate + "\n" + "id: " + ob.id + "\n"
                                    + "match count: " + ob.macnt + "\n");
                            c++;
                        }
                    }
                } else {
                    int c = 0;
                    while (c < 3) {
                        for (Bowler ob : al2) {
                            ta1.append("name: " + ob.name + "\n" + "wcnt: " + ob.wcnt + "\n" + "id: " + ob.id + "\n"
                                    + "match count: " + ob.macnt + "\n");
                            c++;
                        }
                    }
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (rb1.isSelected() == true) {
                    for (Batsman ob : al1)
                        ta1.append("name: " + ob.name + "\n" + "srate: " + ob.srate + "\n" + "id: " + ob.id + "\n"
                                + "match count: " + ob.macnt + "\n");
                } else {
                    for (Bowler ob : al2)
                        ta1.append("name: " + ob.name + "\n" + "wcnt: " + ob.wcnt + "\n" + "id: " + ob.id + "\n"
                                + "match count: " + ob.macnt + "\n");
                }
            }
        });

        t1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent fe) {
                t1.setText("");
            }

            // public void focusLost(FocusEvent e) {
            // t1.setText("Enter Name");
            // }
        });

        t2.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent fe) {
                t2.setText("");
            }
        });

        t3.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent fe) {
                t3.setText("");
            }
        });

        t4.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent fe) {
                t4.setText("");
            }
        });

        t5.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent fe) {
                t5.setText("");
            }
        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {
        /*
         * javax.swing.Timer timer = new Timer(1000, e -> {
         * if (x < 390)
         * x += 10;
         * else
         * x = 0;
         * repaint();
         * });
         * timer.start();
         */
        for (;;) {
            if (x < 400)
                x += 10;
            else
                x = 10;
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Welcome To Bcci Board", x, 390);
    }

    public static void main(String arg[]) {
        GUI gui = new GUI();
        JFrame jf = new JFrame("cricket");
        jf.add(gui);
        jf.setSize(400, 400);
        jf.setVisible(true);

        Thread t = new Thread(gui);
        t.start();
    }
}