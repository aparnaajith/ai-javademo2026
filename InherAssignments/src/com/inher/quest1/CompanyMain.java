package com.inher.quest1;

public class CompanyMain {

	public static void main(String[] args) {

		// TeamOne object using parent reference
		Project project = new TeamOne();

		// Calls overridden method of TeamOne
		project.doTask();

		// To call TeamOne's own method,
		// convert parent reference to TeamOne
		TeamOne teamOne = (TeamOne) project;

		teamOne.softwaresUsed("Eclipse", "Jenkins", "Maven");

		System.out.println("-------------------------");

		// TeamTwo object using parent reference
		project = new TeamTwo();

		// Calls overridden method of TeamTwo
		project.doTask();

		// To call TeamTwo's own method
		TeamTwo teamTwo = (TeamTwo) project;

		String[] technologies = teamTwo.getTechStack();

		System.out.println("Technology Stack:");

		for (String technology : technologies) {
			System.out.println(technology);
		}
	}
}