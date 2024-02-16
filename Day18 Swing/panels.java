import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panels {
    public static void main(String[] args) {
        JLabel label=new JLabel("Dragon Ball-Z");
        ImageIcon img=new ImageIcon("Anime.jpg");
        label.setIcon(img);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(20);
        // panels
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel=new JPanel();
        greenPanel.add(label);
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,400);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("Abhishek");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);

        frame.setSize(750,750);
    }
}
