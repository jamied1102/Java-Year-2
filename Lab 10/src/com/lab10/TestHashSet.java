package com.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestHashSet {
	boolean test = false;
	
	String[] countries = {"Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", 
			"CzechRepublic", "Denmark", "Estonia", "Hungary", "Iceland", "Ireland", "Italy", "Kosovo", "Latvia", "Liechtenstein",
			"Lithuania", "Luxemburg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Norway", "Poland",
			"Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain",
			"Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"};
	Set<String> set;
	TestHashSet()
	{
		Set<String> set = new HashSet<>(Arrays.asList(countries));
		this.set = set;
	}
	public void printhashset()
	{
		Iterator iterator1 = set.iterator(); 
		
         
        while (iterator1.hasNext()) { 
            System.out.println(iterator1.next()); 
        } 
	}
	public void addhashshet(String city)
	{
		set.add(city);
		
	}
	public boolean checkhashset(String check)
	{
		Iterator iterator2 = set.iterator();
		while (iterator2.hasNext()) { 
            if(check != iterator2.next())
            {
            	test = false;
            }
            else
            {
            	test = true;
            	break;
            }
        }
		return test;
	}
	public void clearset()
	{
		set.clear();
	}
	public void sortset()
	{
		 List<String> list = new ArrayList<String>(set);
		 Collections.sort(list);
		 list.forEach(System.out::println);
	}
	public void shuffleset()
	{
		 List<String> list = new ArrayList<String>(set);
		 Collections.shuffle(list);
		 list.forEach(System.out::println);
	}
	public void rverseset()
	{
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		Collections.reverse(list);
		list.forEach(System.out::println);
	}
}
