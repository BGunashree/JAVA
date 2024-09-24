package com.xworkz.principlee.partialabstraction;

public class MonitorRunner {

	public static void main(String[] args) {
		
		
		Monitor monitor=new DellMonitor();
		monitor.turnOn();
		monitor.turnOff();

	}

}
