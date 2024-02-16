import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("Abhishek");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon image=new ImageIcon("Anime.jpg");
        frame.setIconImage(image.getImage());
        frame.setSize(240,240);

        frame.getContentPane().setBackground(new Color(123,23,13));
    }
}
