package org.sample;

public class CountAllOddNumbers {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 50; i++) {
			// 1%2==1, 2%2==0, 3%2==1, 4%2==0 ,5%2==1
			if (i % 2 == 1) {
				// 1=count(1)
				// 3=count(2)
				// 5=count(3)
				count++;
			}
		}
		System.out.println(count);
	}

}
