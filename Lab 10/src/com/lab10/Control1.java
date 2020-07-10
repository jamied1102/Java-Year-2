package com.lab10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Control1 {

	public static void main(String[] args) {
		String[] countries = {"Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", 
				"CzechRepublic", "Denmark", "Estonia", "Hungary", "Iceland", "Ireland", "Italy", "Kosovo", "Latvia", "Liechtenstein",
				"Lithuania", "Luxemburg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Norway", "Poland",
				"Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain",
				"Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"};
		Set<String> set = new HashSet<>(Arrays.asList(countries));
		set.add("12345");
		Iterator iterator1 = set.iterator(); 
		
        
        while (iterator1.hasNext()) { 
            System.out.println(iterator1.next()); 
       //   System.out.println(1);
        } 
        
	}

}
