package practice.cloningObjects;

import java.util.Date;

public class Main {
    public static void main(String[] arg) throws Exception {
        // Cloning with Clounable interface
        Date dd = new Date(System.currentTimeMillis());
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);

        // Cloning with constructor copy
        ClassA obj1 = new ClassA();
        ClassA obj2 = new ClassA(obj1);
    }
}
