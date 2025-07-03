package frame.awt;
import java.awt.*;
public class checkboxdemo extends Frame {
    checkboxdemo(String title) {
        super(title);
        setVisible(true);
        setSize(600,700);
        setLayout(new FlowLayout());
        CheckboxGroup cbg1= new CheckboxGroup();
        Checkbox c1=new Checkbox("India",false,cbg1);
        Checkbox c2=new Checkbox("America",false,cbg1);
        Checkbox c3=new Checkbox("UK",false,cbg1);
        c1.setState(true);
        add(c1);
        add(c2);
        add(c3);
    }
    public static void main(String args[]) {
        checkboxdemo c1= new checkboxdemo("checkboxdemo");
    }
}
