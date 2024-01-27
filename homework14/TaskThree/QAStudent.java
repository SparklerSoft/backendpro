package com.proftelran.org.homework14.TaskThree;

public class QAStudent extends Student{
    public QAStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getRate() {
        return super.getRate();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }

    @Override
    public ClassType getType() {
        return super.getType();
    }

    @Override
    public void setType(ClassType type) {
        super.setType(type);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
