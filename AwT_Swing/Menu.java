import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
    Menu() {
        setTitle("Menu example");
        setLayout(new FlowLayout());
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JLabel lab = new JLabel("HELLO");
        JMenu submenu = new JMenu("Submenu");
        JMenuItem i1 = new JMenuItem("1");
        JMenuItem i2 = new JMenuItem("2");
        JMenuItem i3 = new JMenuItem("3");
        JMenuItem i4 = new JMenuItem("4");
        menu.setMnemonic('M');
        // i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
        // ActionEvent.CTRL_MASK));
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lab.setText("Iam activating 1menuitem");
            }
        });
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        setJMenuBar(mb);
        add(lab);
        setVisible(true);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Menu();
    }
}
