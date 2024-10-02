package org.sample;

public class CountAllEvenNumbers {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			// 1%2==1, 2%2==0, 3%2==1, 4%2==0 ,5%2==1
			if (i % 2 == 0) {
				// 2=count(1)
				// 4=count(2)
				// 6=count(3)
				count++;
			}
		}
		System.out.println(count);
	}

}
