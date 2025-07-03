package frame.awt;
import java.awt.*;
public class borderlayout extends Frame{
    borderlayout() {
        Button b1=new Button("North");
        Button b2=new Button("South");
        Button b3=new Button("East");
        Button b4=new Button("West");
        Button b5=new Button("Center");
        TextArea ta1= new TextArea("Enter text here",10,10);
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        add(ta1,BorderLayout.CENTER);
    }
    public static void main(String args[]) {
        borderlayout f1= new borderlayout();
        f1.setSize(600,600);
        f1.setVisible(true);
        f1.setLayout(new BorderLayout(10,10));
        f1.setTitle("Borderlayout demo");
    }
}
