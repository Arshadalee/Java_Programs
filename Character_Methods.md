# 1. isLetter(char ch)
## Checks if the given character is a letter.


public class CharacterMethods {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(Character.isLetter(ch)); // true
    }
}
# 2. isDigit(char ch)
## Checks if the given character is a digit.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = '5';
        System.out.println(Character.isDigit(ch)); // true
    }
}
# 3. isWhitespace(char ch)
## Checks if the given character is a whitespace character.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = ' ';
        System.out.println(Character.isWhitespace(ch)); // true
    }
}
# 4. isUpperCase(char ch)
## Checks if the given character is an uppercase letter.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(Character.isUpperCase(ch)); // true
    }
}
# 5. isLowerCase(char ch)
## Checks if the given character is a lowercase letter.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(Character.isLowerCase(ch)); // true
    }
}
# 6. toUpperCase(char ch)
## Converts the given character to uppercase.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = 'b';
        System.out.println(Character.toUpperCase(ch)); // 'B'
    }
}
# 7. toLowerCase(char ch)
## Converts the given character to lowercase.
##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = 'C';
        System.out.println(Character.toLowerCase(ch)); // 'c'
    }
}
# 8. isAlphabetic(int codePoint)
## Checks if the character (represented by Unicode code point) is alphabetic.

##
public class CharacterMethods {
    public static void main(String[] args) {
        int codePoint = 'A';
        System.out.println(Character.isAlphabetic(codePoint)); // true
    }
}
# 9. isDefined(char ch)
## Checks if the given character is defined in Unicode.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = '@';
        System.out.println(Character.isDefined(ch)); // true
    }
}
# 10. isLetterOrDigit(char ch)
## Checks if the character is either a letter or a digit.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = '9';
        System.out.println(Character.isLetterOrDigit(ch)); // true
    }
}
# 11. getNumericValue(char ch)
## Returns the numeric value of the character if it is a digit or a numeric letter.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = '7';
        System.out.println(Character.getNumericValue(ch)); // 7
    }
}
# 12. isTitleCase(char ch)
## Checks if the character is a titlecase character.
##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = '\u01C5'; // Latin Capital Letter D with Small Letter Z with Caron
        System.out.println(Character.isTitleCase(ch)); // true
    }
}
# 13. toTitleCase(char ch)
## Converts the character to titlecase if applicable.

##
public class CharacterMethods {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(Character.toTitleCase(ch)); // 'A'
    }
}
# 14. charCount(int codePoint)
## Returns the number of char values needed to represent the specified Unicode code point.

##
public class CharacterMethods {
    public static void main(String[] args) {
        int codePoint = 0x1F600; // 😀 Emoji
        System.out.println(Character.charCount(codePoint)); // 2
    }
}
# 15. toChars(int codePoint)
## Converts a Unicode code point into a char array.

## 
public class CharacterMethods {
    public static void main(String[] args) {
        int codePoint = 0x1F600; // 😀 Emoji
        char[] chars = Character.toChars(codePoint);
        System.out.println(chars); // 😀
    }
