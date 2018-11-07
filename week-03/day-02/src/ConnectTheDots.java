import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        int [][] arr1 = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        // Connect these:
        int[][] arr ={{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}};
        draw(graphics,arr);
        draw(graphics,arr1);


    }
    public static void draw(Graphics graphics, int [][]input){
        int [] xpoints = new int [input.length];
        int [] ypoints = new int [input.length];
        int npoints = input.length;
        for (int i = 0; i <input.length ; i++) {
            xpoints[i]= input[i][0];
            ypoints[i] = input[i][1];

        }
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(xpoints, ypoints, npoints);

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