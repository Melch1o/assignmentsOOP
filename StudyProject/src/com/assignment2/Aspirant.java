package com.assignment2;

public class Aspirant extends Student {

    private String researchPaperTheme = "There's no research paper theme. Please set it";

    @Override
    public int getScholarship() {
        if (averageMark == 5) return 200;
        else return 180;
    }

    public Aspirant() {}

    public Aspirant(String firstName) {
        this.firstName = firstName;
    }

    public Aspirant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Aspirant(String firstName, String lastName, String group) {
        this(firstName, lastName);
        this.group = group;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        this(firstName, lastName, group);
        this.averageMark = averageMark;
    }

    public Aspirant(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setResearchPaperTheme(String researchPaperTheme) {
        this.researchPaperTheme = researchPaperTheme;
    }

    public String getResearchPaperTheme() {
        return researchPaperTheme;
    }
}
