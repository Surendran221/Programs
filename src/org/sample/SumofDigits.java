package org.sample;

public class SumofDigits {
	public static void main(String[] args) {
		int num= 153;
		int rem=0;
		int res=0;
		
		while (num>0) {      //153>0 True, 15>0 True, 1>0 True, 0>0 Flase
			rem =num%10;     //rem=153%10 =3, 15%10 =5, 1%10 =1
			res=res+rem;     //res=0+3 =3, 3+5 =8, 8+1 =9
			num=num/10;      //num=153/10 =15, 15/10 =1, 1/10 =0
		}
		System.out.println(res);
	}

}
