package com.xworkz.hrd.dtorunner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.hrd.dto.HRdto;

public class HRDdtoRunner {

	public static void main(String[] args) {
		
		
		HRdto dto=new HRdto("Akshay", "BE", 5, "Bangalore");
		HRdto dto1=new HRdto("Anil", "MBA", 4, "Mumbai");
		HRdto dto2=new HRdto("Lavanya", "BE", 3, "Hyderabad");
		HRdto dto3=new HRdto("Soujanya", "MCA", 2, "Delhi");
		HRdto dto4=new HRdto("Jeevan", "BCA", 4, "Bangalore");
		HRdto dto5=new HRdto("Akil", "BE", 5, "Pune");
		HRdto dto6=new HRdto("Manohar", "BE", 7, "Delhi");
		HRdto dto7=new HRdto("Chitra", "BE", 4, "Bangalore");
		HRdto dto8=new HRdto("Kishan", "BE", 3, "Bangalore");
		HRdto dto9=new HRdto("Likitha", "BE", 1, "Bangalore");
		
		
		LinkedList<HRdto> collection =new LinkedList<HRdto>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		
		
		collection.stream().filter(ref->ref.getLocation().equals("Bangalore")).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
		collection.stream().filter(ref->ref.getTotalExp()>5).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
		collection.stream().filter(ref->ref.getName().endsWith("r")).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
		collection.stream().map(ref->ref.getLocation()).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
	
		
		collection.stream().sorted((ref1,ref2)->ref1.getName().compareTo(ref2.getName())).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
		collection.stream().sorted((ref1,ref2)->ref1.getQualification().compareTo(ref2.getQualification())).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
		collection.stream().sorted((ref1,ref2)->Double.compare(ref2.getTotalExp(),ref1.getTotalExp())).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------------------------");
		
		Iterator<HRdto> iterator=collection.iterator();
		while (iterator.hasNext()) {
			HRdto ref = iterator.next();
			if (ref.getName().startsWith("A")) {
				iterator.remove();
				
			}
	
	}
		System.out.println("-------------------------------------------------------");
		ListIterator<HRdto> listIterator=collection.listIterator(collection.size());
		
		while (listIterator.hasPrevious()) {
			HRdto ref = listIterator.previous();
			System.out.println(ref);
		}
		

	}

}
