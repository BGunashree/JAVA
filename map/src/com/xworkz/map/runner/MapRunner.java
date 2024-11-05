package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		
		Map<Long,String> map=new HashMap<>();
		map.put(8951144517L, "bgunashree366@gmail.com");
		map.put(9739611655L, "akshaygowdab@gmail.com");
		map.put(8951144517L, "jayalakshmi@gmail.com");
		map.put(8660084035L, "gunashreebayanna@gmail.com");
		map.put(8904733310L, "divyav01@gmail.com");
		
		Set<Long> keys=map.keySet();
		keys.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Collection<String> values=map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<Long, String>> entries=map.entrySet();
		entries.forEach((ref)->System.out.println(ref));
		
		
		

	}

}
