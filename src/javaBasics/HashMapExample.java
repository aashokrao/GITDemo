package javaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "USA");
		hm.put(1, "UK");
		hm.put(2, "UAE");
		hm.put(1, "UK1");
		System.out.println(hm.get(1));
		System.out.println(hm.containsValue("UK1"));
		System.out.println(hm.keySet().size());
		System.out.println(hm.size());
		for(int i=0;i<hm.size();i++) {
			System.out.println(hm.values());
		}
		Iterator<String> iit = hm.values().iterator();
		Set<Integer> keySet = hm.keySet();
		Iterator<Entry<Integer, String>> aaa = hm.entrySet().iterator();
		/*while(aaa.hasNext()){
			aaa.next(Integer,String);
			System.out.println(aaa.next().getKey());
			System.out.println(aaa.next().getValue());
			
		}
		*/
		/*
		
		while(iit.hasNext()) {
			System.out.println(iit.next());
		}
		*/
		/*Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().);
		}*/
		
		/*Iterator<Entry<Integer, String>> entrySet = hm.entrySet().iterator();
		Iterator ii = entrySet.iterator();
		while(ii.hasNext()) {
			Map.Entry mp =(Map.Entry)ii.next();
			System.out.println(mp.getKey(ii));
			System.out.println(mp.getValue(ii));
			
		}
*/
	}

}
