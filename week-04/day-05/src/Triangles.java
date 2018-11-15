import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        triangles(graphics,0,0,300.0);

    }
    public static void triangles (Graphics graphics, int x, int y, double sidelength){
        if (sidelength<5){
            return;
        }
        int height = (int) (sidelength / 2 * sqrt(3));
        int[]xPoints = {x+(int)sidelength,x+(int)sidelength/2,x+(int)sidelength*3/2 };
        int [] yPoints = {y, y+height,y+height};
        graphics.drawPolygon(xPoints,yPoints,3);
        triangles(graphics, x,y,sidelength/2);
        triangles(graphics, x+(int)sidelength,y,sidelength/2);
        triangles(graphics, x +(int)sidelength/2,y+height,sidelength/2);


    }

    // Don't touch the code below
    static int WIDTH = 1200;
    static int HEIGHT = 1200;

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
