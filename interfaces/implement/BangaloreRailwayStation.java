package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.RailwayStationRule;

public class BangaloreRailwayStation implements RailwayStationRule{

	@Override
	public void carryValidTickets() {
		System.out.println("Carried valid tickets.");
	}

	@Override
	public void avoidLittering() {
		System.out.println("No littering in station.");
	}

	@Override
	public void avoidSpitting() {
		System.out.println("Spitting avoided.");
	}

	@Override
	public void respectBoardingTimings() {
		System.out.println("Boarding timings respected.");
	}

	@Override
	public void avoidBlockingGates() {
		System.out.println("Gates not blocked.");
	}

	@Override
	public void avoidSmoking() {
		System.out.println("Smoking avoided.");
	}

	@Override
	public void maintainQueueAtTicketCounters() {
		System.out.println("Queue maintained at ticket counters.");
	}

	@Override
	public void avoidCrossingTracks() {
		System.out.println("Tracks not crossed unnecessarily.");
	}

	@Override
	public void respectRailwayStaff() {
		System.out.println("Railway staff respected.");
	}

	@Override
	public void keepNoiseLevelsLow() {
		System.out.println("Noise levels kept low.");
	}

	@Override
	public void avoidUnnecessaryLuggage() {
		System.out.println("Unnecessary luggage avoided.");
	}

	@Override
	public void followTrainTimings() {
		System.out.println("Train timings followed.");
	}

	@Override
	public void standBehindSafetyLines() {
		System.out.println("Stood behind safety lines.");
	}

	@Override
	public void avoidUnnecessaryPlatformUse() {
		System.out.println("Unnecessary platform use avoided.");
	}

	@Override
	public void maintainCleanlinessInTrains() {
		System.out.println("Cleanliness in trains maintained.");
	}

}
