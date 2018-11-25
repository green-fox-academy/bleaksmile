import java.awt.*;

import static java.lang.Math.sqrt;

public class FraktalTriangle {

    public FraktalTriangle() {
    }

    public void drawFraktal(Graphics graphics) {
        drawRecursion(graphics, 0, 0, 300.0);
    }


    public void drawRecursion(Graphics graphics, int x, int y, double sidelength) {
        if (sidelength < 2) {
            return;
        }
        Triangle triangle = new Triangle(x, y, sidelength);
        triangle.triangles(graphics);
        drawRecursion(graphics, x, y, sidelength / 2);
        drawRecursion(graphics, x + (int) sidelength, y, sidelength / 2);
        drawRecursion(graphics, x + (int) sidelength / 2, y + (int) (sidelength / 2 * sqrt(3)), sidelength / 2);
    }
}
