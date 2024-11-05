package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.Code;
import com.xworkz.map.dto.CountryDTO;
public class AddressRunner {

	public static void main(String[] args) {
	
		
		Map<String,AddressDTO> map=new HashMap<>();
		map.put("Gunashree", new AddressDTO(8951144517L,"ShantiNagar","Bangalore","Karnataka",new CountryDTO("India",Code.INDIA)));
		map.put("Akshay", new AddressDTO(9739611655L,"Bhuvaneshwari","Anantapur","Andhra Pradesh",new CountryDTO("India",Code.INDIA)));
		map.put("Divya", new AddressDTO(9876543219L,"Vinayaka","Kolar","Karnataka",new CountryDTO("India",Code.INDIA)));
		map.put("Supritha", new AddressDTO(8660084035L,"Rahamath","Kolar","Karnataka",new CountryDTO("India",Code.INDIA)));
		map.put("Prateeksha", new AddressDTO(8904733310L,"Ashoka Nagar","Chikkaballapura","Karnataka",new CountryDTO("India",Code.INDIA)));
		

		Set<String> keys=map.keySet();
		keys.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Collection<AddressDTO> values=map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<String, AddressDTO>> entries=map.entrySet();
		entries.forEach((ref)->System.out.println(ref));
		
		
		

	}

}
