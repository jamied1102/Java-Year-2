package com.lab5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class myFirstGui extends JFrame implements ActionListener, MouseListener
{


		  private JLabel label1;
		  private JLabel label2;
		  private JButton button1;
		  private JButton button2;
		  private JScrollBar bar1;
		  private JTextField t1;
		  		  	 
		  // Constructor
	  
		  public myFirstGui (String title)
		  {
			  // set the title
			   super(title);
			
			   // sets the screen layout  - in this case, border layout
			   setLayout(new BorderLayout());
			   
			   // create a label
			   label1  = new JLabel("Just this label on screen");
			   label2 = new JLabel("the pannel is here");
			   button1 = new JButton("press me");
			   button2 = new JButton("press me");
			   bar1 = new JScrollBar();
			   t1 = new JTextField("enter name");
			   t1.setBounds(50, 100, 200, 30);
			   t1.setToolTipText("enter name here");
			   button1.addActionListener(this);
			   button2.addActionListener(this);
			   t1.addActionListener(this);
			   label2.addMouseListener(this);
			   // create a section of screen (panel) that will hold some GUI components 
			   JPanel myPanel = new JPanel();
			   JPanel myPanel2 = new JPanel();
			   JPanel myPanel3 = new JPanel();
			   JPanel myPanel4 = new JPanel();
			   // add the label we created to the panel 
			   myPanel.add(label1); 
			   myPanel2.add(button1); 
			   myPanel3.add(button2);
			   myPanel3.add(bar1);
			   myPanel2.add(t1);
			   myPanel4.add(label2);
			   myPanel4.setBackground(Color.RED);
			   myPanel4.setBounds(100, 100, 20, 20);
			   
			   // add the panel to the screen  - uses the add() method of JFrame to do this. 
			   add(myPanel, BorderLayout.CENTER);
			   add(myPanel2, BorderLayout.NORTH);
			   add(myPanel3, BorderLayout.EAST);
			   add(myPanel4, BorderLayout.SOUTH);
				// set the location of the screen  
			   setLocation(100,100);

			   // Define the size of the frame  
			   setSize(500,400);
			   
			   // make the screen appear - without this, it doesn't!  
			   setVisible(true);
			   
			 
			 
				   
			  
		 }

		@Override
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == button1)
			{
				JOptionPane.showMessageDialog(this, "button1 clicked");
			}
			if(event.getSource()== button2)
			{
				JOptionPane.showMessageDialog(this, "button2 clicked");
			}
			if(event.getSource() == t1)
			{
				System.out.println(t1.getText());
				JOptionPane.showMessageDialog(this, t1.getText());
			}
			
		}
		


		@Override
		public void mouseClicked(MouseEvent event)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent event)
		{
			if(event.getSource() == label2)
			{
				JOptionPane.showMessageDialog(this, "Entered the panel");
			}
			
		}

		@Override
		public void mouseExited(MouseEvent event)
		{
			if(event.getSource() == label2)
			{
				JOptionPane.showMessageDialog(this, "Left the panel");
			}
		}

		@Override
		public void mousePressed(MouseEvent event)
		{
			if(event.getSource() == label2)
			{
				JOptionPane.showMessageDialog(this, "clicked");
			}
			if(event.getButton()==MouseEvent.BUTTON1)
			{
				JOptionPane.showMessageDialog(this, "left button clicked");
			}
			if(event.getButton()==MouseEvent.BUTTON3)
			{
				JOptionPane.showMessageDialog(this, "right button clicked");
			}
		}

		@Override
		public void mouseReleased(MouseEvent event) 
		{
			// TODO Auto-generated method stub
			
		}
}	
		
		  

			
