package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.xworkz.collections.dto.EmailDTO;

public class EmailDTORunner {

	public static void main(String[] args) {
		
		
		EmailDTO emailDTO=new EmailDTO("bgunashree366@gmail.com", "akshaygowda1997@gmail.com", "Invitation", "Not Invited");
		EmailDTO emailDTO1=new EmailDTO("bgunashree366@gmail.com", "gunashreebayanna@gmail.com", "remainder", "blah blah");
		EmailDTO emailDTO2=new EmailDTO("bgunashree366@gmail.com", "sindhu02@gmail.com", "checking up", "hoping");
		EmailDTO emailDTO3=new EmailDTO("bgunashree366@gmail.com", "suprithashoba@gmail.com", "congrats on getting job", "congrats");
		EmailDTO emailDTO4=new EmailDTO("bgunashree366@gmail.com", "dishaanu32@gmail.com", "thanking note", "thanks");
		EmailDTO emailDTO5=new EmailDTO("bgunashree366@gmail.com", "jayalakshmi@gmail.com", "meeting schedule", "thanks");
		Collection<EmailDTO> collection=new ArrayList<EmailDTO>();
		/*collection.add(emailDTO);
		collection.add(emailDTO1);
		collection.add(emailDTO2);
		collection.add(emailDTO3);
		collection.add(emailDTO4);*/
		System.out.println("is empty:"+collection.isEmpty());
	   boolean value= Collections.addAll(collection,emailDTO,emailDTO1,emailDTO2,emailDTO3,emailDTO4 );
	   System.out.println(value);
	   collection.forEach(ref->System.out.println(ref));
	   Collection<EmailDTO> collection1=new ArrayList<EmailDTO>();
	  
	   System.out.println("-----------------------------addall-------------------------------");
	   collection1.addAll(collection);
	   collection1.forEach(ref->System.out.println(ref));
	   
	   System.out.println("----------iterator-------------------");
	  Iterator<EmailDTO> iterator= collection1.iterator();
	  while(iterator.hasNext())
	  {
		  System.out.println(iterator.next());
	  }
	 
	   
	   System.out.println("-----------------------size-----------------------");
	  System.out.println(collection1.size());
	 
	  System.out.println("----------------contains------------------------");
	 System.out.println( collection.contains(emailDTO5));
	 System.out.println( collection.contains(emailDTO4));
	 
	 System.out.println("--------------------containsAll----------------------");
	 collection.add(emailDTO5);
	 System.out.println(collection.containsAll(collection1));
	  
	  System.out.println("-----------------------remove-----------------------");
	   System.out.println(collection1.remove(emailDTO5));
	   System.out.println(collection1.remove(emailDTO2));
	  
	   
	   System.out.println("--------------------after remove-------------");
	   collection1.forEach(ref->System.out.println(ref));
	   
	   
	   System.out.println("---------------------remove all--------------------");
	   collection.removeAll(collection1);
	   collection.forEach(ref->System.out.println(ref));
	   
	   System.out.println("------------------------removeIf-------------------");  
	   boolean removed= collection1.removeIf(ref->ref.getTo()=="gunashreebayanna@gmail.com");
	   System.out.println(removed);
	   collection1.forEach(ref->System.out.println(ref));
	   
	   System.out.println("------------------retainAll---------------");
	   //deletes all the elements of invoking collection.
	   collection1.retainAll(collection);  
	   System.out.println("is empty:"+collection1.isEmpty());
	   
	   System.out.println("-----------clear--------------");
	   System.out.println("is empty:"+collection.isEmpty());
	   collection.clear();
	   System.out.println("is empty:"+collection.isEmpty());
	  
	   
	  

	}

}
