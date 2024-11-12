package Laba1;
public class Student {

     String name;
     int group;
     int course;
     int grades;

    public Student(String name, int group, int course, int grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;

    }
    static {
        System.out.println("Список студентов:");
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrades() {
        return grades;
    }

    public String toString(){
        return "Студет: " + name + " " + group + " группа " + course + " курс" + " Оценка " + grades;
    }

}
