import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    public static void mainDraw(Graphics graphics) {
        rectangles(graphics,0,0,WIDTH/3);

    }
    public static void rectangles (Graphics graphics, int x, int y, double sidelength){
        if (sidelength<1){
            return;
        }
        graphics.fillRect(x+(int)sidelength,y+(int)sidelength,(int)sidelength,(int)sidelength);
        rectangles(graphics,x, y+(int)sidelength, sidelength/3);
        rectangles(graphics,x+(int)sidelength*2, y+(int)sidelength, sidelength/3);
        rectangles(graphics,x+(int)sidelength, y+(int)sidelength*2, sidelength/3);
        rectangles(graphics,x+(int)sidelength, y, sidelength/3);
        rectangles(graphics,x, y, sidelength/3);
        rectangles(graphics,x+(int)sidelength*2, y, sidelength/3);
        rectangles(graphics,x, y+(int)sidelength*2, sidelength/3);
        rectangles(graphics,x+(int)sidelength*2, y+(int)sidelength*2, sidelength/3);


    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
