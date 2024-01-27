package com.proftelran.org.homework14.TaskThree;

public class Student {

    private String name;
    private double rate;
    private boolean finished;

    private ClassType type;

    public Student(String name, double rate, boolean finished) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public boolean isFinished() {
        return finished;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", finished=" + finished +
                ", type=" + type +
                '}';
    }
}
