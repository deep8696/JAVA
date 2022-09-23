package workShop6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame{
	
	    private final JLabel printLabel; 
		private final JButton inputButton; 
		private final JButton readButton;
	
		public Interface() { 
			
			setLayout(new FlowLayout());
			
			printLabel = new JLabel("Select option !");
			add(printLabel);
			
			inputButton = new JButton("Enter Data");//button to take input
			add(inputButton);
			readButton = new JButton("Show Data");//button to show data			
			add(readButton);
			
			printLabel.setVerticalTextPosition(SwingConstants.CENTER);
			
			ButtonHandler dataReadHandler = new ButtonHandler();
			readButton.addActionListener(dataReadHandler);
			ButtonHandler dataWriteHandler = new ButtonHandler();		
			inputButton.addActionListener(dataWriteHandler);
		}
		
		private class ButtonHandler implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Show Data")) {  
					
					StudentDeserializeWithSwing textField = new StudentDeserializeWithSwing();
				      textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				      textField.setSize(450, 300); 
				      textField.setVisible(true); 
				     }		
			 else if(e.getActionCommand().equals("Enter Data")) {  
					
					StudentSerializeWithSwing textField = new StudentSerializeWithSwing();				
				      textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				      textField.setSize(450, 300); 
				      textField.setVisible(true);	
				}
			}
		}	
		 public static void main(String[] args)
		   { 
			 Interface frame = new Interface(); 
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setSize(300, 150); 
		      frame.setVisible(true); 
		     
		    }
		
}
