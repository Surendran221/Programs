package org.sample;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="welcome to java class";
		String res="";
		String[] sp = s.split(" ");                    //welcome,to,java,class
		for (String s1 : sp) {
			String rev="";
			for (int i = s1.length()-1; i >=0 ; i--) {  //7-1=6, 6-1=5, 5-1=4....
				char c = s1.charAt(i);                  //6=e, 5=m, 4=o, 3=c, 2=l, 1=e, 0=w
				rev=rev+c;
			}
			res=res+rev+" ";
		}
		System.out.print(res);
	}

}
