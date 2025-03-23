# Java Streams Guide

## Introduction
Java Streams API provides a powerful way to process collections of data efficiently using functional programming concepts. Streams allow for functional-style operations such as filtering, mapping, and reducing data in a declarative way.

Streams operate in two stages:
1. **Intermediate Operations** – Transform or filter the data (lazy evaluation).
2. **Terminal Operations** – Produce a result or a side effect (triggers execution).

---

## 1. Intermediate Operations
Intermediate operations return another stream and are lazily executed, meaning they do not process data until a terminal operation is invoked.

### **1.1 filter()**
Filters elements based on a condition.
```java
List<String> names = Arrays.asList("Alice", "Bob", "Anna", "John");
List<String> filteredNames = names.stream()
                                 .filter(name -> name.startsWith("A"))
                                 .collect(Collectors.toList());
System.out.println(filteredNames); // Output: [Alice, Anna]
```

### **1.2 map()**
Transforms each element in a stream.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> squaredNumbers = numbers.stream()
                                      .map(n -> n * n)
                                      .collect(Collectors.toList());
System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
```

### **1.3 flatMap()**
Flattens a stream of collections into a single stream.
```java
List<List<Integer>> nestedList = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5),
    Arrays.asList(6, 7, 8)
);
List<Integer> flattenedList = nestedList.stream()
                                        .flatMap(List::stream)
                                        .collect(Collectors.toList());
System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
```

### **1.4 distinct()**
Removes duplicate elements.
```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
List<Integer> distinctNumbers = numbers.stream()
                                       .distinct()
                                       .collect(Collectors.toList());
System.out.println(distinctNumbers); // Output: [1, 2, 3, 4, 5]
```

### **1.5 sorted()**
Sorts elements in natural order or custom order.
```java
List<String> names = Arrays.asList("John", "Alice", "Bob");
List<String> sortedNames = names.stream()
                                .sorted()
                                .collect(Collectors.toList());
System.out.println(sortedNames); // Output: [Alice, Bob, John]
```

---

## 2. Terminal Operations
Terminal operations produce a result or side-effect and trigger stream execution.

### **2.1 count()**
Counts the number of elements in a stream.
```java
long count = names.stream()
                  .filter(name -> name.startsWith("A"))
                  .count();
System.out.println(count); // Output: 2
```

### **2.2 collect()**
Converts the stream into a collection.
```java
List<String> filteredNames = names.stream()
                                 .filter(name -> name.startsWith("A"))
                                 .collect(Collectors.toList());
System.out.println(filteredNames); // Output: [Alice, Anna]
```

### **2.3 forEach()**
Iterates over each element in the stream.
```java
names.stream()
     .forEach(System.out::println);
```

### **2.4 reduce()**
Aggregates elements into a single value.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
System.out.println(sum); // Output: 15
```

### **2.5 anyMatch(), allMatch(), noneMatch()**
Checks conditions on elements.
```java
boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
boolean allStartWithA = names.stream().allMatch(name -> name.startsWith("A"));
boolean noneStartWithZ = names.stream().noneMatch(name -> name.startsWith("Z"));

System.out.println(anyStartsWithA); // true
System.out.println(allStartWithA); // false
System.out.println(noneStartWithZ); // true
```

---

## Summary
| **Operation Type** | **Method** |
|------------------|------------------|
| **Intermediate** | filter(), map(), flatMap(), distinct(), sorted() |
| **Terminal** | count(), collect(), forEach(), reduce(), anyMatch(), allMatch(), noneMatch() |

This guide provides an overview of Java Streams, focusing on intermediate and terminal operations. Happy coding! 🚀

