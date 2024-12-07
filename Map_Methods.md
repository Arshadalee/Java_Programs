# 1. Common Map Methods in Java.
## 1.1. put(K key, V value)
Adds a key-value pair to the map. If the key already exists, the value will be updated.
java
### code
Map<String, String> map = new HashMap<>();
map.put("A", "Apple");
map.put("B", "Banana");
map.put("C", "Cherry");
## 1.2. get(Object key)
Retrieves the value associated with the given key.
java
### Copy code
String value = map.get("B"); // Returns "Banana"
## 1.3. containsKey(Object key)
Checks if the map contains the specified key.
java
### Copy code
boolean hasKey = map.containsKey("A"); // Returns true
## 1.4. containsValue(Object value)
Checks if the map contains the specified value.
java
### Copy code
boolean hasValue = map.containsValue("Apple"); // Returns true
## 1.5. remove(Object key)
Removes the key-value pair associated with the specified key.
java
### Copy code
map.remove("B"); // Removes the entry with key "B"
## 1.6. size()
Returns the number of key-value pairs in the map.
java
### Copy code
int size = map.size(); // Returns 2 if "B" was removed
## 1.7. isEmpty()
Checks if the map is empty (i.e., it contains no key-value pairs).
java
### Copy code
boolean isEmpty = map.isEmpty(); // Returns false
## 1.8. clear()
Removes all key-value pairs from the map.
java
### Copy code
map.clear(); // Clears all entries
## 1.9. keySet()
Returns a Set of all the keys in the map.
java
### Copy code
Set<String> keys = map.keySet(); // Returns a Set of all keys
## 1.10. values()
Returns a Collection of all the values in the map.
java
### Copy code
Collection<String> values = map.values(); // Returns a Collection of all values
## 1.11. entrySet()
Returns a Set of Map.Entry objects, which represent the key-value pairs in the map.
java
### Copy code
Set<Map.Entry<String, String>> entries = map.entrySet();
for (Map.Entry<String, String> entry : entries) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
## 1.12. putIfAbsent(K key, V value)
Adds the key-value pair only if the key does not already exist in the map.
java
### Copy code
map.putIfAbsent("A", "Apple");  // Does nothing because "A" already exists
map.putIfAbsent("D", "Durian"); // Adds "D" = "Durian"
1.13. replace(K key, V oldValue, V newValue)
Replaces the value for the specified key only if it is currently mapped to the specified old value.
java
### Copy code
map.replace("A", "Apple", "Apricot"); // Replaces "Apple" with "Apricot"
## 1.14. replace(K key, V value)
Replaces the value for the specified key, regardless of the current value.
java
### Copy code
map.replace("C", "Cantaloupe"); // Replaces "Cherry" with "Cantaloupe"
## 1.15. forEach(BiConsumer<? super K,? super V> action)
Iterates over each key-value pair and applies the specified action (a lambda function).
java
### Copy code
map.forEach((key, value) -> System.out.println(key + " = " + value));
## 1.16. compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
Computes a new value for the given key based on its current value.
java
### Copy code
map.compute("A", (key, value) -> value + " Fruit");
## 1.17. merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
Merges the value of the given key with a new value using a remapping function.
java
### Copy code
map.merge("A", "Red", (oldValue, newValue) -> oldValue + " " + newValue); // Concatenates 
