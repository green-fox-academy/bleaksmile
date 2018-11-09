import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        //1 XP Divide the canvas into 4/16/64 equal parts and repeat the line play pattern in each quarter

        int resolution = 25;
        int line = (int) (sqrt(resolution));
        int c = WIDTH / resolution / 10;
        int b = 0;
        int a = WIDTH / resolution / 10;

        for (int k = 0; k < line; k++) {


            for (int j = 1; j <= line; j++) {
                for (int i = 0; i <= WIDTH / line - c; i += c) {
                    graphics.setColor(Color.MAGENTA);
                    graphics.drawLine(i + a, b, j * (WIDTH / line), i + (k * WIDTH / line));
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(b, i + a, i + k * WIDTH / line, j * (WIDTH / line));

                }
                a += WIDTH / line;
                //  b += WIDTH/line;
            }
            a = WIDTH / resolution / 10;
            b += WIDTH / line;
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
