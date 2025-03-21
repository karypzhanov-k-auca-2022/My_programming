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
- **Composition** - when one object (1) depends on another (2). Example: `Student` and `Name`, where `Name` depends on `Student`.
- **Aggregation** - when objects can exist independently. Example: `Address` and `Student`, where `Address` does not depend on `Student`.

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

map.get("Alice"); // 1
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