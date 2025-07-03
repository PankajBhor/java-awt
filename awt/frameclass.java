package frame.awt;
import java.awt.*;
public class frameclass extends Frame {
    public static void main(String args[]) {
        Frame f1 = new Frame("frame 1 main frame");
        f1.setLayout(new FlowLayout());           //f1.setLayout(null);
        f1.setVisible(true);         
        f1.setSize(300, 300);
        Button b1=new Button("Frame 1 button");
        //b1.setBounds(50, 50, 100, 50); if you want to set the position of the button in the frame not needeed when there layout is selected
        f1.add(b1);
    }
}