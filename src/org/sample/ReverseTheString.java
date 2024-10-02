package org.sample;

public class ReverseTheString {
	public static void main(String[] args) {
		String s="welcome to java class";
		
		for (int i = s.length()-1; i>=0 ; i--) {    //21-1=20 ; 20>=0 ;20-1=19
			char c = s.charAt(i);                   //20=s, 19=s, 18=a, 17=l, 16=c, 15=space
			System.out.print(c);
		}
		
	}

}
