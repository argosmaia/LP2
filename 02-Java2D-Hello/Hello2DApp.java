import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// COLOQUEI ALGUMAS LINHAS E UM TEXTO
public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}
class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Foto");
        this.setSize(1024, 720);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.blue);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);

        g2d.setColor(Color.BLUE);

        g2d.drawString("Hello World! BEM VINDO AO JAVA 2D", 360, 360);
        g2d.drawString("GOAL", 400, 200);
        g2d.drawRect(100,100,w,h);
        g2d.drawRoundRect(500, 500, w, h, 500, 500);
    }
}
