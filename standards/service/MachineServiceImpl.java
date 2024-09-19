package com.xworkz.standards.service;

import com.xworkz.standards.repository.MachineRepository;

public class MachineServiceImpl implements MachineService{

	MachineRepository machineRepository;
	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository=machineRepository;
	}
	@Override
	public void save() {

		System.out.println("running save in MachineServiceImpl");
		if(machineRepository!=null)
		{
			machineRepository.save();
		}
		else
		{
			System.out.println("machineRepository is null");
		}

		
	}

	@Override
	public void update() {
		
		System.out.println("running update in MachineServiceImpl");
		if(machineRepository!=null)
		{
			int val=machineRepository.update();
			if(val<1)
			{
				System.out.println("failure");
			}
			else
			{
				System.out.println("success");
			}
		}
		
		else
		{
			System.out.println("machineRepository is null");
		}
	}

	@Override
	public void delete() {
		
		
		System.out.println("running delete in MachineServiceImpl");
		if(machineRepository!=null)
		{
			int val=machineRepository.delete();
			if(val<1)
			{
				System.out.println("not deleted");
				
			}
			else
			{
				System.out.println("successfully deleted");
			}
		}
		else
		{
			System.out.println("machineRepository is null");
		}
	}

	@Override
	public void read() {
		
		
		System.out.println("running read in MachineServiceImpl");
		if(machineRepository!=null)
		{
			int val=machineRepository.read();
			if(val<1)
			{
				System.out.println("not read");
				
			}
			else
			{
				System.out.println("successfully read");
			}
			
		}
		else
		{
			System.out.println("machineRepository is null");
		}
	}
	

}
