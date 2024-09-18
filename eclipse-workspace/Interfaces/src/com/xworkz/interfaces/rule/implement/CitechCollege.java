package com.xworkz.interfaces.rule.implement;

import com.xworkz.interfaces.rule.CollegeRule;

public class CitechCollege implements CollegeRule{

	@Override
	public void attendClassesRegularly() {
		System.out.println("Attended classes regularly.");
	}

	@Override
	public void submitAssignmentsOnTime() {
		System.out.println("Assignments submitted on time.");
	}

	@Override
	public void followDressCode() {
		System.out.println("Dress code followed.");
	}

	@Override
	public void maintainDiscipline() {
		System.out.println("Discipline maintained.");
	}

	@Override
	public void respectFaculty() {
		System.out.println("Faculty respected.");
	}

	@Override
	public void attendExams() {
		System.out.println("Participated in exams.");
	}

	@Override
	public void avoidCheatingInExam() {
		System.out.println("Cheating avoided.");
	}

	@Override
	public void beOnTime() {
		System.out.println("Seminars attended.");
	}

	@Override
	public void keepCampusClean() {
		System.out.println("Campus cleanliness maintained.");
	}

	@Override
	public void maintainLibrarySilence() {
		System.out.println("Silence in library maintained.");
	}

}
