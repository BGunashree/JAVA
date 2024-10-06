package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.LinkedList;

//import javax.swing.text.html.HTMLDocument.Iterator;

import com.xworkz.collections.dto.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {
		
		MatchBoxDTO<Double,String> matchBoxDTO=new MatchBoxDTO<Double,String>(5.0,"pushpa");
		MatchBoxDTO<Double,String> matchBoxDTO1=new MatchBoxDTO<Double,String>(3.0,"asia");
		MatchBoxDTO<Double,String> matchBoxDTO2=new MatchBoxDTO<Double,String>(2.0,"Goodness");
		MatchBoxDTO<Integer,String> matchBoxDTO3=new MatchBoxDTO<Integer,String>(10,"safety");
		MatchBoxDTO<Integer,String> matchBoxDTO4=new MatchBoxDTO<Integer,String>(5,"saijee");
		
		System.out.println(matchBoxDTO1.getBrand());
		Collection<MatchBoxDTO> collection=new LinkedList<MatchBoxDTO>();
		collection.add(matchBoxDTO);
		collection.add(matchBoxDTO1);
		collection.add(matchBoxDTO2);
		collection.add(matchBoxDTO3);
		collection.add(matchBoxDTO4);
		
		System.out.println("size is"+collection.size());
		System.out.println("is it empty"+collection.isEmpty());
		
		//Iterator<MatchBoxDTO> iterator=collection.iterator();
		java.util.Iterator<MatchBoxDTO>  iterator=collection.iterator();
		while(iterator.hasNext())
		{
			MatchBoxDTO ref=iterator.next();
			System.out.println(ref);
		}
		
		
		collection.clear();
		System.out.println("size"+collection.size());
		System.out.println("empty"+collection.isEmpty());
	}

	
}
