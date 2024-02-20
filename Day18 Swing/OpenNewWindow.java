import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class NewWindow{
    JFrame frame=new JFrame();
    JLabel label=new JLabel("Hello");

    NewWindow(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}

class launchPage implements ActionListener{
    JFrame frame=new JFrame();
    JButton btn=new JButton("New Window");

    launchPage(){
        btn.setBounds(100,160,200,40);
        btn.setFocusable(false);
        btn.addActionListener(this);

        frame.add(btn);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btn){
           frame.dispose();
           NewWindow win=new NewWindow();
       }
    }
}

public class OpenNewWindow {
    public static void main(String[] args) {
        launchPage lp=new launchPage();
    }
}
