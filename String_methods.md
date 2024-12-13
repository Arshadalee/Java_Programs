
## 1. length()
### Returns the length of the string.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.length()); // Output: 5
    }
}
## 2. charAt(int index)
### Returns the character at the specified index.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(1)); // Output: 'e'
    }
}
## 3. substring(int beginIndex)
### Returns a substring starting from the specified index.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(2)); // Output: "llo"
    }
}
## 4. substring(int beginIndex, int endIndex)
### Returns a substring from beginIndex to endIndex (excluding endIndex).


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(1, 4)); // Output: "ell"
    }
}
## 5. indexOf(char ch)
### Returns the index of the first occurrence of the character.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.indexOf('e')); // Output: 1
    }
}
## 6. indexOf(String str)
### Returns the index of the first occurrence of the substring.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.indexOf("World")); // Output: 6
    }
}
## 7. lastIndexOf(char ch)
### Returns the index of the last occurrence of the character.

e
public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.lastIndexOf('o')); // Output: 7
    }
}
## 8. equals(Object anObject)
### Compares this string to the specified object.


public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // Output: true
    }
}
## 9. equalsIgnoreCase(String anotherString)
### Compares two strings, ignoring case considerations.


public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
    }
}
## 10. toLowerCase()
### Converts all characters in the string to lowercase.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toLowerCase()); // Output: "hello"
    }
}
## 11. toUpperCase()
### Converts all characters in the string to uppercase.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toUpperCase()); // Output: "HELLO"
    }
}
## 12. trim()
### Removes leading and trailing whitespace.


public class StringMethods {
    public static void main(String[] args) {
        String str = "   Hello   ";
        System.out.println(str.trim()); // Output: "Hello"
    }
}
## 13. replace(char oldChar, char newChar)
### Replaces all occurrences of the old character with the new character.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.replace('l', 'p')); // Output: "Heppo"
    }
}
## 14. replace(CharSequence target, CharSequence replacement)
### Replaces all occurrences of the target sequence with the replacement sequence.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.replace("World", "Java")); // Output: "Hello Java"
    }
}
## 15. contains(CharSequence sequence)
### Checks if the string contains the specified sequence.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.contains("World")); // Output: true
    }
}
## 16. startsWith(String prefix)
### Checks if the string starts with the specified prefix.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.startsWith("He")); // Output: true
    }
}
## 17. endsWith(String suffix)
### Checks if the string ends with the specified suffix.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.endsWith("lo")); // Output: true
    }
}
## 18. split(String regex)
### Splits the string around matches of the given regular expression.


public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        System.out.println(words[0]); // Output: "Hello"
    }
}
## 19. join(CharSequence delimiter, CharSequence... elements)
### Joins elements with a delimiter.


public class StringMethods {
    public static void main(String[] args) {
        String result = String.join("-", "Java", "is", "fun");
        System.out.println(result); // Output: "Java-is-fun"
    }
}
## 20. isEmpty()
### Checks if the string is empty.


public class StringMethods {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.isEmpty()); // Output: true
    }
}
## 21. valueOf(Object obj)
### Returns the string representation of the specified object.


public class StringMethods {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(String.valueOf(number)); // Output: "100"
    }
}
