package practice.cloningObjects;

import java.util.Date;

public class Student implements Cloneable {
    private Date yearSet;
    private int group;

    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }

    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }

    public Object clone() throws CloneNotSupportedException {
        Student stud = (Student) super.clone();
        stud.yearSet = (Date) this.yearSet.clone();
        return stud;
    }
}
