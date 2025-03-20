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

## Spring App 
### road 1
Create: 
1. package 'model' -> class 'UserEntity' (here we create fields for our table)
2. package 'dto' (data transfer object) -> class 'User' (here we create types which user will have)
3. package "controller" -> class 'UserController' (here we create methods for our app), here we use @RestController
   1. here we should connect 'UserContoller' with 'UserService'
   2. 'UserContoller' will do *mapping*, and sends everything to 'UserService'
   3. @RequerdArgsConstructor - creates constructor with all fields, connect with *final*
4. package 'service' -> class 'UserService' (here we create methods for our app), here we use @Service
    1. here we should connect 'UserService' with 'UserRepository'
    2. 'UserService' will do *business logic*, and sends everything to 'UserRepository'
    3. @RequerdArgsConstructor - creates constructor with all fields, connect with *final*
5. package 'repository' -> interface 'UserRepository' (here we create methods for our table), extends JpaRepository<UserEntity, UUID>

### road 2
Create:
1. in 'UserService' -> method 'createUser' (here we create user), using 'UserEntity', builder(), build(), save()

check this moment in 'UserService'
```java
    public List<User> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userEntity -> User.builder()
                        .uuid(userEntity.getUuid())
                        .username(userEntity.getUsername())
                        .password(userEntity.getPassword())
                        .name(userEntity.getName())
                        .surname(userEntity.getSurname())
                        .balance(userEntity.getBalance())
                        .userRole(userEntity.getUserRole())
                        .createdAt(userEntity.getCreatedAt())
                        .build())
                .toList();
    }
```
2. in 'application.properties' -> add 'spring.jpa.hibernate.ddl-auto=update' (here we create table in our database)
3. in 'compose.yml' -> add 'ports' (here we create connection between our app and database)
4. create package 'scripts' -> 'init.sql' for start our database