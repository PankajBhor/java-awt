package frame.awt;
import java.awt.*;
public class gridlayoutdemo extends Frame {
    gridlayoutdemo() {
        int i;
        setSize(1000,1000);
        setVisible(true);
        setLayout(new GridLayout(5,5,10,10)); // 3 rows, 2 columns, horizontal gap 10, vertical gap 10
        setTitle("Gridlayout demo");
        for(i=1;i<=25;i++) {
            add(new Button("Button"+i));
        }
    }
    public static void main(String args[]) {
        gridlayoutdemo f1=new gridlayoutdemo();  
    }         
}
