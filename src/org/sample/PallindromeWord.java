package org.sample;

public class PallindromeWord {
	public static void main(String[] args) {
		String s="MALAYALAM";
		String res="";
		
		for (int i = s.length()-1; i>=0; i--) {   //9-1=8 ; 8>=0 ; 8-1=7 ....
			char c = s.charAt(i);                 //8=M, 7=A, 6=L.....
			res=res+c;                             
		}
		
		System.out.println(res);
		
		if (res.equals(s)) {
			System.out.println("its pallindrome");
		} else {
			System.out.println("its pallindrome");
		}
	}

}
