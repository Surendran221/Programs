package org.sample;

public class PyramidRight {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {         //1<=5 true....5<=5 true,6<=5 false
			for (int j = 5-i; j >=1; j--) {   //(5-1=4, 4>=1, 4-1=3)
				System.out.print(" ");        //4 spaces,3 spaces....
			}
			for (int j = 1; j <=i; j++) {     //1<=1 true 1<=2 false...
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
