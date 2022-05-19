import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Display {
    public Display() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Display");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                BufferedImage img = null;

                try {
                    img = ImageIO.read(getClass().getResource("/image.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(1);
                }

                ImageIcon imgIcon = new ImageIcon(img);
                JLabel lbl = new JLabel();
                lbl.setIcon(imgIcon);
                frame.getContentPane().add(lbl, BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        new Display();
    }
}