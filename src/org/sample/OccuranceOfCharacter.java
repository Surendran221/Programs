package org.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		String s = "AUTOMATION";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mp.containsKey(c)) {                            //A,T,O
				Integer count = mp.get(c);                      //COUNT A=1, T=1, O=1
				mp.put(c, count + 1);                           //(A,2),(T,2),(O,2)
			} else {
				mp.put(c, 1);                                   //A=1,U=1,T=1,O=1,M=1,I=1,N=1
			}
		}
		System.out.println(mp);
		
		Set<Entry<Character, Integer>> en = mp.entrySet();
            for (Entry<Character, Integer> ent : en) {
				Integer v = ent.getValue();       
				if (v>1) {                                      //A=2,T=2.O=2
					System.out.println(ent); 
					System.out.println(ent.getKey());           //A,T,O
				}
			}
            
	}

}
