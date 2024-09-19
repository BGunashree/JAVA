package com.xworkz.standards.service;

import com.xworkz.standards.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{

	VehicleRepository vehicleRepository;
	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository=vehicleRepository;
	}
	@Override
	public void persist() {
		
		System.out.println("running persist in VehicleServiceImpl ");
		if(vehicleRepository!=null)
		{
			vehicleRepository.save();
		}
		else
		{
		   System.out.println("vehicleRepository is null");
		}
		
	}

	@Override
	public void merge() {
		System.out.println("running merge in VehicleServiceImpl ");
		if(vehicleRepository!=null)
		{
			vehicleRepository.update();
		}
		else
		{
		   System.out.println("vehicleRepository is null");
		}
		
	}

	@Override
	public void clear() {
		System.out.println("running clear in VehicleServiceImpl ");
		if(vehicleRepository!=null)
		{
			boolean status=vehicleRepository.delete();
			if(status)
			{
				System.out.println("delete successful");
			}
			else
			{
				System.out.println("delete unsuccessful ");
			}
		}
		else
		{
		   System.out.println("vehicleRepository is null");
		}
		
	}

	@Override
	public void search() {
		System.out.println("running search in VehicleServiceImpl ");
		if(vehicleRepository!=null)
		{
			String value=vehicleRepository.read();
			if(value=="Jaya")
			{
				System.out.println(value);
				
			}
			else
			{
				System.out.println("fail");
			}
		}
		else
		{
		   System.out.println("vehicleRepository is null");
		}
		
	}

}
