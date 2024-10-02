package org.sample;

public class PyramidSameNumbers {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {             //1<=5 true....5<=5 true,6<=5 false
			for (int j = 1; j <=i; j++) {         //1<=1 true,2<=1 false
				System.out.print(i);              //1<=2 true,2<=2 true,3<=2 false
			}
			System.out.println();
		}
	}
}
