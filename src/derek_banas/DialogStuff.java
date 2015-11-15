package derek_banas;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class DialogStuff {
	public static void main(String[] args){
		JTextField xField = new JTextField(10);
		//Create and configure frame
		final JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		
		 JFrame.setDefaultLookAndFeelDecorated(true);
		    
		   // frame.setLayout(new FlowLayout());
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    String[] selections = { "green", "red", "orange", "dark blue" };
		    JList<?> list = new JList<Object>(selections);
		    
		    list.addMouseListener(new MouseAdapter() {
			    public void mouseClicked(MouseEvent evt) {
			        JList<?> list = (JList<?>)evt.getSource();
			        if (evt.getClickCount() == 2) {
	
			            // Double-click detected
			            int index = list.locationToIndex(evt.getPoint());
			            System.out.println(list.getSelectedValue());
			            JOptionPaneMultiInput.makeOptionPane();
			        } 
			    }
			});
		    
		    
		    frame.add(new JScrollPane(list));
		   // frame.pack();

		    frame.setVisible(true);
	}
}
