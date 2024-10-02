package org.sample;

import java.util.Set;
import java.util.TreeSet;

public class SortNumbersWithPredefinedclass {
	public static void main(String[] args) {
		int a[]= {31,59,64,72,28,46,89,91,37,69};
		Set<Integer> si= new TreeSet<>();
		for (Integer s : a) {
			si.add(s);
		}
		System.out.println(si);
	}

}
