import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyInternalFrame extends JInternalFrame{
    JTextArea ta;
    JScrollPane sp;
    static int cnt=0;
    MyInternalFrame(){
        super("Document "+(++cnt),true,true,true,true);

        ta=new JTextArea();
        sp=new JScrollPane();
        add(sp);

        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu();
        JMenuItem m1=new JMenuItem();
        
        file.add(m1);mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}

class MyFrame extends JFrame implements ActionListener {
     JDesktopPane jp;
     MyFrame(){
        jp=new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem m1=new JMenuItem();

        d.add(m1);mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame mframe=new MyInternalFrame();
        jp.add(mframe);
    }
}
public class Internal {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
