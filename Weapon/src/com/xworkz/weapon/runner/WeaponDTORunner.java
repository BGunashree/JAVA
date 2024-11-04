package com.xworkz.weapon.runner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponDTORunner {

	public static void findById(Set<WeaponDTO> set,int id)
	{
		
		
			Optional<WeaponDTO> wp=set.stream().filter(ref->ref.getId()==id).findFirst();
			if(wp.isPresent())
			{
				System.out.println("present");
				System.out.println(wp.get());
			}
		
		   
		
		
		
	}
	public static void main(String[] args) {
		
		
		Set<WeaponDTO> set=new HashSet<WeaponDTO>();
		set.add(new WeaponDTO(1,"M16","USA",LocalDate.of(2023,5, 20)));
		//set.add(new WeaponDTO(1,"M16","USA",LocalDate.of(2023,5, 20)));
		set.add(new WeaponDTO(2,"AK47","Russia",LocalDate.of(2024,5, 20)));
		set.add(new WeaponDTO(3,"Fn Scar","Belgium",LocalDate.of(2025,5, 20)));
		set.add(new WeaponDTO(4,"HK416","Germany",LocalDate.of(2026,6, 21)));
		set.add(new WeaponDTO(5,"Famas","France",LocalDate.of(2020,5, 20)));
		set.add(new WeaponDTO(6,"Galil","Israel",LocalDate.of(2024,5, 20)));
		set.add(new WeaponDTO(7,"Type 95","China",LocalDate.of(2020,5, 20)));
		set.add(new WeaponDTO(8,"G36","Ukraine",LocalDate.of(2021,5, 20)));
		set.add(new WeaponDTO(9,"L85","UK",LocalDate.of(2022,5, 20)));
		set.add(new WeaponDTO(10,"QBZ03","Japan",LocalDate.of(2019,5, 20)));
		System.out.println(set.size());
		set.stream().filter((ref)->ref.getManfDate().getYear()>2024).forEach(System.out::println);System.out.println("------------------------------");
		set.stream().filter((ref)->ref.getManfDate().getYear()<2024).forEach(System.out::println);
		System.out.println("------------------------------");
		set.stream().map((ref)->ref.getId()).sorted((ref,ref1)->ref1.compareTo(ref)).forEach(System.out::println);
		System.out.println("------------------------------");
		WeaponDTORunner.findById(set, 7);
		
		

	}

}
