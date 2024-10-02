package org.sample;

public class CountofDigits {
	public static void main(String[] args) {

		int num = 1534;
		int count = 0;
		while (num > 0) {          //1534>0 True, 153>0 True, 15>0 True, 1>0 True, 0>0 False
			num = num / 10;        //num=1534/10 =153, 153/10 =15, 15/10 =1, 1/10
			count++;               //count=0+1=1, 1+1=2, 2+1=3, 3+1=4
		}
		System.out.println(count);
	}

}
