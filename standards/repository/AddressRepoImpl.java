package com.xworkz.standards.repository;

public class AddressRepoImpl implements AddressRepository{

	@Override
	public boolean save() {
		System.out.println("running save in AddressRepoImpl");
		return true;
	}

	@Override
	public int update() {

		System.out.println("running update in AddressRepoImpl");
		return -10;
	}

	@Override
	public void delete() {
		
		System.out.println("running delete in AddressRepoImpl");
		
	}

	@Override
	public String read() {
		System.out.println("running read in AddressRepoImpl");
		return "gunashree";
	}
	

}
