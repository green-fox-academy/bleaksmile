import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

    public static void mainDraw(Graphics graphics) {
        int x = 300;
        int y = 300;
        double sidelength = 30.0;
        int height = (int) (sidelength / 2 * sqrt(3));
        int sideInt = (int) sidelength;
        int halfSide = sideInt / 2;
        int counter1 = 7;
        int counter2 = 7;
        int n = 6;
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 8 - j; i++) {
                int[] arr1 = {x, x + sideInt, x + sideInt + halfSide, x + sideInt, x, x - halfSide};
                int[] arr2 = {y, y, y - height, y - 2 * height, y - 2 * height, y - height};
                graphics.drawPolygon(arr1, arr2, n);
                y += (2 * height);
            }

            y = y - counter2 * (height * 2) + height;
            x = (x - sideInt - halfSide);
            counter2--;

        }
        int a = 300;
        int b = 300;
        for (int k = 1; k <= 4; k++) {
            for (int i = 1; i <= 8 - k; i++) {
                int[] arr1 = {a, a + sideInt, a + sideInt + halfSide, a + sideInt, a, a - halfSide};
                int[] arr2 = {b, b, b - height, b - 2 * height, b - 2 * height, b - height};
                graphics.drawPolygon(arr1, arr2, n);
                b += (2 * height);
            }

            b = b - counter1 * (height * 2) + height;
            a = (a + sideInt + halfSide);
            counter1--;

        }
    }


    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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