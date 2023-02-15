import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel implements MouseListener {
    Color c1= Color.red;
    Color c2= Color.magenta;
    boolean color1= false;

    public Canvas(){
        this.setBackground(Color.green);
        addMouseListener(this);
        this.setSize(new Dimension(300,300));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICK!");
        System.out.println(e.getButton());
        if (e.getButton() == 1) {


            if (color1) {
                this.setBackground(c1);
            } else {
                this.setBackground(c2);
            }
            color1 = !color1;
        }else {
            this.setBackground(Color.blue);
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
