import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    JTextField textField;
    MyFrame(){

        btn=new JButton("Submit");
        btn.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));

        this.setTitle("Abhishek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.add(btn);
        this.add(textField);
        this.pack();
        this.setVisible(true);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("WELCOME "+textField.getText());
        }
    }
}


public class TextFields {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
