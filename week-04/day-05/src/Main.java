import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {
      FraktalTriangle fraki = new FraktalTriangle();
      fraki.drawRecursion(graphics,0,0,300.0);

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
