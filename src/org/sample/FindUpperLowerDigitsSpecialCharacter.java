package org.sample;

public class FindUpperLowerDigitsSpecialCharacter {
	public static void main(String[] args) {
		String s="SolverMindsTechnology1997@gmail.com";
		String uppercase="";
		String lowercase="";
		String specialcharacter="";
		String digits="";
		int uppercasecount=0;
		int lowercasecount=0;                                 //ASCII VALUE A to Z= 65 to 90
		int specialcharactercount=0;                          //            a to z= 97 to 122
		int digitscount=0;                                    //            1 to 9= 48 to 57
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);                               
			int x=c;                                           
			if (x>=65 && x<=90) {                             //S,M,T 
				uppercase=uppercase+c;                         
				uppercasecount++;
			}
			else if (x>=97 && x<=122) {                       //olverindsechnologygmailcom
				lowercase=lowercase+c;
				lowercasecount++;
			}
			else if (x>=48 && x<=57) {                        //1997
				digits=digits+c;
				digitscount++;
			}
			else {
				specialcharacter=specialcharacter+c;         //@.
				specialcharactercount++;
			}
		}
		System.out.println("UPPERCASE            :"+uppercase);
		System.out.println("UPPERCASECOUNT       :"+uppercasecount);
		System.out.println("lowercase            :"+lowercase);
		System.out.println("lowercasecount       :"+lowercasecount);
		System.out.println("digits               :"+digits);
		System.out.println("digitscount          :"+digitscount);
		System.out.println("specialcharacter     :"+specialcharacter);
		System.out.println("specialcharactercount:"+specialcharactercount);
		
	}

}
