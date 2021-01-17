package by.bzmp.swat.HomeWorkJavaClasses.domain;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> StudentList = new ArrayList<Student>();

    public void addStudent(Student student) {
        StudentList.add(student);
    }

    public List<Student> getListByFaculty(String faculty) {
        List<Student> facultyList = new ArrayList<Student>();

        for (Student stud : StudentList) {
            if (stud.getFaculty().equals(faculty)) {
                facultyList.add(stud);
            }
        }
        return facultyList;
    }

    public ArrayList<Student> getListByGroup(String group) {
        ArrayList<Student> groupList = new ArrayList<Student>();
        for (Student stud : StudentList) {
            if (stud.getGroup().equals(group)) {
                groupList.add(stud);
            }
        }
        return groupList;
    }

    public ArrayList<Student> getListByCourse(int course) {
        ArrayList<Student> courseList = new ArrayList<Student>();
        for (Student stud : StudentList) {
            if (stud.getCourse() == course) {
                courseList.add(stud);
            }
        }
        return courseList;
    }

    public ArrayList<Student> getListByDateOfBirth(int yearBirth) {
        ArrayList<Student> dateList = new ArrayList<Student>();
        for (Student stud : StudentList) {
            if (stud.getYearOfBirth() > yearBirth) {
                dateList.add(stud);
            }
        }
        return dateList;
    }

    private String nameUniversity;

    public University(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }
}
