package frame.awt;
import java.awt.*;
public class menudemo extends Frame {
    menudemo(String title) {
        super(title);
        MenuBar m1=new MenuBar();

        Menu m11=new Menu("File");

        Menu m12=new Menu("Edit");
        CheckboxMenuItem m121= new CheckboxMenuItem("cut");
        CheckboxMenuItem m122= new CheckboxMenuItem("copy");
        CheckboxMenuItem m123= new CheckboxMenuItem("paste");
        CheckboxMenuItem m124= new CheckboxMenuItem("Select All");
        m12.add(m121);
        m12.add(m122);
        m12.add(m123);
        m12.add(m124);

        Menu m13=new Menu("Help");

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);

        setMenuBar(m1);
    }
    public static void main(String args[]) {
        menudemo c1= new menudemo("menudemo");
        c1.setVisible(true);
        c1.setSize(600,700);
        c1.setLayout(new FlowLayout());
    }
}