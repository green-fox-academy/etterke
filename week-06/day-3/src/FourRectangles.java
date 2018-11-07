import com.sun.javafx.collections.ArrayListenerHelper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        ArrayList<Integer> CoordX1 = new ArrayList<>();
        ArrayList<Integer> CoordY1 = new ArrayList<>();
        ArrayList<Integer> rectWidth = new ArrayList<>();
        ArrayList<Integer> rectLength = new ArrayList<>();
        ArrayList<Integer> redColor = new ArrayList<>();
        ArrayList<Integer> greenColor = new ArrayList<>();
        ArrayList<Integer> blueColor = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            redColor.add(i, (int) (Math.random() * 255));
            greenColor.add(i, (int) (Math.random() * 255));
            blueColor.add(i, (int) (Math.random() * 255));
            CoordX1.add(i, (int) (Math.random() * 320));
            CoordY1.add(i, (int) (Math.random() * 320));
            rectWidth.add(i, (int) (Math.random() * 320));
            rectLength.add(i, (int) (Math.random() * 320));
        }

        for (int j = 0; j < CoordX1.size(); j++) {
            randomRectanglesColor(graphics, redColor.get(j), greenColor.get(j), blueColor.get(j));
            randomRectangles(graphics, CoordX1.get(j), CoordY1.get(j), rectWidth.get(j), rectLength.get(j));
        }

    }

    public static void randomRectangles(Graphics g, int startingX, int startingY, int width, int length) {

        g.fillRect(startingX, startingY, width, length);
    }

    public static void randomRectanglesColor(Graphics g, int red, int green, int blue) {

        g.setColor(new Color(red, green, blue));
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
