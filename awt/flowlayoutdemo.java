package frame.awt;
import java.awt.*;
public class flowlayoutdemo extends Frame {
    flowlayoutdemo() {
        setSize(600,600);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT,40,20));
        setTitle("Flowlayout demo");
        Button b1=new Button("Ok");
        Button b2=new Button("Cancel");           
        Button b3=new Button("Retry");
        add(b1);
        add(b2);
        add(b3);
    }
    public static void main(String args[]) {
        flowlayoutdemo f1=new flowlayoutdemo();
    }
}
