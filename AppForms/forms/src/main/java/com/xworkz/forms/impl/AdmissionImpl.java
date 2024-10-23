package com.xworkz.forms.impl;
import com.xworkz.forms.dto.CollegeAdmissionDTO;
import com.xworkz.forms.service.FormService;


public class AdmissionImpl implements FormService {
	
	@Override
	public boolean validation(Object obj)
	{
		boolean valid=true;
		if(obj!=null)
		{
			if(obj instanceof CollegeAdmissionDTO)
			{
				CollegeAdmissionDTO cdto=(CollegeAdmissionDTO)obj;
				String name=cdto.getName();
				if(name!=null && name!=" "  && name.length()>3 && name.length()<50)
				{
					System.out.println("name is valid");
				}
				else {
					valid=false;
					System.err.println("name is invalid");
				}
				
				String email=cdto.getEmail();
				if(email!=null && email.contains("@") && email.endsWith(".com")) {
					
					System.out.println("email is valid");
					
				}
				else
				{
					valid=false;
					System.err.println("email is invalid");
				}
				
				int age=cdto.getAge();
				if(age>18)
				{
					System.out.println("age is valid");
				}
				else
				{
					valid=false;
					System.err.println("age is invalid");
				}
				
				String fname=cdto.getFatherName();
				if(fname!=null && fname!=" "  && fname.length()>4 && fname.length()<50)
				{
					System.out.println("fname is valid");
				}
				else {
					valid=false;
					System.err.println("fname is invalid");
				}
				
				
				String mname=cdto.getMotherName();
				if(mname!=null && mname!=" "  && mname.length()>3 && mname.length()<50)
				{
					System.out.println("mname is valid");
				}
				else {
					valid=false;
					System.err.println("mname is invalid");
				}
				
				
			}
		}
		
		if(valid)
		{
			return true;
		}
		return false;
	}

	
	

}
