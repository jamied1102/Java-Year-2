package com.Lab6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class GameGUI extends JFrame implements ActionListener, MouseListener
{


		  private JLabel label1;
		  private JLabel label2;
		  private JButton button1;
		  private JButton button2;
//		  private JButton button3;
		  private JTextField t1;
		  private int number = 1000;
		  private int number2;
		  private int guess;
		  private boolean t;
		  Random rnd = new Random();
		  		  	 
		  // Constructor
	  
		  public GameGUI (String title)
		  {
			  // set the title
			   super(title);
			
			   // sets the screen layout  - in this case, border layout
			   setLayout(new FlowLayout());
			   
			   // create a label
			   label1  = new JLabel("Then make a guess");
			   label2 = new JLabel("the pannel is here");
			   button1 = new JButton("Generate the random number");
			   button2 = new JButton("check your guess");
//			   button2 = new JButton("check your guess");
			   
			   t1 = new JTextField("enter your guess");
			   t1.setBounds(50, 100, 200, 30);
			   t1.setToolTipText("enter guess here after generating  number");
			   button1.addActionListener(this);
			   button2.addActionListener(this);
			   t1.addActionListener(this);
			   label2.addMouseListener(this);
			   // create a section of screen (panel) that will hold some GUI components 
			   JPanel myPanel = new JPanel();
			   JPanel myPanel2 = new JPanel();
			   JPanel myPanel3 = new JPanel();
			   // add the label we created to the panel 
			   myPanel.add(button1);
			   myPanel2.add(label1);      
			   myPanel2.add(t1);
			   myPanel3.add(button2);
			
			   
			   // add the panel to the screen  - uses the add() method of JFrame to do this. 
			   add(myPanel, BorderLayout.NORTH);
			   add(myPanel2, BorderLayout.CENTER);
			   add(myPanel3, BorderLayout.SOUTH);
				// set the location of the screen  
			   setLocation(100,100);

			   // Define the size of the frame  
			   setSize(300,400);
			   
			   // make the screen appear - without this, it doesn't!  
			   setVisible(true);
			   
			 
			 
				   
			  
		 }

		@Override
		public void actionPerformed(ActionEvent event)
		{
			this.t = t1.getText().matches("\\d+"); 
			if(event.getSource() == t1)
			{
				System.out.println(t1.getText());
				if(this.t == false )
				{
					
					JOptionPane.showMessageDialog(this, "Enter a number between 1 an 100");
						
				}
				
			}
			if(event.getSource() == button1)
			{
				this.number = rnd.nextInt(100);
				JOptionPane.showMessageDialog(this, "Number Generated");
				System.out.println(number);
				
			}
			if(event.getSource()== button2)
			{
				this.number2 = Integer.parseInt(t1.getText());
				
				

				if(this.number == 1000)
				{
					
					JOptionPane.showMessageDialog(this, "Generate a number first");
					System.out.println(number2);	
				}
				else	if(this.number2 == this.number)
				{
					this.guess = this.guess+1;
					JOptionPane.showMessageDialog(this, "Correct it took you "+guess+" guesses");
					System.out.println(number2);	
				}
				else	if(this.number2 > this.number)
				{
					this.guess = this.guess+1;
					JOptionPane.showMessageDialog(this, "too high");
					System.out.println(number2);	
				}
				else	if(this.number2 < this.number)
				{
					this.guess = this.guess+1;
					JOptionPane.showMessageDialog(this, "too low");
					System.out.println(number2);	
				}
				
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
			
		}

		@Override
		public void mouseExited(MouseEvent event)
		{
			
		}

		@Override
		public void mousePressed(MouseEvent event)
		{
			
		}

		@Override
		public void mouseReleased(MouseEvent event) 
		{
			// TODO Auto-generated method stub
			
		}
}	
		
		  

			
