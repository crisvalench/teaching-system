package dto;

import java.util.List;

public class Subject {
    private String name;
    private Teacher teacher;
    private List<Student> studentList;

    public Subject (){

    }

    public Subject(String name, Teacher teacher, List<Student> studentList) {
        this.name = name;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public void printSubjectProperties(){
        System.out.println("**** Subject ****");
        System.out.println("Subject: "+name);
        System.out.println("Teacher:" +teacher.getName() + " - " +teacher.getLastName());
        System.out.println("**** Students ****");
        int index=1;
        for(Student st1: studentList){
            System.out.println("Student " +index+++ " . " +st1.getName()+ " - "+st1.getLastName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
