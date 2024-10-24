package com.xworkz.hrd.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class HRdto implements Serializable{
	
	private String name;
	private  String qualification;
	private int totalExp;
	private String location;

}
