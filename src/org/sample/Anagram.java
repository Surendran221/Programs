package org.sample;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "SECURE";
		String s2 = "RESCUE";
		if (s1.length() == s2.length()) {                  //6=6
			char[] c1 = s1.toCharArray();                  //{S,E,C,U,R,E}
			char[] c2 = s2.toCharArray();                  //{R,E,S,C,U,E}
			Arrays.sort(c1);                               //{C,E,E,R,S,U}
			Arrays.sort(c2);                               //{C,E,E,R,S,U}
			boolean x = Arrays.equals(c1, c2);             //True
			if (x == true) {
				System.out.println("*its Anagram*");
			} else {
				System.out.println("its not anagram because character mismatching!!!");
			}

		} else {
			System.out.println("its not anagram  because length not matching!!!");
		}
	}

}
