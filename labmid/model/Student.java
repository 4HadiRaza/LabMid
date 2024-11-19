package labmid.model;

import labmid.observer.Observer;

public class Student implements Observer {
    private final String name;
    private final int age;
    private final int grade;
    private int testScore;
    private int interviewScore;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public int getInterviewScore() {
        return interviewScore;
    }

    public void setInterviewScore(int interviewScore) {
        this.interviewScore = interviewScore;
    }

    // Observer method to receive updates
    @Override
    public void update(String message) {
        System.out.println("Message for " + name + ": " + message);
    }
}
