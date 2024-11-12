package Laba1;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Student alex = new Student("Alex", 59, 5, 4);
        Student agata = new Student("Agata", 312, 3, 5);
        Student keri = new Student("Keri", 17, 1, 2);
        Student tom = new Student("Tom", 54, 5, 3);
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(alex);
        studentList.add(agata);
        studentList.add(keri);
        studentList.add(tom);

        studentList.forEach(System.out::println);

        System.out.println("- - - - - - - - - - - - - - - - - - -");


        studentList.removeIf(student -> student.getGrades() < 3 );
        for (Student student : studentList){
            System.out.println("Студет: " + student.getName() + " переведен на следующий курс");
        }
        System.out.println("- - - - - - - - - - - - - - - - - - -");

        printStudent(studentList, 3);
  }
    public static void printStudent(ArrayList<Student> studentList, int course){
        for (Student student: studentList){
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " обучается на " + course + " курсе");
            }
        }
    }
}
