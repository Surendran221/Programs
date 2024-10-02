package org.sample;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int rem=0;
		int res=0;
		int n=num;
		
		while (num>0) {                //153>0 True, 15>0 True, 1>0 True, 0>0 False
			rem=num%10;                //rem=153%10 =3, 15%10 =5, 1%10 =1
			res=(rem*rem*rem)+res;     //res=(3*3*3)+0 =27, (5*5*5)+27 =152, (1*1*1)+152 =153
			num=num/10;                //num=153/10 =15, 15/10 =1, 1/10 =0
		}
		
		System.out.println(res);
		
		if (res==n) {
			System.out.println("its armstrong");
		} else {
			System.out.println("its  not armstrong");
		}
	}

}
