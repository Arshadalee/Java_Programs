## 1. Sorting
Collections.sort(List<T> list): Sorts the specified list into ascending order according to the natural ordering of its elements.

#### code
import java.util.*;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 7));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);  // Output: [1, 3, 5, 7, 8]
    }
}
Collections.sort(List<T> list, Comparator<? super T> c): Sorts the specified list into ascending order according to the order induced by the specified comparator.

java
####  code
import java.util.*;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Date"));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Sorted List (Descending): " + list);  // Output: [Date, Cherry, Banana, Apple]
    }
}
## 2. Reversing
Collections.reverse(List<?> list): Reverses the order of the elements in the specified list.

java
####  code
import java.util.*;

public class CollectionsReverseExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);  // Output: [5, 4, 3, 2, 1]
    }
}
## 3. Shuffling
Collections.shuffle(List<?> list): Randomly permutes the elements in the specified list.

###  code
import java.util.*;

public class CollectionsShuffleExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);  // Output: Random order, e.g., [4, 1, 5, 2, 3]
    }
}
## 4. Searching
Collections.binarySearch(List<? extends Comparable<? super T>> list, T key): Searches for the specified object in the sorted list using the binary search algorithm. The list must be sorted before applying this method.


#### code
import java.util.*;

public class CollectionsBinarySearchExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int index = Collections.binarySearch(list, 3);
        System.out.println("Index of 3: " + index);  // Output: 2
    }
}
## 5. Frequency Count
Collections.frequency(Collection<?> c, Object o): Returns the number of occurrences of the specified element in the collection.
#### code
import java.util.*;

public class CollectionsFrequencyExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
        int frequency = Collections.frequency(list, 3);
        System.out.println("Frequency of 3: " + frequency);  // Output: 3
    }
}
## 6. Min and Max
Collections.min(Collection<? extends T> coll): Returns the minimum element in the specified collection according to the natural ordering of its elements.

Collections.max(Collection<? extends T> coll): Returns the maximum element in the specified collection according to the natural ordering of its elements.

java
#### Copy code
import java.util.*;

public class CollectionsMinMaxExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 40, 15));
        System.out.println("Min value: " + Collections.min(list));  // Output: 5
        System.out.println("Max value: " + Collections.max(list));  // Output: 40
    }
}
## 7. Copying
Collections.copy(List<? super T> dest, List<? extends T> src): Copies all elements from the source list to the destination list. The destination list must be large enough to hold the elements from the source list.

java
#### Copy code
import java.util.*;

public class CollectionsCopyExample {
    public static void main(String[] args) {
        List<String> src = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        
        Collections.copy(dest, src);
        System.out.println("Destination List after copying: " + dest);  // Output: [Apple, Banana, Cherry]
    }
}
## 8. Swapping Elements
Collections.swap(List<?> list, int i, int j): Swaps the elements at the specified positions in the list.

java
#### Copy code
import java.util.*;

public class CollectionsSwapExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Collections.swap(list, 0, 2);
        System.out.println("List after swapping: " + list);  // Output: [Cherry, Banana, Apple]
    }
}
## 9. Singleton Collection
Collections.singleton(T o): Returns an immutable set containing only the specified object.

java
#### Copy code
import java.util.*;

public class CollectionsSingletonExample {
    public static void main(String[] args) {
        Set<String> set = Collections.singleton("Apple");
        System.out.println("Singleton Set: " + set);  // Output: [Apple]
    }
}
## 10. Unmodifiable Collections
Collections.unmodifiableList(List<? extends T> list): Returns an unmodifiable view of the specified list.

Collections.unmodifiableSet(Set<? extends T> s): Returns an unmodifiable view of the specified set.

Collections.unmodifiableMap(Map<? extends K, ? extends V> m): Returns an unmodifiable view of the specified map.

java
#### Copy code
import java.util.*;

public class CollectionsUnmodifiableExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        
        // Throws UnsupportedOperationException
        // unmodifiableList.add("Date");
    }
}
## 11. Empty Collections
Collections.emptyList(): Returns an empty list (immutable).

Collections.emptySet(): Returns an empty set (immutable).

Collections.emptyMap(): Returns an empty map (immutable).

java
#### Copy code
import java.util.*;

public class CollectionsEmptyExample {
    public static void main(String[] args) {
        List<String> emptyList = Collections.emptyList();
        Set<String> emptySet = Collections.emptySet();
        Map<String, String> emptyMap = Collections.emptyMap();

        System.out.println("Empty List: " + emptyList);  // Output: []
        System.out.println("Empty Set: " + emptySet);    // Output: []
        System.out.println("Empty Map: " + emptyMap);    // Output: {}
    }
}
## 12. Synchronizing Collections
Collections.synchronizedList(List<T> list): Returns a synchronized (thread-safe) list backed by the specified list.

Collections.synchronizedSet(Set<T> s): Returns a synchronized (thread-safe) set backed by the specified set.

Collections.synchronizedMap(Map<K, V> m): Returns a synchronized (thread-safe) map backed by the specified map.

java
#### Copy code
import java.util.*;

public class CollectionsSynchronizedExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> syncList = Collections.synchronizedList(list);
        
        // Use the synchronized list in a thread-safe manner
    }
}
