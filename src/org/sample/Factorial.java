package org.sample;



public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		
		for (int i = 1; i <=5; i++) {
			fact= fact*i;              //fact=1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
		}
		System.out.println(fact);
	}

}
