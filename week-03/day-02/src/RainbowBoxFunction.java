import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int size = WIDTH;

        for (int i = 0; i <WIDTH/5 ; i++){
            int [] array = new int[3];
            array[0] = (int)(Math.random()*255+1);
            array[1] = (int)(Math.random()*255+1);
            array[2] = (int)(Math.random()*255+1);

            squareDraw(graphics, size, array);
            size -= 5;
        }
    }

    public static void squareDraw (Graphics graphics, int a, int[] ar1){
        graphics.setColor(new Color (ar1[0], ar1[1], ar1[2]));
        graphics.fillRect(WIDTH/2-a/2, HEIGHT/2- a/2, a,a);

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