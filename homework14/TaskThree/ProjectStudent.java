package com.proftelran.org.homework14.TaskThree;

public class ProjectStudent extends Student{

    private String name;
    private double rate;
    private ClassType type;
    private boolean finished;

    public ProjectStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public ClassType getType() {
        return type;
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    @Override
    public String toString() {
        return "ProjectStudent{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type=" + type +
                ", finished=" + finished +
                '}';
    }
}
