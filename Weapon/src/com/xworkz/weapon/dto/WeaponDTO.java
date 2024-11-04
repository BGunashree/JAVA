package com.xworkz.weapon.dto;

import java.time.LocalDate;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class WeaponDTO {
	
	private  int id;
	private String name;
	private String countryMade;
	private LocalDate manfDate;
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null || getClass()!=obj.getClass())
			return false;
		WeaponDTO w=(WeaponDTO)obj;
		return name.equals(w.name) && countryMade.equals(w.countryMade);
	}
	@Override
	public int hashCode() {
		
		return 99;
	}
	
	

}
