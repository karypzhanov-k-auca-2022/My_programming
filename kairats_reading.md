# C++ Конспект

## 1. Оптимальная структура подпрограмм (Optimal Substructure)

## 2. Заголовочные файлы

Используйте заголовочные файлы, чтобы не компилировать весь код.

## 3. Структуры данных

### Связанный список (Linked List) и массив (Array)

- Чтение: `O(1)`, `O(n)`
- Запись: `O(1)`, `O(n)`
- Вставка: `O(n)`, `O(1)`
- Удаление: `O(n)`, `O(1)`
- Журнал (log) и очередь (queue)

### Стек (Stack) и Очередь (Queue)

- **Stack**: Первым пришёл - последним вышел (**LIFO**)
- **Queue**: Первым пришёл - первым вышел (**FIFO**)

## 4. Перегрузка (Overloading) и Переопределение (Overriding)

### Перегрузка (Overloaded)

```cpp
void myFunction(int x);
void myFunction(double y);
```

Методы с одинаковыми именами, но разными параметрами.

### Переопределение (Overriding)

```cpp
class Base {
public:
    virtual void myFunction() { }
};

class Derived : public Base {
public:
    void myFunction() override { }
};
```

Использование `override` для изменения поведения метода базового класса.

## 5. Контейнеры STL

### `set` (упорядоченное множество)

```cpp
#include <set>
```

- Добавляет **уникальные** элементы
- Автоматически **сортирует**

### `unordered_set` (неупорядоченное множество)

```cpp
#include <unordered_set>
```

- Добавляет **уникальные** элементы
- **Не сортирует**

### `map` (отображение)

```cpp
#include <map>
map<string, int> nameToAge;
nameToAge["Alice"] = 30;
nameToAge["Bob"] = 25;
nameToAge["Alice"] = 32; // Обновление значения
```

## 6. Преобразование строки в число

```cpp
int stringToNumber(const string &digits) {
    int number = 0;
    for (char digit : digits) {
        number = number * 10 + (digit - '0'); // "123" -> 123
    }
    return number;
}
```

## 7. Итерация по строкам и контейнерам

### Проверка на дубликаты

```cpp
for (char i : copy) {
    if (duplicates.count(i)) {
        result += types[1];
    } else {
        result += types[0];
    }
}
```

### Итерация от начала

```cpp
for (const string &key1 : realKeys) {
    // Проверяем с начала
}
```

### Итерация с конца

```cpp
for (auto it = copy.rbegin(); it != copy.rend(); ++it) {
    // Проверяем с конца
}
```

### Проверка наличия элемента в `set`

```cpp
if (uniqChars.find(c) == uniqChars.end()) {
    if (result.find(key1) == result.end()) {
        // Если ключ отсутствует, добавить пустой вектор
    }
}
```

## 8. Разбиение строк

### Разбиение по пробелам с `getline`

```cpp
#include <sstream>
string line;
getline(cin, line);
stringstream ss(line);
string type, transaction, element;
ss >> type >> transaction >> element;
```

### Разбиение строки на вектор слов

```cpp
istringstream iss(command);
vector<string> realCommand;
string word;
while (iss >> word) {
    realCommand.push_back(word);
}
```

## 9. Хэш-таблицы

- Если ключ типа `int`, вставка и удаление выполняются за `O(1)`.

## 10. Пример структуры `MapNote`

```cpp
struct MapNote {
    int hash;
    string value;
    int count;
};
```

## 11. Обучение с подкреплением (Reinforcement Learning)

- **Agent** (Агент)
- **Reward Function** (Функция награды):
  ```cpp
  double reward(State s, Action a);
  ```
- **Action Policy** (Политика действий):
  ```cpp
  Action policy(Observation o);
  ```

## 12. Финансовые, ресурсные и экологические бюджеты

- **Финансовый бюджет** → 500
- **Ресурсный бюджет** → 10
- **Экологический бюджет** → 50
- **Опции** → 4

------------------------

## Aggregation and Composition

