package frame.awt;
import java.awt.*;
public class frameconstructor extends Frame {
    frameconstructor(String title) {
        super(title);
        setSize(300,300);
        setVisible(true);
        setLocation(200,200);
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        Button b2=new Button("Frame 2 button");
        add(b2);
    }
    public static void main(String args[]) {
        frameconstructor f2= new frameconstructor("frame 2 using constructor");
        //b2.setBounds(50, 50, 100, 50);    // if you want to set the position of the button in the frame not needed when there layout is selected
    }
}