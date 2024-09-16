package com.xworkz.interfaces.rule.runner;

import com.xworkz.interfaces.rule.BankRule;
import com.xworkz.interfaces.rule.CollegeRule;
import com.xworkz.interfaces.rule.HospitalRule;
import com.xworkz.interfaces.rule.RailwayStationRule;
import com.xworkz.interfaces.rule.TempleRule;
import com.xworkz.interfaces.rule.TrafficRule;
import com.xworkz.interfaces.rule.implement.AsterHospitalRule;
import com.xworkz.interfaces.rule.implement.BangaloreRailwayStation;
import com.xworkz.interfaces.rule.implement.CitechCollege;
import com.xworkz.interfaces.rule.implement.CityTraffic;
import com.xworkz.interfaces.rule.implement.KotakBankRule;
import com.xworkz.interfaces.rule.implement.TirupatiTemple;

public class RulesRunner {

	public static void main(String[] args) {
		
		
		HospitalRule hospitalrule=new 	AsterHospitalRule();
		hospitalrule.followVisitingHours();
		hospitalrule.maintainSilence();
		hospitalrule.sanitizeHands();
		System.out.println("-----------------------------------------------");
		
		TrafficRule trafficRule=new CityTraffic();
		trafficRule.avoidDrinkAndDrive();
		trafficRule.avoidMobileUsage();
		trafficRule.avoidOvertakingInCrowdedAreas();
		trafficRule.driveWithinRoadCapacity();
		trafficRule.followLaneDiscipline();
		trafficRule.followSpeedLimits();
		trafficRule.maintainDistance();
		trafficRule.obeyTrafficSignals();
		trafficRule.parkOnlyInDesignatedAreas();
		trafficRule.respectTrafficPolice();
		System.out.println("-----------------------------------------------");
		
		BankRule bankRule=new KotakBankRule();
		bankRule.avoidFraudulentActivities();
		bankRule.avoidLoudConversations();
		bankRule.avoidMobileUsage();
		bankRule.avoidSharingPINs();
		bankRule.carryValidID();
		bankRule.cooperateWithBankStaff();
		bankRule.followAccountOpeningRules();
		bankRule.followLoanRules();
		bankRule.keepTrackOfTransactions();
		bankRule.maintainConfidentiality();
		bankRule.maintainQueue();
		bankRule.respectBankTimings();
		bankRule.respectOtherCustomersPrivacy();
		bankRule.signDocumentsCorrectly();
		bankRule.useOnlineBankingForBasicTasks();
		System.out.println("---------------------------------------------------");
		
		
		CollegeRule collegeRule=new CitechCollege();
		collegeRule.attendClassesRegularly();
		collegeRule.attendExams();
		collegeRule.avoidCheatingInExam();
		collegeRule.beOnTime();
		collegeRule.followDressCode();
		collegeRule.keepCampusClean();
		collegeRule.maintainDiscipline();
		collegeRule.maintainLibrarySilence();
		collegeRule.respectFaculty();
		collegeRule.submitAssignmentsOnTime();
		System.out.println("---------------------------------------------------------");
		
		RailwayStationRule railWayStationRule=new BangaloreRailwayStation();
		railWayStationRule.avoidBlockingGates();
		railWayStationRule.avoidCrossingTracks();
		railWayStationRule.avoidLittering();
		railWayStationRule.avoidSmoking();
		railWayStationRule.avoidSpitting();
		railWayStationRule.avoidUnnecessaryLuggage();
		railWayStationRule.avoidUnnecessaryPlatformUse();
		railWayStationRule.carryValidTickets();
		railWayStationRule.followTrainTimings();
		railWayStationRule.keepNoiseLevelsLow();
		railWayStationRule.standBehindSafetyLines();
		railWayStationRule.respectRailwayStaff();
		railWayStationRule.respectBoardingTimings();
		railWayStationRule.maintainQueueAtTicketCounters();
		railWayStationRule.maintainCleanlinessInTrains();
		System.out.println("-------------------------------------------------");
		
		TempleRule templeRule=new TirupatiTemple();
		
		templeRule.avoidLoudTalking();
		templeRule.avoidTakingPhotos();
		templeRule.avoidTouchingHolyIdols();
		templeRule.wearTraditionalAttire();
		templeRule.standInQueue();
		templeRule.respectTempleStaff();
		templeRule.removeFootwearOutside();
		templeRule.offerPrayersSilently();
		templeRule.maintainCleanliness();
		templeRule.followDarshanTimings();
		System.out.println("----------------------------------------------");
		
		
		
		

	}

}