### Key Concepts

- **Aggregating object** (owner) - an object that contains another object.
- **Aggregating class** - a class that contains another object.
- **Aggregated object** (subordinate) - an object contained within another object.
- **Aggregated class** - the class of the subordinate object.

### Differences Between Aggregation and Composition

- **Composition** - when one object (1) depends on another (2). Example: `Student` and `Name`, where `Name` depends on
  `Student`.
- **Aggregation** - when objects can exist independently. Example: `Address` and `Student`, where `Address` does not
  depend on `Student`.

---

## Java Learning Plan

1. **Java Basics**: variables, operators, primitive types.
2. **Arrays**: one-dimensional and multi-dimensional, `Arrays` class.
3. **OOP Basics**: introduction, principles, packages, var-arg methods, overloading, overriding.
4. **Classes and Interfaces**: `Object`, `Enum`, nested classes, generics, abstract classes.
5. **Exception Handling**: exceptions and their handling.
6. **Working with Strings**: `String`, `StringBuilder`, `StringBuffer`, text blocks.
7. **Collections**: `List`, `Deque`, `Set`, `Map`, `Collections` class.
8. **Functional Programming in Java 8**: lambda expressions, functional interfaces, method references.
9. **Collectors in Java 8**.
10. **Java IO**: working with console, `Scanner`, `Formatter`, input/output streams.
11. **File I/O**: reading/writing files, streams.

