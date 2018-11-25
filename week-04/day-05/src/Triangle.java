import java.awt.*;

import static java.lang.Math.sqrt;

public class Triangle {
    private int xCoordinate;
    private int yCoorinate;
    private double sidelenght;

    public Triangle(int xCoordinate, int yCoorinate, double sidelenght) {
        this.xCoordinate = xCoordinate;
        this.yCoorinate = yCoorinate;
        this.sidelenght = sidelenght;
    }

    public void triangles(Graphics graphics) {
        int height = (int) (sidelenght / 2 * sqrt(3));
        int[] xPoints = {xCoordinate + (int) sidelenght, xCoordinate + (int) sidelenght / 2, xCoordinate + (int) sidelenght * 3 / 2};
        int[] yPoints = {yCoorinate, yCoorinate + height, yCoorinate + height};
        graphics.drawPolygon(xPoints, yPoints, 3);
    }
}
