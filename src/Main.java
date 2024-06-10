
import dto.Student;
import dto.Subject;
import dto.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();

        do{
            System.out.println("----Welcome Teaching System-----");
            System.out.println("1. Create a Student");
            System.out.println("2. Create a Teacher");
            System.out.println("3. Create a Subject");
            System.out.println("4. Print Students");
            System.out.println("5. Print Teachers");
            System.out.println("6. Print Subjects");
            System.out.println("7.  Exit");
            System.out.println("Enter a option");
            option = scanner.nextInt();

            switch(option) {
                case 1:

                Student student = createStudent();
                studentList.add (student);
                    break;
                case 2:

                    Teacher teacher = createTeacher();
                    teacherList.add (teacher);
                    break;
                case 3:

                    Subject subject = createSubject(teacherList, studentList);
                    subjectList.add(subject);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Summary of student admitted");
                    for(Student st1: studentList){
                        st1.printStudentProperties();
                        System.out.println();
                    }

                    break;
                case 5:
                    System.out.println();
                    System.out.println("Summary of teacher admitted");
                    for(Teacher tch1: teacherList){
                        tch1.printTeacherProperties();
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println();
                    for(Subject sbj1 : subjectList ){
                        sbj1.printSubjectProperties();
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("****Exit****");
                    break;
            }
        } while (option != 7);
    }
public static Student createStudent(){
        Scanner scStudent = new Scanner(System.in);
        System.out.println();
        System.out.println("Student Creation");
        System.out.println("Enter student name");
        String nameStudent = scStudent.next();
        System.out.println("Enter student lastname");
        String lastNameStudent = scStudent.next();
        System.out.println("Enter student age");
        int ageStudent = scStudent.nextInt();
        System.out.println("Enter the student's code ");
        String studentCode = scStudent.next();
        System.out.println("Enter the student's semester number");
        int noOfSemester = scStudent.nextInt();
        return new Student(nameStudent, lastNameStudent, ageStudent, studentCode, noOfSemester);
    }

    public static Teacher createTeacher(){
        Scanner scTeacher = new Scanner(System.in);
        System.out.println();
        System.out.println("Teacher Creation");
        System.out.println("Enter teacher name");
        String nameStudent = scTeacher.next();
        System.out.println("Enter teacher lastname");
        String lastNameStudent = scTeacher.next();
        System.out.println("Enter teacher age");
        int ageStudent = scTeacher.nextInt();
        System.out.println("Enter the teacher's code");
        String studentCode = scTeacher.next();
        System.out.println("Enter the teacher's experience years");
        int noOfSemester = scTeacher.nextInt();
        return new Teacher(nameStudent, lastNameStudent, ageStudent, studentCode, noOfSemester);
    }
    public static void printTeacherList(List<Teacher> teacherList){
        int index = 1;
        for(Teacher teacher  : teacherList){
            System.out.println(index + " . " + teacher.getName().toUpperCase() + " - " + teacher.getLastName().toUpperCase());
            index = index + 1;
        }
    }

    public static void printStudentList(List<Student> studentList){
        int index = 1;
        for(Student student  : studentList){
            System.out.println(index + " . " + student.getName().toUpperCase() + " - " + student.getLastName().toUpperCase());
            index = index + 1;
        }
    }

    public static Subject createSubject(List<Teacher> teacherList,List<Student> studentList ){
        Scanner scSubject = new Scanner(System.in);
        System.out.println();
        System.out.println("Subject Creation");
        System.out.println("Enter subject name");
        String nameSubject = scSubject.next();

        System.out.println("Enter select a teacher: ");
        printTeacherList(teacherList);
        int teacherOption = scSubject.nextInt();
        Teacher teacher = teacherList.get(teacherOption - 1);

        List<Student> students = new ArrayList<>();

        System.out.println("Please enter the no. Students to register: ");
        int noOfStudent = scSubject.nextInt();

        for(int n = 0; n < noOfStudent; n++) {
            System.out.println("Enter select a student: ");
            printStudentList(studentList);
            int studentOption = scSubject.nextInt();
            Student student = studentList.get(studentOption - 1);
            students.add(student);
        }
        return new Subject(nameSubject,teacher,students);
    }
}
