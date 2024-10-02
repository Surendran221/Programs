package org.sample;

public class SortTheString {
	public static void main(String[] args) {
		String s = "goodday";
		char[] c = s.toCharArray();                     //{g,o,o,d,d,a,y}
		for (int i = 0; i < c.length; i++) {            
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {                      //g>o false..., g>d true, g>a true
					char temp = c[i];                   //temp=g, temp=g....
					c[i] = c[j];                        //c[i]=d, c[i]=a....
					c[j] = temp;                        //c[j]=g, c[j]=g....
				}
			}
		}
		for (char d : c) {
			System.out.println(d);
		}
	}

}
