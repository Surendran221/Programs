package org.sample;

public class ToUpperCaseofFirstword {
public static void main(String[] args) {
	String s="welcome to java class";
	String res="";
	String[] sp = s.split(" ");                       //welcome,to,java,class
	for (String s1 : sp) {
		char c = s1.charAt(0);                       
		char uppercase = Character.toUpperCase(c);    //W,T,J,C
		String sub = s1.substring(1);                 //elcome,o,ava,lass
		res=res+uppercase+sub+" ";
	}
	System.out.println(res);
}
}
