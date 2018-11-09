import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        int x = 50;
        int y = 600;
        double sidelength = 30.0;
        int height = (int) (sidelength / 2 * sqrt(3));
        int sideInt = (int) sidelength;
        int halfSide = sideInt / 2;
        int counter = 21;
        int n = 3;
        for (int j = 1; j <= 21; j++) {
            for (int i = 1; i <= 22 - j; i++) {
                int[] arr1 = {x, x + sideInt, x + halfSide};
                int[] arr2 = {y, y, y - height};
                graphics.drawPolygon(arr1, arr2, n);
                x += sideInt;
            }

            y -= height;
            x -= counter * sideInt - halfSide;
            counter--;

        }
    }
    // graphics.drawLine(x, y,x+halfSide, y+ height);// the top
    // graphics.drawLine(x+halfSide, y+ height, x+halfSide-sideInt,y+ height);
    //graphics.drawLine(x+halfSide-sideInt,y+ height, x,y); // right side


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