package org.sample;

public class PallindromeNumbers {
	public static void main(String[] args) {
		int num=161;
		int rem=0;
		int res=0;
		int n=num;
		while (num>0) {                   // 161>0 True ,16>0 True, 1>0 True, 0>0 False
			rem=num%10;                   // rem=161%10 =1, 16%10 =6, 1%10 =1
			res=(res*10)+rem;             // res=(0*10)+1 =1, (1*10)+6 =16, (16*10)+1 =161
			num=num/10;                   // num=161/10 =16, 16/10 =1, 1/10 =0
		}
		
		System.out.println(res);
		
		if (res==n) {
			System.out.println("its pallindrome");
		} else {
			System.out.println("its Not pallindrome");
		}
	}

}
