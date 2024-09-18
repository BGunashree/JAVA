package com.xworkz.datatype.runner;

import com.xworkz.datatype.Dboss;
import com.xworkz.datatype.Godse;
import com.xworkz.datatype.Gun;
import com.xworkz.datatype.Police;
import com.xworkz.datatype.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		Soldier soldier=new Soldier();
		soldier.shoot();
		System.out.println("------------------------------");
		
		
		Police police=new Police();
		police.load(new Gun("AMT","India","Pistol"));
		System.out.println("------------------------------");
		
		Gun gun=new Gun("Armsel","India","shotgun");
		Dboss dboss=new Dboss(gun);
		dboss.killed();
		System.out.println("------------------------------");
		
		Godse godse=new Godse();
		godse.fire(gun);

	}

}
