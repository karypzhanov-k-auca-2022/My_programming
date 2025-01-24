package university;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane");
        Student student3 = new Student("Jack", 21);
        Student student4 = new Student("Jill");

        Faculty faculty = new Faculty("Dr. Smith");
        Course course = new Course("Math");
        Course course2 = new Course("Science", faculty);

        course.addStudent(student1);
        course.addStudent(student2);
        course.setFaculty(faculty);
        course.printInfo();

        System.out.println("-------------------");
        course2.addStudent(student3);
        course2.addStudent(student4);
        course2.printInfo();
    }
}