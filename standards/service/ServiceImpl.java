package com.xworkz.standards.service;

import com.xworkz.standards.repository.Repository;

public class ServiceImpl implements Service{
	
	Repository repository;

	public  ServiceImpl(Repository repository) {
		this.repository=repository;
	}
	@Override
	public String push() {
		
		if(repository!=null)
		{
			boolean saved=repository.save();
			if(saved)
			{
				System.out.println("saved in repo");
				return "success";
			}
			else
			{
				System.out.println("not saved in repo");
				
				return "failure";
			}
				
		}
		
		return "issue";
	}

}
