import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        for (int j = 0; j < HEIGHT; j++) {
            for (int i = 0; i < WIDTH; i++) {
                lineDrawing(graphics, i , 0);
                i += 20;
            }
            lineDrawing(graphics, 0, j);
            j += 20;
        }

        for (int l = 0; l < HEIGHT; l++) {
            for (int k = 0; k < WIDTH; k++) {
                lineDrawing(graphics, k, 320);
                k += 20;
            }
            lineDrawing(graphics, 320, l);
            l += 20;
        }
    }

    public static int randomColor() { return ((int)(Math.random() * 256)); }

    public static void lineDrawing(Graphics g, int startingX, int startingY) {
        g.setColor(new Color(randomColor(), randomColor(), randomColor()));
        g.drawLine(startingX, startingY, 160, 160);
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
