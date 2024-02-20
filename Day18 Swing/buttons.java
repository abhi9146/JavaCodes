import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    MyFrame(){

        ImageIcon img=new ImageIcon("Anime.jpg");
        
        btn=new JButton();
        btn.setBounds(200,100,250,100);
        btn.addActionListener(this);
        btn.setText("Click");
        btn.setFocusable(false);
        btn.setIcon(img);
        // btn.setHorizontalTextPosition(JButton.RIGHT);
        // btn.setVerticalTextPosition(JButton.BOTTOM);
        btn.setFont(new Font("Comic sans", Font.BOLD,25));
        btn.setForeground(Color.black);
        btn.setBackground(Color.lightGray);
        btn.setBorder(BorderFactory.createEtchedBorder());



        this.setVisible(true);
        this.setTitle("Abhishek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(500,500);
        this.add(btn);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("HII");
            //btn.setEnabled(false);
        }
    }
}

public class buttons {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(null);
    }
}
