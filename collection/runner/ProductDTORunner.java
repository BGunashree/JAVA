package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import com.xworkz.collections.dto.ProductDTO;

public class ProductDTORunner {

	public static void main(String[] args) {

		ProductDTO<Integer,String,Double> productDTO=new ProductDTO<Integer,String,Double>(10,"Socks","Puma",200.0);
		ProductDTO<Integer,String,Double> productDTO1=new ProductDTO<Integer,String,Double>(11,"Shoes","Puma",5000.0);
		ProductDTO<Integer,String,Double> productDTO2=new ProductDTO<Integer,String,Double>(12,"Denim","Roadster",1200.0);
		ProductDTO<Integer,String,Double> productDTO3=new ProductDTO<Integer,String,Double>(13,"Jacket","H&M",1500.0);
		ProductDTO<Integer,String,Double> productDTO4=new ProductDTO<Integer,String,Double>(14,"Watch","Armani",24000.0);
		ProductDTO<Integer,String,Double> productDTO5=new ProductDTO<Integer,String,Double>(15,"TV","LG",40000.0);
		ProductDTO<Integer,String,Double> productDTO6=new ProductDTO<Integer,String,Double>(16,"Washing Machine","IFB",50000.0);
		ProductDTO<Integer,String,Double> productDTO7=new ProductDTO<Integer,String,Double>(17,"Fridge","Samsung",100000.0);
		ProductDTO<Integer,String,Double> productDTO8=new ProductDTO<Integer,String,Double>(18,"Fan","Crompton",1000.0);
		ProductDTO<Integer,String,Double> productDTO9=new ProductDTO<Integer,String,Double>(19,"Grinder","Greenchef",5000.0);
		Collection<ProductDTO> collection=new ArrayList();
		collection.add(productDTO);
		collection.add(productDTO1);
		collection.add(productDTO2);
		collection.add(productDTO3);
		collection.add(productDTO4);
		collection.add(productDTO5);
		collection.add(productDTO6);
		collection.add(productDTO7);
		collection.add(productDTO8);
		collection.add(productDTO9);
		
		for(ProductDTO<Integer,String,Double> pDTO:collection)
		{
			System.out.println(pDTO);
		}
		collection.forEach((ref)->System.out.println(ref));
		System.out.println("---------ASCENDING ORDER based on cost----------");
		collection.stream().sorted().forEach((ref)->System.out.println(ref));
		System.out.println("--------------------cost more than 5000------------------------------------------");
		
		collection.stream().filter((pDTO)->(double)pDTO.getCost()>5000.0).forEach((pDTO)->System.out.println(pDTO));
		System.out.println("---------------------------------cost less than 30000 and more than 5000-----------------------------");
		
		collection.stream().filter((pDTO)->((double)pDTO.getCost()>5000.0) && ((double)pDTO.getCost()<30000.0)).forEach((pDTO)->System.out.println(pDTO));
		System.out.println("------------------------DESC ORDER BASED ON COST--------------------------------------");
		collection.stream().sorted((pDTO,pDTO1)->Double.compare((Double)pDTO1.getCost(),(Double)pDTO.getCost())).forEach((ref)->System.out.println(ref));
		System.out.println("-------------------Vendor name starts with a-------------------------------------------");
		
		collection.stream().filter((pDTO)->((String) pDTO.getVendor()).startsWith("A")).sorted().forEach((ref)->System.out.println(ref));
		System.out.println("----------------------------prdouct names----------------------------------");
		collection.stream().forEach((ref)->System.out.println(ref.getName()));
		System.out.println("------------------------ID--------------------------------------");
		collection.stream().forEach((ref)->System.out.println(ref.getId()));
		System.out.println("--------------------------------------------------------------");
		collection.forEach((ref)->System.out.println(((String)ref.getName()).toUpperCase()+" "+ref.getCost()+" "+ref.getId()+" "+((String)ref.getVendor()).toUpperCase()));
		System.out.println("--------------------------------------------------------------");
		collection.stream().map(product->((String)product.getName()).toUpperCase()).forEach(ref->System.out.println(ref));
		
		//collection.stream().map((ref)->ref.getId()).forEach(ref->System.out.println(ref));
		
		
	}

}
