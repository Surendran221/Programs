package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatewords {
	public static void main(String[] args) {
		String s= "java sql python java linux sql java oracle python";
		Set<String> si= new LinkedHashSet<>();
		String[] sp = s.split(" ");
		for (String s1 : sp) {
			si.add(s1);
		}
		System.out.println(si);
		
		for (String str : si) {
			System.out.println(str);
		}
	}

}
