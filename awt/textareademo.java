package frame.awt;
import java.awt.*;
public class textareademo extends Frame {
    textareademo(String title) {
        super(title);
        setVisible(true);
        setSize(600,700);
        setLayout(new FlowLayout());
        TextArea t1=new TextArea("Write your feedback",20,20,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
        add(t1);
    }
    public static void main(String args[]) {
        textareademo c1= new textareademo("textarea demo");
    }
}