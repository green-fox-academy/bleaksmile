import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.


        int rand2;
        int weight;
        int height;
        int r;
        int g;
        int b;
        int rand1;

        for (int i = 0; i <4 ; i++) {
            r = (int)(Math.random()*255+1);
            g = (int)(Math.random()*255+1);
            b = (int)(Math.random()*255+1);
            rand1 = (int) (Math.random()*WIDTH/2);
            rand2 = (int) (Math.random()*WIDTH/2);;
            weight = (int) (Math.random()*WIDTH/2);
            height = (int) (Math.random()*WIDTH/2);
            drawRect(graphics,rand1, rand2, r,g,b,weight,height);
        }


    }
    public static void drawRect (Graphics graphics, int a, int b, int r1, int g1, int b1, int w, int h){
        graphics.setColor(new Color(r1,g1,b1));
        graphics.drawRect(a,b,w,h);

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