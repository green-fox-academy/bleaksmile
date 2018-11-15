import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {

    public static void mainDraw(Graphics graphics) {
        rectangle(graphics, WIDTH/3,0,0);
    }
    public static void rectangle (Graphics graphics,int a, int x, int y){
        if (a<2) {
            return;
        }
        graphics.drawRect(x,y,a,a);
        graphics.drawRect(x+a,y,a,a);
        rectangle(graphics,a/3,x+a,y);
        graphics.drawRect(x+2*a,y,a,a);
        graphics.drawRect(x,y+a, a,a);
        rectangle(graphics,a/3,x,y+a);
        graphics.drawRect(x+a,y+a,a,a);
        graphics.drawRect(x+2*a,y+a,a,a);
        rectangle(graphics, a/3,x+2*a,y+a);
        graphics.drawRect(x,y+2*a,a,a);
        graphics.drawRect(x+a,y+2*a,a,a);
        rectangle(graphics,a/3,x+a,y+2*a);
        graphics.drawRect(x+2*a,y+2*a,a,a);


    }

    // graphics.drawLine(x, y,x+halfSide, y+ height);// the top
    // graphics.drawLine(x+halfSide, y+ height, x+halfSide-sideInt,y+ height);
    //graphics.drawLine(x+halfSide-sideInt,y+ height, x,y); // right side


    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}
