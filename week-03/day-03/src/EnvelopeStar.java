import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = WIDTH / 2;

        for (int i = 0; i < WIDTH / 2 - 10; i += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x, WIDTH / 2, WIDTH / 2, y);
            graphics.drawLine(WIDTH - x, WIDTH / 2, WIDTH / 2, y);
            graphics.drawLine(x, WIDTH / 2, WIDTH / 2, WIDTH / 2 + x);
            graphics.drawLine(WIDTH - x, WIDTH / 2, WIDTH / 2, WIDTH / 2 + x);
            x += 10;
            y -= 10;

        }
    }

    public static void drawing(Graphics graphics, int a, int b) {
        graphics.drawLine(a, b, WIDTH / 2, HEIGHT / 2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
