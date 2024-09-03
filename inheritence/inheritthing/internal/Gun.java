package com.xworkz.practise.internal;

public class Gun extends Weapon {
	

	
	protected void use()
	{
		System.out.println("running use in Gun");
	}
	public void fire()
	{
		System.out.println("running fire in gun");
	}
	public void load()
	{
		use();
		super.use();
		fire();
		this.fire();
	}

}
