import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {

        int squareSize = 10;
        int x = 10;
        int y = 10;

        for (int i = 1; i < 19; i++) {
            drawPurpleSquares(graphics, x * (i), y * i, squareSize);
            drawBlackSquares(graphics,x * (i), y * i, squareSize);
        }
    }

    public static void drawPurpleSquares(Graphics g, int x, int y, int size) {

        g.setColor(new Color (156, 47, 196));
        g.fillRect(x, y, size, size);
    }

    public static void drawBlackSquares(Graphics g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
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
