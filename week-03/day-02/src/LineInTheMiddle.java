import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class LineInTheMiddle {
        public static void mainDraw(Graphics graphics){
            // draw a red horizontal line to the canvas' middle.
            // draw a green vertical line to the canvas' middle.
            graphics.setColor(Color.RED);
            graphics.drawLine(100, 200, 300, 200);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(200, 100, 200, 300);


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
