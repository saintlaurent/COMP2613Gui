package derek_banas;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class JavaLessonTwenty extends JFrame{
	public static void main(String[] args){
		new JavaLessonTwenty();
		
	}
	
	public JavaLessonTwenty(){
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("My First Frame");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		JLabel theLabel = new JLabel("Hello this is a label");
		thePanel.add(theLabel);
		this.add(thePanel);
	}
}
