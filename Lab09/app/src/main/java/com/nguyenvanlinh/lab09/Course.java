package com.nguyenvanlinh.lab09;

public class Course {
    private int id;
    private String courseName;
    private String courseTracks;
    private String courseDuration;
    private String courseDescription;
    public Course(int id, String courseName, String courseTracks, String courseDuration, String courseDescription) {
        this.id = id;
        this.courseName = courseName;
        this.courseTracks = courseTracks;
        this.courseDuration = courseDuration;
        this.courseDescription = courseDescription;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseTracks() {
        return courseTracks;
    }
    public void setCourseTracks(String courseTracks) {
        this.courseTracks = courseTracks;
    }
    public String getCourseDuration() {
        return courseDuration;
    }
    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}

