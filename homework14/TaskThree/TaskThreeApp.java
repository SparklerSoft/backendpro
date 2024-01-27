package com.proftelran.org.homework14.TaskThree;

import java.util.ArrayList;
import java.util.List;

public class TaskThreeApp {

    public static void main(String[] args) {
        List<Student> backEndStudentList = new ArrayList<>();
        backEndStudentList.add(new Student("Maxim", 4.85, true));
        backEndStudentList.add(new Student("Oleg", 4.9, true));
        backEndStudentList.add(new Student("Fedor", 3.51, false));
        backEndStudentList.add(new Student("Mikola", 3.44, false));
        backEndStudentList.add(new Student("Harry", 4.98, true));

        List<Student> frontEndStudentList = new ArrayList<>();
        frontEndStudentList.add(new Student("Billy", 4.02, true));
        frontEndStudentList.add(new Student("Jimmy", 4.58, false));
        frontEndStudentList.add(new Student("John", 4.32, true));
        frontEndStudentList.add(new Student("Dutch", 4.99, true));
        frontEndStudentList.add(new Student("Kazim", 2.32, false));

        List<Student> qaStudentList = new ArrayList<>();
        qaStudentList.add(new Student("Islam", 3.99, false));
        qaStudentList.add(new Student("Habib", 3.98, false));
        qaStudentList.add(new Student("Aslan", 3.92, false));
        qaStudentList.add(new Student("Ramzan", 4.00, false));
        qaStudentList.add(new Student("Akhtar", 4.22, true));


        ArrayList<List<Student>> studentList = new ArrayList<>();
        studentList.add(backEndStudentList);
        studentList.add(frontEndStudentList);
        studentList.add(qaStudentList);

        List<ProjectStudent> projectStudents = studentList.stream()
                .flatMap(List::stream)
                .filter(student -> student.getRate() > 4.5 && student.isFinished())
                .map(student -> {
                    ProjectStudent projectStudent = new ProjectStudent(student.getName(), student.getRate(), student.isFinished());
                    if (student instanceof BackEndStudent) {
                        projectStudent.setType(ClassType.BA);
                    } else if (student instanceof FrontEndStudent) {
                        projectStudent.setType(ClassType.FA);
                    } else if (student instanceof QAStudent) {
                        projectStudent.setType(ClassType.QA);
                    }
                    return projectStudent;
                })
                .peek(projectStudent -> {
                    System.out.println("Name: " + projectStudent.getName() +
                            ", Rating: " + projectStudent.getRate() +
                            ", Finished: " + projectStudent.isFinished() +
                            ", Type: " + projectStudent.getType());
                })
                .toList();

        System.out.println(projectStudents);




    }
}

