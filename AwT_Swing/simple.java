
import java.awt.*;

import java.util.concurrent.Flow;

class simple extends Frame {
    simple() {
        // without inheriting we can write like: Frame frame=new Frame();
        Button bt = new Button("Click");
        bt.setBounds(50, 50, 100, 32);
        Button bt2 = new Button("Dontclikme");

        Label label = new Label("This is a Label");
        // to get input from user
        TextField textField = new TextField("Enter your text");
        TextArea textArea = new TextArea("Enter your paragraph");// all inputs are strings
        Checkbox checkbox = new Checkbox("Male");
        Choice choice = new Choice();
        choice.add("India");
        choice.add("Newzeland");
        choice.add("Australia");
        choice.add("SouthAfrica");
        add(choice);
        add(checkbox);
        setLayout(new FlowLayout());// used to arrange the components side by side if null is not given go for
        // setbounds(4 parameters)
        add(textArea);
        add(textField);
        add(bt);
        add(bt2);
        add(label);
        setVisible(true);
        setSize(200, 200);
        setTitle("Simple Application");
    }

    public static void main(String[] args) {
        new simple();
    }

}
