package frame.awt;
import java.awt.*;
public class labeldemo extends Frame {
    labeldemo(String title) {
        super(title);
        String s1;
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        Label l1= new Label("India");
        Label l2= new Label("America");
        Label l3= new Label(l1.getText());
        l1.setText("Pankaj");
        s1=l1.getText();
        System.out.println("l1 text="+s1);
        s1=l2.getText();
        System.out.println("l2 text="+s1);
        s1=l3.getText();
        System.out.println("l3 text="+s1);
        add(l1);
        add(l2);
        add(l3);
    }
    public static void main(String args[]) {
        labeldemo f1= new labeldemo("1st label");
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());
    }
}
