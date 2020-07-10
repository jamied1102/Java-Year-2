package com.lab8;

import java.awt.BorderLayout;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame  implements ActionListener, MouseListener
{
	private String firstName;
	private String surName;
	private String age;
	private JButton button1;
	private JButton button2;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextArea t4;
	
	
	 public GUI (String title)
	  {
		 
		  // set the title
		   super(title);
		
		   // sets the screen layout  - in this case, border layout
		   setLayout(new FlowLayout());
		   
		   // create a label
		   button1 = new JButton("Save");
		   button2 = new JButton("Show list");
		   
		   
		   
		   t1 = new JTextField("enter firstname");
		   t1.setBounds(50, 100, 200, 30);
		   t2 = new JTextField("enter surname");
		   t2.setBounds(50, 100, 200, 30);
		   t3 = new JTextField("enter age");
		   t3.setBounds(50, 100, 200, 30);
		   button1.addActionListener(this);
		   button2.addActionListener(this);
		   t1.addActionListener(this);
		   t2.addActionListener(this);
		   t3.addActionListener(this);
		   // create a section of screen (panel) that will hold some GUI components 
		   JPanel myPanel = new JPanel();
		   JPanel myPanel2 = new JPanel();
		   // add the label we created to the panel 
		   myPanel.add(t1);      
		   myPanel.add(t2);
		   myPanel.add(t3);
		   myPanel.add(button1);
		   myPanel.add(button2);
	//	   myPanel2.add(t4);
		   
		   // add the panel to the screen  - uses the add() method of JFrame to do this. 
		   add(myPanel, BorderLayout.NORTH);
		   add(myPanel2, BorderLayout.CENTER);

			// set the location of the screen  
		   setLocation(100,100);

		   // Define the size of the frame  
		   setSize(500,400);
		   
		   // make the screen appear - without this, it doesn't!  
		   setVisible(true);	   
		  
	 }
	
	
	
	
	//methoods
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == button1)
		{
			
			JOptionPane.showMessageDialog(this, "Saved to list ");
			System.out.println(this.firstName);
			System.out.println(this.surName);
			System.out.println(this.age);
		}
		if(event.getSource()== button2)
		{
			
		}
		if(event.getSource()== t1)
		{
			this.firstName = t1.getText();
		 
		}
		if(event.getSource()== t2)
		{
			this.surName = t2.getText();
		}
		if(event.getSource()== t3)
		{
			this.age = t3.getText();
		}
		
	}
	
	//getters + setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}

