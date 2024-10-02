package org.sample;

public class FindVowelsConsonants {
	public static void main(String[] args) {
		String s="AUTOMATION";
		String vow="";
		String cons="";
		int vowcount=0;
		int conscount=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {   
				vow=vow+c;                                    //vow=A,U,O,A,I,O
				vowcount++;                                   //vowcount=6
			}
			else {
				cons=cons+c;                                  //cons=T,M,T,N
				conscount++;                                  //conscount=4
			}
		}
		System.out.println("vowels          :"+vow);
		System.out.println("consonants      :"+cons);
		System.out.println("vowcounts       :"+vowcount);
		System.out.println("consonantscounts:"+conscount);
	}

}
