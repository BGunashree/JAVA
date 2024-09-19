package com.xworkz.standards.runner;

import com.xworkz.standards.repository.Repository;
import com.xworkz.standards.repository.RepositoryImpl;
import com.xworkz.standards.service.Service;
import com.xworkz.standards.service.ServiceImpl;

public class Runner {

	public static void main(String[] args) {
	
		
		Repository repository=new RepositoryImpl();
		
		ServiceImpl serviceImpl=new ServiceImpl(repository);
		serviceImpl.push();
		
		
		
		

	}

}
