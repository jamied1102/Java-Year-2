package com.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class FileProcessor {
Scanner sc;
int i = 0;
private String roles;

FileProcessor(String role)
{
	this.roles = role;
}
public void ReadFile()
{
	
	File file = new File("roles.txt");
	Scanner sc = new Scanner("roles.txt");
	
}
	
public void readfile()
{
	try {
		
		while (sc.hasNextLine())
		{
		String line = sc.nextLine();
		System.out.println ("I read this line " + line);
		}
		sc.close();
	}
	catch(Exception e ) {
		System.out.println("error");
	}
}
public void fc(String roles)
{
	while(sc.hasNextLine())
	{
		i++;
		String rol [];
		rol = new String[i];
		rol[i] = sc.nextLine();
		
		if(rol[i] == roles)
		{
			System.out.println("does match");
		}
		else 
		{
			System.out.println("does not match");
		}
	}
}

public void outFile()
{
	
}


}

