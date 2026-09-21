package com.inher.quest1;

public class TeamTwo extends Project {

	@Override
	void doTask() {
		System.out.println("Project implemented using Python");
		super.doTask();
	}

	
	String[] getTechStack() {

        String[] techStack = {
            "Java",
            "Spring",
            "Angular"
        };

        return techStack;
    }

}
