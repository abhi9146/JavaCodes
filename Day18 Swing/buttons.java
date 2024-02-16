import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    MyFrame(){
        btn=new JButton();
        btn.setBounds(200,100,100,50);
        btn.addActionListener(this);

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
        }
    }
}

public class buttons {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(null);
    }
}
