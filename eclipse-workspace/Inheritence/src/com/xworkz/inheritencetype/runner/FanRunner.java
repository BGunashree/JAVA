package com.xworkz.inheritencetype.runner;

import com.xworkz.inheritthing.TableFan;

public class FanRunner {

	public static void main(String[] args) {
		TableFan tablefan=new TableFan("Crompton",3000,"black");
		tablefan.display();
		tablefan.turnOff();
		tablefan.turnOn();

	}

}
