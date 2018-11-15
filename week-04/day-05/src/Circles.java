import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics) {
        circles(graphics, 0, 0, 600);
    }

    public static void circles(Graphics graphics, int x, int y, int radius) {
        if (radius < 10) {
            return;
        }
        graphics.drawOval(x, y, radius, radius);
        circles(graphics, x + radius / 4, y, radius / 2);
        circles(graphics, x, y + radius / 3, radius / 2);
        circles(graphics, x + radius / 2, y + radius / 3, radius / 2);

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
