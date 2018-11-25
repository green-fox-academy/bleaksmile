import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

    public static void mainDraw(Graphics graphics) {
        grid(graphics,0,0,18,250);

    }
    public static void grid (Graphics graphics, int x, int y, int height, int width){
        if (width<10 || height<2){
            return;
        }
        graphics.fillRect(x+width/2,y+width/2,width+height/2,height);
        graphics.fillRect(x+width/2,y+width*3/2,width+height/2,height);
        graphics.fillRect(x+width/2,y+width/2,height,width+height);
        graphics.fillRect(x+width*3/2,y+width/2,height,width+height/2);

        grid(graphics,x,y,height/2,width/2);
        grid(graphics,x,y+width,height/2,width/2);
        grid(graphics,x+width,y+width,height/2,width/2);
        grid(graphics,x+width,y,height/2,width/2);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
