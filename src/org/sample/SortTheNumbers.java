package org.sample;

public class SortTheNumbers {
	public static void main(String[] args) {
		int a[] = { 31, 59, 64, 72, 28, 46, 89, 91, 37, 69,10 };
		for (int i = 0; i < a.length; i++) {               
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {                  //31>59 false...31>28 True,31>10 true
					int temp = a[i];                //temp=31, temp=31...
					a[i] = a[j];                    //a[i]=28, a[i]=10....
					a[j] = temp;                    //a[j]=31, a[j]=31...
				}
			}
		}
		for (int s : a) {
			System.out.println(s);
		}
	}

}
