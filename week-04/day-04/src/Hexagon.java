import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

    public static void mainDraw(Graphics graphics) {
        hexagon(graphics, 600,600, 270.0);
    }
    public static void hexagon (Graphics graphics, int x, int y, double sidelength){
        if (sidelength<5){
            return;
        }
        int height = (int) (sidelength / 2 * sqrt(3));
        int sideInt = (int) sidelength;
        int halfSide = sideInt / 2;
        int[] arr1 = {x, x + sideInt, x + sideInt + halfSide, x + sideInt, x, x - halfSide};
        int[] arr2 = {y, y, y - height, y - 2 * height, y - 2 * height, y - height};
        graphics.drawPolygon(arr1, arr2, 6);
        hexagon(graphics,x,y,sidelength/2);
        hexagon(graphics,x,y-height,sidelength/2);
        hexagon(graphics, x+(int)sidelength*3/4,y-height/2,sidelength/2);

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
