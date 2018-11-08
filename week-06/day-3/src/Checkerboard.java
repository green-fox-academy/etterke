import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        for (int j = 0; j < HEIGHT; j++) {
            for (int i = 0; i < WIDTH; i++) {
                if (j % 2 == 1) {
                    if (i % 2 == 1) {
                        graphics.setColor(Color.white);
                        graphics.fillRect(i, j, 40, 40);
                    }

                } else  {
                    if (i % 2 == 0) {
                        graphics.setColor(Color.white);
                        graphics.fillRect(i, j, 40, 40);
                    }
                }
                i += 40;
            }
            j += 40;
        }
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