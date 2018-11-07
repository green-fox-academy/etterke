import sun.plugin2.util.ColorUtil;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.*;

public class HorizontalLines {

    public static void mainDraw(Graphics graphics) {

        ArrayList<Integer> CoordX1 = new ArrayList<>();
        ArrayList<Integer> CoordY1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            CoordX1.add(i, (int) (Math.random() * 270));
            CoordY1.add(i, (int) (Math.random() * 320));
        }

        for (int j = 0; j < CoordX1.size(); j++) {
            lineDrawing(graphics, CoordX1.get(j), CoordY1.get(j));
        }
    }

    public static void lineDrawing(Graphics g, int startingX, int startingY) {

        g.setColor(new Color(75, 104, 78));
        g.drawLine(startingX, startingY, (startingX + 50), startingY);
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
