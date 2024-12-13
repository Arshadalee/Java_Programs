## 1. Arrays.toString(array)
### Converts an array to a string representation.


public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4]
    }
}
## 2. Arrays.sort(array)
### Sorts the elements of an array in ascending order.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 3, 2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4]
    }
}
## 3. Arrays.binarySearch(array, value)
### Searches for a value in a sorted array and returns its index, or a negative value if not found.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println(index); // Output: 2
    }
}
## 4. Arrays.equals(array1, array2)
### Checks if two arrays are equal.


public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2)); // Output: true
    }
}
## 5. Arrays.fill(array, value)
### Fills an entire array with the specified value.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7);
        System.out.println(Arrays.toString(numbers)); // Output: [7, 7, 7, 7, 7]
    }
}
## 6. Arrays.copyOf(original, newLength)
### Copies the original array to a new array with the specified length.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] newNumbers = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(newNumbers)); // Output: [1, 2, 3, 0, 0]
    }
}
## 7. Arrays.copyOfRange(original, from, to)
### Copies a specified range of the original array into a new array.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println(Arrays.toString(subArray)); // Output: [2, 3, 4]
    }
}
## 8. Arrays.deepToString(array)
### Returns a string representation of a multidimensional array.



public class ArrayMethods {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix)); // Output: [[1, 2], [3, 4]]
    }
}
## 9. Arrays.deepEquals(array1, array2)
### Checks if two multidimensional arrays are deeply equal.



public class ArrayMethods {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepEquals(matrix1, matrix2)); // Output: true
    }
}
## 10. Arrays.asList(array)
### Converts an array to a fixed-size list.



public class ArrayMethods {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        List<String> nameList = Arrays.asList(names);
        System.out.println(nameList); // Output: [Alice, Bob, Charlie]
    }
}
## 11. Arrays.stream(array)
### Creates a stream from the array for functional-style operations.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        Arrays.stream(numbers).forEach(System.out::println); // Prints: 1 2 3 4
    }
}
## 12. Arrays.hashCode(array)
### Returns the hash code of the array.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.hashCode(numbers)); // Output: hash code (integer value)
    }
}
## 13. Arrays.parallelSort(array)
### Sorts the array using parallel sorting for better performance on large arrays.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 3, 2};
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4]
    }
}
## 14. Arrays.mismatch(array1, array2)
### Finds the index of the first mismatch between two arrays, or returns -1 if they are identical.



public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        System.out.println(Arrays.mismatch(arr1, arr2)); // Output: 2
    }
}
