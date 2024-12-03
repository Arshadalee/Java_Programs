# **Java String method**:


## 1)charAt(int index):
      Returns the character at the specified index.
## 2.toCharArray(): 
    Converts the string to a character array.
## 3.codePointAt(int index):
      Returns the code point at the specified index.
## 4.codePointBefore(int index):
            Returns the code point before the specified index.
## 5.codePointCount(int beginIndex, int endIndex):
            Returns the number of code points between the specified indices.
## 6.offsetByCodePoints(int index, int codePointOffset):
            Returns the index within this String that is offset from the given index by codePointOffset code points.   
            
String Comparison:

compareTo(String anotherString): Compares two strings lexicographically.
compareToIgnoreCase(String anotherString): Compares two strings lexicographically, ignoring case differences.   
equals(Object obj): Compares this string to another object.
equalsIgnoreCase(String anotherString): Compares two strings lexicographically, ignoring case differences.
Searching and Matching:

contains(CharSequence s): Checks if a specified sequence of char values is a substring.
endsWith(String suffix): Checks if a string ends with a specified suffix.
indexOf(String str): Returns the index of the first occurrence of a specified substring.
indexOf(String str, int fromIndex): Returns the index of the first occurrence of a specified substring, starting from a specified index.
lastIndexOf(String str): Returns the index of the last occurrence of a specified substring.
lastIndexOf(String str, int fromIndex): Returns the index of the last occurrence of a specified substring, searching backward starting from the specified index.
matches(String regex): Tells whether or not this string matches a given regular expression.
regionMatches(int toffset, String other, int ooffset, int len): Compares two strings for equality, starting at the specified offset.
regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len): Compares two strings for equality, starting at the specified offset, ignoring case differences.
startsWith(String prefix): Checks if a string starts with a specified prefix.
Modification and Transformation:

concat(String str): Concatenates two strings.
replace(char oldChar, char newChar): Replaces all occurrences of a specified character with another character.
replaceAll(String regex, String replacement): Replaces all occurrences of a regular expression with a replacement string.
replaceFirst(String regex, String replacement): Replaces the first occurrence of a regular expression with a replacement string.
split(String regex): Splits a string around matches of a given regular expression.
subSequence(int beginIndex, int endIndex): Returns a new character sequence that is a subsequence of this sequence.
substring(int beginIndex): Returns a new string that is a substring of this string, starting at the specified index.   
substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string, starting at the specified beginIndex and extending to the character at index endIndex - 1.   
toLowerCase(): Converts a string to lowercase.
toUpperCase(): Converts a string to uppercase.
trim(): Removes leading and trailing whitespace.
Other Useful Methods:

isEmpty(): Checks if a string is empty.
length(): Returns the length of a string.
valueOf(various types): Converts various data types to strings.
