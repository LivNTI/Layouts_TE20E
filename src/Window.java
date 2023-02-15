import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){

        this.setTitle("Fun with layouts");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(2,4));
        for(int i=0; i<2*4;i++){
            this.add(new Canvas());
        }


        this.pack();
        this.setVisible(true);
    }


}
