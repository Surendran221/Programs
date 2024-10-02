package org.sample;

public class FibbonacciSeries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for (int i = 1; i <=5 ; i++) {
		int c=a+b;                 //c=0+1=1, 1+1=2, 2+1=3, 3+2=5, 5+3=8
		System.out.println(c);     //1,2,3,5,8
		a=b;                       //a=1, a=2, a=3, a=5
		b=c;                       //b=2, b=3, b=5, b=8
	}
}
}


