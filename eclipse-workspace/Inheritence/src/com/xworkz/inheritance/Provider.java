package com.xworkz.inheritance;

public abstract class Provider {
	
	public String name;
	public String ceoName;
	
	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj==this)
		{
			return true;
		}
		if(obj==null || getClass()!=obj.getClass()) 
			return false;
		Provider provider=(Provider)obj;
		
		return name.equals(provider.name) && ceoName.equals(provider.ceoName);
	}

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}
	
	public abstract void service();
	
	

}
