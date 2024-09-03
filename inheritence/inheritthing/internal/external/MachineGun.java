package com.xworkz.practise.external;

import com.xworkz.practise.internal.Weapon;

public class MachineGun  extends Weapon{
	
	@Override
	protected void use()
	{
		System.out.println("running use in MachineGun");
	}
	@Override
	public void fire()
	{
		System.out.println("running fire in MachineGun");
	}
	
	public void purchase()
	{
		super.use();
		use();
		fire();
		super.fire();
		
	}
	
	

}
