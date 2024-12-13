## 1. add(E element)
### Adds the specified element to the end of the ArrayList.


public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println(list); // Output: [Apple]
    }
}
## 2. add(int index, E element)
### Inserts the specified element at the specified position in the ArrayList.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add(0, "Banana");
        System.out.println(list); // Output: [Banana, Apple]
    }
}
## 3. get(int index)
### Returns the element at the specified position.

;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println(list.get(0)); // Output: Apple
    }
}
## 4. set(int index, E element)
### Replaces the element at the specified position with the specified element.

;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.set(0, "Banana");
        System.out.println(list); // Output: [Banana]
    }
}
## 5. remove(int index)
### Removes the element at the specified position.


public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.remove(0);
        System.out.println(list); // Output: []
    }
}
## 6. remove(Object o)
### Removes the first occurrence of the specified element.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove("Apple");
        System.out.println(list); // Output: [Banana]
    }
}
## 7. size()
### Returns the number of elements in the ArrayList.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println(list.size()); // Output: 1
    }
}
## 8. isEmpty()
### Checks if the ArrayList is empty.


public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty()); // Output: true
    }
}
## 9. contains(Object o)
### Checks if the ArrayList contains the specified element.


public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println(list.contains("Apple")); // Output: true
    }
}
## 10. clear()
Removes all elements from the ArrayList.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.clear();
        System.out.println(list); // Output: []
    }
}
## 11. indexOf(Object o)
### Returns the index of the first occurrence of the specified element, or -1 if not found.


public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println(list.indexOf("Apple")); // Output: 0
    }
}
## 12. lastIndexOf(Object o)
### Returns the index of the last occurrence of the specified element, or -1 if not found.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        System.out.println(list.lastIndexOf("Apple")); // Output: 1
    }
}
## 13. toArray()
### Converts the ArrayList into an array.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        Object[] array = list.toArray();
        System.out.println(array[0]); // Output: Apple
    }
}
## 14. addAll(Collection<? extends E> c)
### Adds all elements from the specified collection to the ArrayList.



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Apple", "Banana"));
        System.out.println(list); // Output: [Apple, Banana]
    }
}
## 15. retainAll(Collection<?> c)
Retains only the elements in the ArrayList that are contained in the specified collection.

s;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        list.retainAll(Arrays.asList("Banana", "Cherry"));
        System.out.println(list); // Output: [Banana, Cherry]
    }
}
## 16. removeAll(Collection<?> c)
### Removes all elements from the ArrayList that are contained in the specified collection.

java

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        list.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println(list); // Output: [Cherry]
    }
}
## 17. subList(int fromIndex, int toIndex)
### Returns a view of the portion of the ArrayList between fromIndex (inclusive) and toIndex (exclusive).



public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        List<String> subList = list.subList(1, 3);
        System.out.println(subList); // Output: [Banana, Cherry]
    }
}
