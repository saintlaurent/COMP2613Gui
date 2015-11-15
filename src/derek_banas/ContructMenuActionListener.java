package derek_banas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MenuActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("Selected: " + e.getActionCommand());

  }
}

public class ContructMenuActionListener {
  public static void main(final String args[]) {
    JFrame frame = new JFrame("MenuSample Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JMenuBar menuBar = new JMenuBar();

    // File Menu, F - Mnemonic
    JMenu fileMenu = new JMenu("File");
    fileMenu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(fileMenu);
    
    JMenu testMenu = new JMenu("Test");
    menuBar.add(testMenu);

    // File->New, N - Mnemonic
    JMenuItem newMenuItem = new JMenuItem("New");
    newMenuItem.addActionListener(new MenuActionListener());
    fileMenu.add(newMenuItem);

    frame.setJMenuBar(menuBar);
    frame.setSize(350, 250);
    frame.setVisible(true);
  }
}