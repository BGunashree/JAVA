package com.xworkz.standards.service;

import com.xworkz.standards.repository.AddressRepository;

public class AddressServiceImpl implements AddressService{

	AddressRepository addressRepository;
	public  AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository=addressRepository;
	}
	@Override
	public void push() {
		System.out.println("running push in addressservice impl");
		if(addressRepository!=null)
		{
			boolean same=addressRepository.save();
			if(same)
			{
				System.out.println("successfully saved");
				return;
			}
			else
			{
				System.out.println("not saved");
				return;
			}
		}
		System.out.println("addressRepository is null");
		
	}

	@Override
	public void refresh() {
		
		System.out.println("running refresh in addressservice impl");
		if(addressRepository!=null)
		{
			int value=addressRepository.update();
			if(value>=1)
			{
				System.out.println("successfully updated");
				return;
			}
			else
			{
				System.out.println("not updated");
				return;
			}
		}
		System.out.println("addressRepository is null");
	}

	@Override
	public void remove() {
		System.out.println("running remove in addressservice impl");
		if(addressRepository!=null)
		{
			addressRepository.delete();
			
		}
		else
		{
			System.out.println("addressRepository is null");
		}
		
		
	}

	@Override
	public void load() {
		System.out.println("running refresh in addressservice impl");
		if(addressRepository!=null)
		{
			String value=addressRepository.read();
			if(value=="gunashree")
			{
				System.out.println("value:"+value);
				System.out.println("successfully read");
				return;
			}
			else
			{
				System.out.println("not read");
				return;
			}
		}
		System.out.println("addressRepository is null");
		
	}

}
