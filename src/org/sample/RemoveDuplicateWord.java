package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateWord {
	public static void main(String[] args) {
		String s="RAINING HERE ....";
		Set<Character> si= new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			si.add(c);
		}
		System.out.println(si);
	}

}
