package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode
@Getter
public class CountryDTO {
	
	private String name;
	private Code code;
	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", code=" + code.getCountryCode() + "]";
	}
	
	

}
