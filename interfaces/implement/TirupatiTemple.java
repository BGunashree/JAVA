package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.TempleRule;

public class TirupatiTemple implements TempleRule {

	@Override
	public void maintainCleanliness() {
		System.out.println("Cleanliness in temple maintained.");
	}

	@Override
	public void wearTraditionalAttire() {
		System.out.println("Traditional attire worn.");
	}

	@Override
	public void removeFootwearOutside() {
		System.out.println("Footwear removed outside.");
	}

	@Override
	public void avoidLoudTalking() {
		System.out.println("Avoided loud talking.");
	}

	@Override
	public void standInQueue() {
		System.out.println("Stood in queue.");
	}

	@Override
	public void offerPrayersSilently() {
		System.out.println("Prayers offered silently.");
	}

	@Override
	public void avoidTakingPhotos() {
		System.out.println("Avoided taking photos.");
	}

	@Override
	public void respectTempleStaff() {
		System.out.println("Temple staff respected.");
	}

	@Override
	public void followDarshanTimings() {
		System.out.println("Darshan timings followed.");
	}

	@Override
	public void avoidTouchingHolyIdols() {
		System.out.println("Avoided touching holy idols.");
	}

}
