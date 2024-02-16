import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;

public class labels {
    public static void main(String[] args) {
       
        ImageIcon image=new ImageIcon("anime.jpg");
        Border border=BorderFactory.createLineBorder(Color.green,3);

        JLabel label=new JLabel("Dragon Ball - Z");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setForeground(new Color(0x00FF00));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(border);
        label.setBackground(Color.black);
        label.setOpaque(true);
         
        label.setBounds(100,100,250,250);


        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("Abhishek");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();
   
    }
}
