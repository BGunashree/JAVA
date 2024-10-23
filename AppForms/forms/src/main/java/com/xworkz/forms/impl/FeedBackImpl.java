package com.xworkz.forms.impl;

import com.xworkz.forms.dto.FeedBackDTO;
import com.xworkz.forms.service.FormService;

public class FeedBackImpl implements FormService {

	@Override
	public boolean validation(Object obj) {
		
		boolean valid=true;
		if(obj!=null)
		{
			if(obj instanceof FeedBackDTO)
			{
				FeedBackDTO dto=(FeedBackDTO)obj;
				
				String name=dto.getName();
				if(name!=null && name!=" "  && name.length()>3 && name.length()<50)
				{
					System.out.println("name is valid");
				}
				else {
					valid=false;
					System.err.println("name is invalid");
				}
				
				String email=dto.getEmail();
				if(email!=null && email.contains("@") && email.endsWith(".com")) {
					
					System.out.println("email is valid");
					
				}
				else
				{
					valid=false;
					System.err.println("email is invalid");
				}
			}
			else{
				System.err.println("not instance");
				return false;
			}
			
		}
		if(valid)
		{
			return true;
		}
		return false;
	}
	
	
	

}
