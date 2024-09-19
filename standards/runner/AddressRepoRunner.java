package com.xworkz.standards.runner;

import com.xworkz.standards.repository.AddressRepoImpl;
import com.xworkz.standards.repository.AddressRepository;
import com.xworkz.standards.repository.MachineRepository;
import com.xworkz.standards.repository.MachineRepositoryImpl;
import com.xworkz.standards.repository.VehicleRepository;
import com.xworkz.standards.repository.VehicleRepositoryImpl;
import com.xworkz.standards.service.AddressServiceImpl;
import com.xworkz.standards.service.MachineServiceImpl;
import com.xworkz.standards.service.VehicleServiceImpl;

public class AddressRepoRunner {

	public static void main(String[] args) {
		
		
		AddressRepository addessRepository=new AddressRepoImpl();
		AddressServiceImpl addressServiceImpl=new AddressServiceImpl(addessRepository);
		addressServiceImpl.push();
		System.out.println("---------------------------------------------------------");
		addressServiceImpl.refresh();
		System.out.println("---------------------------------------------------------");
		addressServiceImpl.remove();
		System.out.println("---------------------------------------------------------");
		addressServiceImpl.load();
		System.out.println("==================================================================");
		
        VehicleRepository vehicleRepository=new VehicleRepositoryImpl();
        VehicleServiceImpl vehicleServiceImpl=new VehicleServiceImpl(vehicleRepository);
        vehicleServiceImpl.clear();
        System.out.println("---------------------------------------------------------");
        vehicleServiceImpl.persist();
        System.out.println("---------------------------------------------------------");
        vehicleServiceImpl.search();
        System.out.println("---------------------------------------------------------");
        vehicleServiceImpl.merge();
        System.out.println("---------------------------------------------------------");
        System.out.println("==================================================================");
        
        MachineRepository machineRepository=new MachineRepositoryImpl();
        MachineServiceImpl machineServiceImpl=new MachineServiceImpl(machineRepository);
        machineServiceImpl.delete();
        System.out.println("---------------------------------------------------------");
        machineServiceImpl.read();
        System.out.println("---------------------------------------------------------");
        machineServiceImpl.save();
        System.out.println("---------------------------------------------------------");
        machineServiceImpl.update();
        System.out.println("==================================================================");
	}

}
