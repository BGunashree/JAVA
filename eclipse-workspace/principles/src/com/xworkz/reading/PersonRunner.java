package com.xworkz.reading;

public class PersonRunner {

	public static void main(String[] args) {
		
		
		PersonStore personStore=new PersonStore();
		
		Person person1=new Person("gunashree","gunashreebayanna@gmail.com",8951144517l);
		personStore.store(person1);
		
		Person person2=new Person("supritha","suprithav03@gmail.com",8951144679l);
		personStore.store(person2);

		Person person3=new Person("desha","deshaanu1998@gmail.com",9739611655l);
		personStore.store(person3);
	
		Person person4=new Person("divya","divyav@gmail.com",9876543210l);
		personStore.store(person4);
		
		Person person5=new Person("sindhu","sindhukm21@gmail.com",8976543234l);
		personStore.store(person5);
		
		personStore.display();
		
		
		
		

	}

}
