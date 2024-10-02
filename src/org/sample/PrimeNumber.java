package org.sample;

public class PrimeNumber {
	public static boolean isprime(int num) {
		if (num <= 1) {                           //1 lessthan or equalto not prime
			return false;                         //false means  not prime
		}
		for (int i = 2; i < num; i++) {           //2<9 True,3<9 true...9<9 false
			if (num % i == 0) {                   //9%2=1 false,9%3 true,9%4 false.... 
				return false;
			}	
		}
		return true;                             //true means prime
	}

	public static void main(String[] args) {
		if (isprime(9)) {
			System.out.println("*its prime number*");
		} else {
			System.out.println("*its  not prime number!!!");
		}
	}

}
