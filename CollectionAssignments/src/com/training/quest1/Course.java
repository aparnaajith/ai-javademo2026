package com.training.quest1;



public class Course {

    private String courseName;
    private String type;

    public Course(String courseName, String type) {
        this.courseName = courseName;
        this.type = type;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Course Name = " + courseName +
               ", Type = " + type;
    }
}