package org.sample;

public class ToUpperCaseofLastword {
	public static void main(String[] args) {
		String s="welcome to java class";
		String res="";
		String[] sp = s.split(" ");                       //welcome,to,java,class
		for (String s1 : sp) {
			char c = s1.charAt(s1.length()-1);                       
			char uppercase = Character.toUpperCase(c);    //E,O,A,S
			String sub = s1.substring(0,s1.length()-1);   //welcom,t,jav,clas
			res=res+sub+uppercase+" ";
		}
		System.out.println(res);
	}

}
