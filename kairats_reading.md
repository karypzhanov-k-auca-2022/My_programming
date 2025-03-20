## Aggregation and Composition

owner object - aggregating object
it's class called - aggregating class

subject object - aggregated object
it's class called - aggregated class

1 obj - 2 obj = composition if 1 depends on 2
composition relationship - Student class and Name class, Name depends on Student
aggregation relationship - Addres and Student. NO depends, can exist seperatly

## Plan to study part Java

1. Java Fundamentals: Variables, Operators, Primitives
2. Java Fundamentals: One-Multi-dimensional Arrays, Class Arrays
3. Java Basics: Intro to OOP, OOP principles, Packages, Var-arg methods, Overloading, Overrides
4. Java Basics: class Object, class Enum, Nested classes, Generics, Abstract classes & Interfaces
5. Java Basics: Exceptions, Exception handling
6. Java Basics: Strings, Create and manipulate Strings & Text blocks, classes StringBuilder & StringBuffer
7. Java Collections: List & Deque, Sets, Maps, class Collections
8. Java 8: Functional Interfaces & Lambda Expressions, Intermediate & Terminal operations, Method references
9. Java 8: Collectors operations
10. Java IO: Read & write console, Scanner, Formatter, I\O Streams
11. Java IO: Read & write file data, I\O Streams

https://github.com/borymskyi/roadmap-java-sng?tab=readme-ov-file#java-core link

# 18.03.2025
1. Java SE - Standard Edition (for Standard Desktop Applications)
2. Java EE - Enterprise Edition (for Enterprise Applications)
3. Java ME - Micro Edition or Mobile Applications (for Mobile Applications)

1. Compiler javac - translates source code into bytecode
2. JVM - Java Virtual Machine - translates bytecode into machine code
3. JRE - Java Runtime Environment - JVM + libraries
4. JDK - Java Development Kit - JRE + tools for development
5. IDE - Integrated Development Environment - Eclipse, IntelliJ IDEA, NetBeans

Text (Hello, World!) -> source code (HelloWorld.java) -> bytecode (HelloWorld.class) -> machine code (HelloWorld.exe)

## Lesson 4: classes and objects
example:

```java
public class practice {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1; // HERE WE HAVE 2 REFERENCES TO THE SAME OBJECT

        System.out.println(car1.color);
        System.out.println(car1.maxSpeed);
        System.out.println("-----------------");
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);
    }

    static class Car {
        String color = "red";
        int maxSpeed = 100;
    }
}
```

# 20.03.25
## Spring App 
for file pom.xml
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.testcontainers</groupId>
            <artifactId>testcontainers-bom</artifactId>
            <version>1.20.6</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

In Application properties we usaully write 
1. sql connection
2. show local hubernate
3. admin password

