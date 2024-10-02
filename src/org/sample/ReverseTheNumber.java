package org.sample;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int num = 123456789;
		int rem = 0;
		int res = 0;

		while (num > 0) {              // 123456789>0 True
			                           //12345678>0 True

			rem = num % 10;            // rem=123456789%10 =9, 12345678%10 =8 .....
			res = (res * 10) + rem;    // res=(res*10)+9 =9, (9*10)+8=98 ....
			num = num / 10;            //num=123456789/10 =12345678, 12345678/10=1234567
		}
		System.out.println(res);       //987654321
	}

}
