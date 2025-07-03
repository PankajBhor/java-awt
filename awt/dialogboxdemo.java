package frame.awt;
import java.awt.*;
public class dialogboxdemo extends Frame{
    public static void main(String args[]) {
        dialogboxdemo f1= new dialogboxdemo();
        f1.setVisible(true);
        f1.setSize(800,600);
        f1.setTitle("Parent Frame");

        Dialog d1= new Dialog(f1,"Child frame",false);
        d1.setSize(200,300);
        d1.setVisible(true);
        d1.setLayout(new FlowLayout());
        d1.add(new Button("Ok"));
        d1.add(new Button("Cancel"));
    }
}
