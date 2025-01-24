package university;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Faculty facultyName;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String name, Faculty faculty) {
        this.courseName = name;
        this.facultyName = faculty;
    }

    public Course(String name) {
        this.courseName = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Faculty getFacultyName() {
        return facultyName;
    }

    public void setFaculty(Faculty facultyName) {
        this.facultyName = facultyName;
    }

    public void printInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + facultyName.getTeacherName());
        System.out.println("Students: ");
        for(int i = 0; i < students.size(); i++) {
            String name = students.get(i).getName();
            int age = students.get(i).getAge();
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}
