package org.sample;

public class PrintAllEvenNumbers {
	public static void main(String[] args) {
		
		for (int i = 1; i < 50; i++) {
			// 1%2==1, 2%2==0, 3%2==1, 4%2==0 ,5%2==1
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
