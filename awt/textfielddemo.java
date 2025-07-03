package frame.awt;
import java.awt.*;
public class textfielddemo extends Frame {
    textfielddemo(String title) {
        super(title);
        setLayout(null);
        setVisible(true);
        setSize(800,800);
        Label l1= new Label("Username");
        Label l2= new Label("Password");
        TextField t1=new TextField("Enter Username",30);
        TextField t2=new TextField("Enter Password",30);
        Button b1=new Button("Login");
        t1.select(0,13);
        t2.select(0,13);
        t2.setEchoChar('*');
        l1.setBounds(50,60,120,30);
        l2.setBounds(50,100,120,30);
        t1.setBounds(180,60,120,30);
        t2.setBounds(180,100,120,30);
        b1.setBounds(120,140,120,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
    }
    public static void main(String args[]) {
        textfielddemo tfd1=new textfielddemo("Login Page");
    }
}