🔗 [Full Java roadmap](https://github.com/borymskyi/roadmap-java-sng?tab=readme-ov-file#java-core)

---

# 18.03.2025

## Java Editions

1. **Java SE (Standard Edition)** - standard desktop applications.
2. **Java EE (Enterprise Edition)** - enterprise applications.
3. **Java ME (Micro Edition)** - mobile applications.

### Core Java Components

- **javac** - compiler (translates source code into bytecode).
- **JVM (Java Virtual Machine)** - executes bytecode.
- **JRE (Java Runtime Environment)** - JVM + libraries.
- **JDK (Java Development Kit)** - JRE + development tools.
- **IDE (Integrated Development Environment)**: Eclipse, IntelliJ IDEA, NetBeans.

Execution process:

```plaintext
Text (Hello, World!) -> Source Code (HelloWorld.java) -> Bytecode (HelloWorld.class) -> Machine Code (HelloWorld.exe)
```

---

## Lesson 4: Classes and Objects

### Example Code:

```java
public class Practice {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1; // Two references to the same object

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

---

# 20.03.2025

## Spring App

### `pom.xml`

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

### `application.properties` Configuration

1. SQL connection.
2. Hibernate query logging.
3. Admin password.

### Spring App Architecture

#### Road 1 (Classic Structure):

1. `model` → `UserEntity` (database entity).
2. `dto` → `User` (data transfer object).
3. `controller` → `UserController` (`@RestController`, API methods).
4. `service` → `UserService` (`@Service`, business logic).
5. `repository` → `UserRepository` (`JpaRepository<UserEntity, UUID>`).

#### Road 2 (Implementing createUser):

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

Additional:

- `application.properties`: `spring.jpa.hibernate.ddl-auto=update` (automatic table creation).
- `compose.yml`: `ports` (database connection).
- `scripts/init.sql`: database initialization.

---

# 21.03.2025

## Codewars: BattleShip Task (Maps)

### Useful `Map` Methods:

```java
Map<String, Integer> map = new HashMap<>(); // Stored in heap
Map<String, Integer> map = new LinkedHashMap<>(); // Maintains order
Map<String, Integer> map = new TreeMap<>(); // Sorted
map.put("Alice", 1);
map.put("Bob", 2);
map.put("Charlie", 3);
map.get("Alice"); // берет что внутри Alice
map.containsKey("Alice"); // true
map.remove("Alice"); // remove
map.keySet(); // all keys
map.values(); // all values
map.getOrDefault("Alice", 0); // 1
```

### Using `Set`

```java
Set<String> set = new HashSet<>(); // Stored in heap
Set<String> set = new LinkedHashSet<>(); // Maintains order
Set<String> set = new TreeSet<>(); // Sorted
```

## Spring Boot

1. `scripts/init.sql` - database initialization.
2. `application.properties` - SQL connection, Hibernate logging.
3. `config/SecurityConfig` - security configuration (to send requests to `/api` without authentication).
   It all comes down to creating roles in Spring Security.
4. send a POST request to `http://localhost:8080/api/users` with JSON body:

```json
{
  "username": "wasja8986",
  "password": "123456789",
  "name": "Wasja",
  "surname": "Pupkin",
  "balance": "125.3"
}
```

5. get all users with a GET request to `http://localhost:8080/api/users`.
6. write tests
7. check test separately
8. check fully `mvn package`

# 22.03.2025

## 1. Constructors, 2. Methods, 3. Parameters, 4. Arguments, 5. Overloading methods 6. Overloading constructors 7. Packages

void sum (int a, int b) - parameters
sum (1, 2) - arguments

### `@Overloading` methods

different parameters and that allows us to use the same method name

```java
    public static void sum(int a, int b) {
    System.out.println(a + b);
}

public static void sum(int a, int b, int c) {
    System.out.println(a + b + c);
}
```

### `@Overloading` constructors

firstly write the long constructor and then write the short constructor by calling the long constructor

```java
    public User(String username, String password, String name, String surname, double balance) {
    this.username = username;
    this.password = password;
    this.name = name;
    this.surname = surname;
    this.balance = balance;
}

public User(String name, String surname) {
    this(null, null, name, surname, 0.0);
}
```

### Access Modifiers `public`, `protected`, `default`, `private`

1. `public` - accessible from anywhere.
2. `protected` - accessible within the same package and subclasses.
3. `default` - accessible within the same package.
4. `private` - accessible within the same class.

# 23.03.25

## Spring Boot

1. Inverson of Control (IoC) - The principle of IoC is to invert the control of the flow of the program. Instead of the
   programmer controlling the flow of the program, the framework controls it.
2. Application Context - The Application Context is the central interface within a Spring application for providing
   configuration information to the application.
3. Dependency Injection - (Внедрение зависимостей) это процесс предоставления внешней зависимости программному
   компоненту.
    1. Example without DI:
    ```java
    class Engine {
    public void start() {
        System.out.println("Двигатель запущен!");
    }
 
    class Car {
    private Engine engine = new Engine(); // class Car creates an instance of Engine

    public void drive() {
        engine.start();
        System.out.println("Машина поехала!");
    }


    public class Main {
        public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        }
    }
    }
    }
    ```
    2. Example with DI:
    ```java
    interface Engine {
    void start();
    }

    class PetrolEngine implements Engine {
        @Override
    public void start() {
        System.out.println("Бензиновый двигатель запущен!");
    }
    }

    class ElectricEngine implements Engine {
        @Override
        public void start() {
            System.out.println("Электрический двигатель запущен!");
        }
    }

    class Car {
        private Engine engine;

        public Car(Engine engine) { // Engine внедряется извне
            this.engine = engine;
        }

        public void drive() {
            engine.start();
            System.out.println("Машина поехала!");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Engine engine = new PetrolEngine(); // Выбор двигателя извне
            Car car = new Car(engine);
            car.drive();

            Engine electricEngine = new ElectricEngine();
            Car electricCar = new Car(electricEngine);
            electricCar.drive();
        }
    }

4. Dependency Injection:
    1. Constructor Injection - внедрение зависимости через конструктор.
        1. Example:
       ```java
         public class UserService {
             private final UserRepository userRepository;
 
             @Autowired
             public UserService(UserRepository userRepository) {
                 this.userRepository = userRepository;
             }
 
             
         }
         ``` 
    2. Setter Injection - внедрение зависимости через сеттер.
        1. Example:
       ```java
         public class UserService {
             private UserRepository userRepository;
 
             public void setUserRepository(UserRepository userRepository) {
                 this.userRepository = userRepository;
             }
         }
         ```
    3. Field Injection - внедрение зависимости через поле.
        1. Example:
       ```java
         public class UserService {
             @Autowired
             private UserRepository userRepository;
         }
         ```

5. After integration `UserService` to Spring container then `UserService` also becomes a `@Bean` and we can use it in
   other classes.

## 24.03.25

### Spring Boot @Qualifier, @Primary, @Lazy

1. `@Qualifier` - to take a specific bean when there are multiple beans of the same type. 
    1. Example:
   ```java
    @Autowired
    @Qualifier("petrolEngine")
    private Engine engine;
   ```
2. `@Primary` - to mark a bean with higher priority when there are multiple beans of the same type.
    1. Example:
   ```java
    @Bean
    @Primary
    public Engine petrolEngine() {
        return new PetrolEngine();
    }
   ```
    There's a problem with circular dependencies when two classes depend on each other. To solve this problem, we can do
1. Use `setter injection` instead of constructor injection.
    example:
   ```java
    public class ClassA {
        private ClassB b;
 
        @Autowired
        public void setB(ClassB b) {
            this.b = b;
        }
    }
   ```
2. User `@Lazy` annotation on one of the classes to create a proxy object and inject it when needed.
    example:
   ```java
    @Component
    public class ClassA {
        private ClassB b;
 
        @Autowired
        public ClassA(@Lazy ClassB b) {
            this.b = b;
        }
    }
   ```
`@Lazy` - to solve `circular dependencies` (`ClassA` depends on `ClassB` and `ClassB` depends on `ClassA`).
It tells Spring to create a proxy object and inject it when needed.

# 25.03.25
## Spring Boot @Scope, @Singleton, @Prototype. 
1. `@Scope("singleton")` - beans are created once and shared across the application.
   1. same links if we check task1 and task2
2. `@Scope("prototype")` - beans are created each time they are requested.
   2. different links if we check task1 and task2

# 27.03.25
## Bean Lifecycle @PostConstruct, @PreDestroy
1. `@PostConstruct` - method is called after the bean is created and dependencies are injected.
2. `@PreDestroy` - method is called before the bean is destroyed 
   2. `@Scope("singleton")` - in application context, `@PreDestroy` is called automatically
   2. `@Scope("prototype")` - in not application context, `@PreDestroy` we should call manually
3. 

1. Запуск приложения
2. Старт контейнера
3. Создание бинов
4. Внедрение зависимостей
5. Вызов метода init 
6. бин готов
7. РАБОТА ПРИЛОЖЕНИЯ
8. Вызов метода destroy
9. Закрытие контейнера

## Properties 
1. We use different properties files for different environments.
   1. for example: `application-dev.properties`, `application-test.properties`, `application-prod.properties`
2. In properties files we use _**Spring Expression Language**_ (SpEL) to inject values.
   2. Example:
   ```java
    import org.springframework.beans.factory.annotation.Value;@Value("${app.name}") // for primitive types
     
    @Value("${task.name}")
    private String name;

    @Value("${task.duration}")
    private Long duration;

    @Value("#{'${list.values}'.split(',')}")
    private List<Integer> values;

    @Value("#{'${set.values}'.split(',')}")
    private List<String> setValues;

    @Value("#{'${map.values}'.split(',')}")
    private Map<String, Integer> mapValues;
    
    // in properties file shoudl be
    task.name= "main-task"
    task.duration= 120
    
    list.values= 123,456,789
    set.values= abc,def,ghi
    map.values= {key1: 200,key2: 300}
   ```
# 28.03.25
## `final` and `static` keywords
1. `final` - constant value, cannot be changed.
2. `static` - belongs to the class, not to the object. (for example to count how many objects were created)
    2. We can call `static` methods without creating an object.
    2. We can call `static` methods from another class
    3. We can't use `non-static` variables and methods in `static` methods
    4. We can using class name to call `static` methods
3. If variable is `static` and `final` then it should be initialized in the class, example:
```java
public class User {
    private static final String DEFAULT_NAME = "John Doe";
    private static final int DEFAULT_AGE = 18;
}
```

# 29.03.25
## Spring Boot, Spring AOP
1. `@Aspect` - to mark a class as an aspect.
2. `@Before` - to mark a method as a before advice.
3. `@After` - to mark a method as an after advice.

# 19.04.25
## Inheritance 
1. `this` - in constructor to call another constructor from current class
   1. this(1, 2) - calls constructor with 1 and 2 parameters
2. `super` - in constructor to call constructor from parent class
   1. super(1, 2) - calls constructor with 1 and 2 parameters from parent class

# 21.04.25
## Inheritance chain
1. `Object` -> `Parent` -> `Child`

## Access Modifiers
`private` - only in the same class
`protected` - in the same package and subclasses
`default` - in the same package
`public` - everywhere

# Polymorphism Раннее и Позднее связывание в Java

## Раннее связывание (Early Binding / Static Binding)

**Определение:** Происходит **на этапе компиляции**. Компилятор определяет, какой именно код будет выполнен, основываясь на **типе ссылки**. Применяется к полям, `static`, `final` и `private` методам, так как они либо не могут быть переопределены полиморфно, либо их доступ ограничен.

**Пример кода (поля, static и final методы):**

```java
// --- Классы для демонстрации раннего связывания ---
class ParentEarly {
    // Поле - связывание происходит по типу ссылки
    String type = "Parent";

    // Static метод - связывание происходит по типу ссылки
    static void printStatic() {
        System.out.println("Parent Static Method");
    }

    // Final метод - нельзя переопределить, связывание раннее
    final void printFinal() {
        System.out.println("Parent Final Method");
    }

    // Private метод - доступен только здесь, связывание раннее
    private void printPrivate() {
         System.out.println("Parent Private Method");
    }

    // Для примера вызова private метода
    public void callPrivateFromParent() {
        printPrivate();
    }
}

class ChildEarly extends ParentEarly {
    // Скрывает поле 'type' из ParentEarly (не переопределяет!)
    String type = "Child";

    // Скрывает static метод из ParentEarly (не переопределяет!)
    static void printStatic() {
        System.out.println("Child Static Method");
    }

    // Нельзя переопределить printFinal() и printPrivate()
}

// --- Класс для демонстрации вызовов ---
class MainEarlyBinding {
    public static void main(String[] args) {
        ParentEarly parentRefToParent = new ParentEarly(); // Ссылка ParentEarly -> Объект ParentEarly
        ParentEarly parentRefToChild = new ChildEarly();   // Ссылка ParentEarly -> Объект ChildEarly (Полиморфизм)
        ChildEarly childRefToChild = new ChildEarly();     // Ссылка ChildEarly -> Объект ChildEarly

        System.out.println("--- Раннее связывание (поля) ---");
        // Доступ к полям определяется типом ссылки (компилятором)
        System.out.println("parentRefToParent.type: " + parentRefToParent.type); // Ожидается: Parent
        System.out.println("parentRefToChild.type: " + parentRefToChild.type);   // Ожидается: Parent (по типу ссылки!)
        System.out.println("childRefToChild.type: " + childRefToChild.type);     // Ожидается: Child

        System.out.println("\n--- Раннее связывание (static методы) ---");
        // Вызов static методов через ссылки определяется типом ссылки (компилятором)
        parentRefToParent.printStatic(); // Ожидается: Parent Static Method
        parentRefToChild.printStatic();   // Ожидается: Parent Static Method (по типу ссылки!)
        childRefToChild.printStatic();     // Ожидается: Child Static Method
        // (Предпочтительный способ вызова static: ParentEarly.printStatic(); ChildEarly.printStatic();)

        System.out.println("\n--- Раннее связывание (final методы) ---");
        // Вызов final методов определяется типом ссылки (компилятором), т.к. нет переопределения
        parentRefToParent.printFinal(); // Ожидается: Parent Final Method
        parentRefToChild.printFinal();   // Ожидается: Parent Final Method
        childRefToChild.printFinal();     // Ожидается: Parent Final Method

        System.out.println("\n--- Раннее связывание (private методы) ---");
        // Private методы доступны только внутри своего класса.
        // Связывание происходит на этапе компиляции внутри класса ParentEarly.
        parentRefToParent.callPrivateFromParent(); // Ожидается: Parent Private Method
        // parentRefToChild.printPrivate(); // Ошибка компиляции - private метод недоступен
        // childRefToChild.printPrivate();  // Ошибка компиляции - private метод недоступен
    }
}
```

## Позднее связывание (Late Binding / Dynamic Binding)
**Определение:** Происходит **на этапе выполнения**. Компилятор не знает, какой именно код будет выполнен, пока программа не запустится. Применяется к `virtual` и `override` методам, так как они могут быть переопределены в подклассах.
**Пример кода (методы):**

```java
// --- Классы для демонстрации позднего связывания ---
class ParentLate {
    // Метод, который будет переопределён в подклассе
    void print() {
        System.out.println("Parent Method");
    }
}
class ChildLate extends ParentLate {
    // Переопределение метода из родительского класса
    @Override
    void print() {
        System.out.println("Child Method");
    }
}
// --- Класс для демонстрации вызовов ---
class MainLateBinding {
    public static void main(String[] args) {
        ParentLate parentRefToParent = new ParentLate(); // Ссылка ParentLate -> Объект ParentLate
        ParentLate parentRefToChild = new ChildLate();   // Ссылка ParentLate -> Объект ChildLate (Полиморфизм)
        ChildLate childRefToChild = new ChildLate();     // Ссылка ChildLate -> Объект ChildLate

        System.out.println("--- Позднее связывание (методы) ---");
        // Вызов методов определяется типом объекта (на этапе выполнения)
        parentRefToParent.print(); // Ожидается: Parent Method
        parentRefToChild.print();   // Ожидается: Child Method (по типу объекта!)
        childRefToChild.print();     // Ожидается: Child Method
    }
}
```

## The keyword `instanceof`
**Определение:** Используется для проверки, является ли объект экземпляром определённого класса или интерфейса. Возвращает `true` или `false`.
**Пример кода:**

```java
// --- Классы для демонстрации instanceof ---
class ParentInstanceOf {
    void print() {
        System.out.println("Parent Method");
    }
}
class ChildInstanceOf extends ParentInstanceOf {
    @Override
    void print() {
        System.out.println("Child Method");
    }
}
// --- Класс для демонстрации вызовов ---
class MainInstanceOf {
    public static void main(String[] args) {
        ParentInstanceOf parent = new ParentInstanceOf();
        ChildInstanceOf child = new ChildInstanceOf();

        System.out.println("--- instanceof ---");
        // Проверка типа объекта
        System.out.println("parent instanceof ParentInstanceOf: " + (parent instanceof ParentInstanceOf)); // true
        System.out.println("child instanceof ChildInstanceOf: " + (child instanceof ChildInstanceOf)); // true
        System.out.println("child instanceof ParentInstanceOf: " + (child instanceof ParentInstanceOf)); // true
        System.out.println("parent instanceof ChildInstanceOf: " + (parent instanceof ChildInstanceOf)); // false
    }
}
```

# 22.04.25
## Methods `equals`, `hashCode`, `toString`
1. `equals` - сравнение объектов по содержимому.
2. `hashCode` - возвращает хэш-код объекта, используется в коллекциях.
3. `toString` - возвращает строковое представление объекта.

Да `hashCode` возвращает одинаковое значение для одинаковых объектов.
А если возвращает константное значение, то:
Но это очень плохая идея, потому что она убивает производительность 
HashMap, HashSet и других хэш-коллекций. 
Все объекты попадут в одну корзину, и поиск/вставка/удаление станут медленными `(O(n)` вместо `O(1))`.

## `@Override` annotation
1. Используется для переопределения методов родительского класса.