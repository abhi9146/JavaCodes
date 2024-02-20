import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLayout(new FlowLayout());

		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}
}

public class MenuBars{

	public static void main(String[] args) {
		new MyFrame();
	}
}