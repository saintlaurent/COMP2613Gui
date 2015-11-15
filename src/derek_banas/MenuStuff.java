package derek_banas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class MenuStuff {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(400,  400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenuItem exit = new JMenuItem("Exit");
		
		file.add(exit);
		
		JMenu edit = new JMenu("Edit");
		JMenu test = new JMenu("Test");
		menuBar.add(test);
		menuBar.add(edit);
		
		
		frame.setJMenuBar(menuBar);
		
	}
	class MenuActionListener implements ActionListener {
		
		  public void actionPerformed(ActionEvent e) {
		    System.out.println("Selected: " + e.getActionCommand());

		  }
		}
}
