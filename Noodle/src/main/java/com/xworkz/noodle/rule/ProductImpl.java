package com.xworkz.noodle.rule;

import com.xworkz.noodle.dto.ProductDTO;
import com.xworkz.noodle.rule.ProductService;
public class ProductImpl implements ProductService{

	@Override
	public boolean validateAndSave(ProductDTO dto) {
		
		boolean valid=true;
		if(dto!=null)
		{
			String companyName=dto.getCompanyName();
			if(!companyName.isEmpty() && companyName.length()>6 && companyName.length()<15)
			{
				System.out.println("valid companyName");
			}
			else
			{
				valid=false;
				System.out.println("invalid companyName");
			}
			String productName=dto.getProductName();
			if(!productName.isEmpty() && productName.length()>6 && productName.length()<15)
			{
				System.out.println("valid productName");
			}
			else
			{
				valid=false;
				System.out.println("invalid productName");
			}
			
			int productQuantity=dto.getProductQuantity();
			if(productQuantity>0 && productQuantity<10)
			{
				System.out.println("valid quantity");
			}
			else
			{
				valid=false;
				System.out.println("invalid quantity");
			}
			
			double cost=dto.getProductCost();
			if(cost>100)
			{
				System.out.println("valid cost");
			}
			else
			{
				valid=false;
				System.out.println("invalid quantity");
			}
		}
		if(valid)
		{
			return true;
		}
		return false;
	}

	
	
	

}
